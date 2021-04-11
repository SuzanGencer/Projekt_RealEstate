package model.houses.builder;

import model.houses.EinfamilienHaus;
import model.houses.House;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class EinfamilienHausBuilder extends HouseBuilder {
	public House build() {
		EinfamilienHaus einfamilienHaus = new EinfamilienHaus();
		einfamilienHaus.setId(this.id);
		einfamilienHaus.setArea(this.area);
		einfamilienHaus.setGarage(this.garage);
		einfamilienHaus.setGarten(this.garten);
		einfamilienHaus.setRooms(rooms);
		einfamilienHaus.setHouseState(this.houseState);
		einfamilienHaus.setPrice(this.price);
		return einfamilienHaus;
	}
}
