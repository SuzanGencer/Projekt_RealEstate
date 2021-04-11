package model.houses.builder;

import model.houses.House;
import model.houses.Villa;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class VillaBuilder extends HouseBuilder {
	public House build() {
		Villa villa = new Villa();
		villa.setId(this.id);
		villa.setArea(this.area);
		villa.setGarage(this.garage);
		villa.setGarten(this.garten);
		villa.setRooms(this.rooms);
		villa.setHouseState(this.houseState);
		villa.setPrice(this.price);
		return villa;
	}
}
