package model.houses;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class Villa extends House{
    @Override
    public HouseType getHouseType() {
        return HouseType.VILLA;
    }
}
