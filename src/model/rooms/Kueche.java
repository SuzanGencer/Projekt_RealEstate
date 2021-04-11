package model.rooms;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class Kueche extends Room{
    public Kueche(double area){
        this.area=area;
    }

    @Override
    public RoomType getType() {
        return RoomType.KUECHE;
    }
}
