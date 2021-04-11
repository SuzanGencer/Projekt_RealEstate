package model.houses.builder;

import model.houses.*;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class BungalowBuilder extends HouseBuilder {
	public House build () {
		Bungalow bungalow = new Bungalow();
		bungalow.setId(this.id);
		bungalow.setArea(this.area);
		bungalow.setGarage(this.garage);
		bungalow.setGarten(this.garten);
		bungalow.setRooms(rooms);
		bungalow.setHouseState(this.houseState);
		bungalow.setPrice(this.price);
		return bungalow;
	}
}
