package model.houses;

import model.IMeasurable;
import model.rooms.Room;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public abstract class House implements IMeasurable {
    private double area;
    private String id;
    private boolean garten;
    private boolean garage;
    private double price;
    private List<Room> rooms;
    private HouseState houseState;


    public abstract HouseType getHouseType();

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", id='" + id + '\'' +
                ", garten=" + garten +
                ", garage=" + garage +
                ", price=" + price +
                ", rooms=" + rooms +
                ", houseState=" + houseState +
                ", houstype=" + getHouseType() +
                '}';
    }

    public boolean isGarten() {
        return garten;
    }

    public void setGarten(boolean garten) {
        this.garten = garten;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }
    public boolean addRoom(Room room){
        return rooms.add(room);
    }
    public List<Room> getRooms(){
        return new ArrayList<>(rooms);
    }
    public void setRooms(List<Room> rooms){
        this.rooms=rooms;
    }

    public HouseState getHouseState() {
        return houseState;
    }

    public void setHouseState(HouseState houseState) {
        this.houseState = houseState;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}