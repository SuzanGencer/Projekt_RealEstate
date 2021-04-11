package model.houses;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class EinfamilienHaus extends House {

    @Override
    public HouseType getHouseType() {
        return HouseType.EINFAMILIENHAUS;
    }
}
