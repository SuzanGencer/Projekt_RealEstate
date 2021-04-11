package service;

import model.houses.*;
import java.util.List;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public interface IRealEstateService {
    List<House> getAllHouses();
    List<House> getAllHousesWithTypes(HouseType houseType);
    List<House> getAllHousesWithStatus(HouseState houseState);
    List<House> getAllHousesWithMinArea(double area);
    List<House> getAllHousesWithMaxArea(double area);
    List<House> getAllHousesWithMaxPrice(double price);
    List<House> getAllHousesWithMinPrice(double price);
    void save(House house);
}
