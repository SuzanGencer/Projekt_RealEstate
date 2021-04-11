package states;

import factory.RoomFactory;
import context.Context;
import model.houses.HouseState;
import model.houses.builder.BungalowBuilder;
import model.houses.builder.EinfamilienHausBuilder;
import model.houses.builder.HouseBuilder;
import model.houses.builder.VillaBuilder;
import model.rooms.Room;
import model.rooms.RoomType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class CreateHouseState extends State{
    {
        setStateOptions(Arrays.asList("Select HouseType!","1 - EINFAMILIENHAUS","2 - BUNGALOW","3 - VILLA"));
    }

    @Override
    public void enterKey1(Context context) {
        HouseBuilder houseBuilder=new EinfamilienHausBuilder();
        buildHouse(context,houseBuilder);
        context.setActiveState(new StartState());
    }

    @Override
    public void enterKey2(Context context) {
        HouseBuilder houseBuilder=new BungalowBuilder();
        buildHouse(context,houseBuilder);
        context.setActiveState(new StartState());
    }

    @Override
    public void enterKey3(Context context) {
        HouseBuilder houseBuilder=new VillaBuilder();
        buildHouse(context,houseBuilder);
        context.setActiveState(new StartState());
    }

    @Override
    public void enterKey4(Context context) {
        staySameState();
    }

    @Override
    public void enterKey5(Context context) {
        staySameState();
    }

    @Override
    public void enterKey6(Context context) {
        staySameState();
    }

    @Override
    public void enterKey7(Context context) {
        staySameState();
    }

    @Override
    public void enterKey8(Context context) {
        staySameState();
    }

    @Override
    public void enterYes(Context context) {
        staySameState();
    }

    @Override
    public void enterOtherKeys(Context context) {
        staySameState();
    }

    public void buildHouse(Context context,HouseBuilder houseBuilder){

        //Get id and save
        System.out.println("Id : ");
        context.readLine();
        houseBuilder.id(context.getLine());
        //Get Area
        Area:while(true){
            System.out.println("Area : ");
            context.readLine();
            try {
                houseBuilder.area(Double.parseDouble(context.getLine()));
                break Area;
            }catch (NumberFormatException e){
                System.out.println("Please write a valid number!!!");
            }
        }
        //Garten
        System.out.println("Has Garten? (Please 'y' for yes!)");
        context.readLine();
        houseBuilder.garten(context.getLine().equalsIgnoreCase("y"));
        //Garage
        System.out.println("Has Garage? (Please 'y' for yes!)");
        context.readLine();
        houseBuilder.garage(context.getLine().equalsIgnoreCase("y"));
        List<Room> rooms=new ArrayList<>();
        Room:while(true){
            System.out.println("Add Room (Please 'y' for yes!) ");
            context.readLine();
            if(!context.getLine().equalsIgnoreCase("y")) break Room;

            RoomType roomType;
            System.out.println("1 - ZIMMER \n2 - KUECHE\n3 - BAD)");
            context.readLine();
            switch (context.getLine()){
                case "1": roomType=RoomType.ZIMMER;break;
                case "2": roomType=RoomType.KUECHE;break;
                default: roomType=RoomType.BAD;break;
            }
            double roomArea;
            RoomArea:while(true){
                System.out.println("Area of room: ");
                context.readLine();
                try {
                    roomArea=Double.parseDouble(context.getLine());
                    break RoomArea;
                }catch (NumberFormatException e){
                    System.out.println("Please write a valid number!!!");
                }
            }
            Room room=RoomFactory.getRoom(roomType,roomArea);
            rooms.add(room);
        }
        houseBuilder.rooms(rooms);
        //House Status
        System.out.println("Please select House Status \n1 - MIETE \n2 - KAUF\n3 - WG");
        context.readLine();
        switch (context.getLine()){
            case "1": houseBuilder.houseState(HouseState.MIETE);break;
            case "2":houseBuilder.houseState(HouseState.KAUF);break;
            default:houseBuilder.houseState(HouseState.WG);
        }

        houseBuilder.rooms(rooms);
        //House Status
        System.out.println("Please write price : ");
        context.readLine();
        PRICE:while(true){
            try {
                houseBuilder.price(Double.parseDouble(context.getLine()));
                break PRICE;
            }catch (NumberFormatException e){
                System.out.println("Please write a valid number!!!");
            }
        }
        System.out.println("Your new House created and added to File...");
        System.out.println(houseBuilder.build().toString());
        realEstate.save(houseBuilder.build());
    }
}