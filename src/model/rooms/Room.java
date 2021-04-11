package model.rooms;

import model.IMeasurable;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public abstract class Room implements IMeasurable {
    protected double area;
    public abstract RoomType getType();

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                " type:"+getType().name().toString()+
                '}';
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
