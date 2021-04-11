package factory;

import model.rooms.*;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class RoomFactory {
    public static Room getRoom(RoomType roomType, double area){
        Room room=null;
        switch(roomType){
            case KUECHE: room=new Kueche(area); break;
            case BAD:room=new Bad(area);break;
            case ZIMMER:room=new Zimmer(area);break;
        }
        return room;
    }
}
