package model.houses;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class Bungalow extends House{
    @Override
    public HouseType getHouseType() {
        return HouseType.BUNGALOW;
    }
}