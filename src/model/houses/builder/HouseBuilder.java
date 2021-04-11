package model.houses.builder;

import model.houses.House;
import model.houses.HouseState;
import model.rooms.Room;
import java.util.List;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public abstract class HouseBuilder {
    protected double area;
    protected String id;
    protected boolean garten;
    protected boolean garage;
    protected  double price;
    protected HouseState houseState;
    List<Room> rooms=null;

    public abstract House build();
    public HouseBuilder area(double area){
        this.area=area;
        return this;
    }
    public HouseBuilder garten(boolean garten){
        this.garten=garten;
        return this;
    }

    public HouseBuilder garage(boolean garage){
        this.garage=garage;
        return this;
    }
    public HouseBuilder rooms(List<Room> rooms){
        this.rooms=rooms;
        return this;
    }
    public HouseBuilder houseState(HouseState houseState){
        this.houseState=houseState;
        return this;
    }
    public HouseBuilder price(double price){
        this.price=price;
        return this;
    }
    public HouseBuilder id(String id){
        this.id=id;
        return this;
    }
}
