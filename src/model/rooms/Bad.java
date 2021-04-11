package model.rooms;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class Bad extends Room{
    public Bad(double area){
        setArea(area);
    }

    @Override
    public RoomType getType() {
        return RoomType.BAD;
    }
}
