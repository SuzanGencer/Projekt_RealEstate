package model.rooms;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class Zimmer extends Room {
    public Zimmer(double area){
        this.area=area;
    }

    @Override
    public RoomType getType() {
        return RoomType.ZIMMER;
    }
}
