package service;

import factory.RoomFactory;
import model.houses.*;
import model.houses.builder.*;
import model.rooms.*;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class RealEstate implements IRealEstateService {
	private static RealEstate realEstate = null;
	private String path = "./src/db";
	List<House> houses = new ArrayList<>();
	List<House> activSearch = new ArrayList<>();

	public static RealEstate getInstance() {
		if (realEstate == null) {
			realEstate = new RealEstate();
		}
		return realEstate;
	}

	public List<House> getHouses() {
		return houses;
	}

	public List<House> getActivSearch() {
		return activSearch;
	}

	public void setActivSearch(List<House> list) {
		this.activSearch = new ArrayList<>(list);
	}

	private RealEstate() {
		try {
			File myObj = new File(path);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				readDb(data);
			}
			setActivSearch(houses);
			myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<House> getAllHouses() {
		return houses;
	}

	@Override
	public List<House> getAllHousesWithTypes(HouseType houseType) {
		return activSearch.stream().filter(x -> x.getHouseType() == houseType).collect(Collectors.toList());
	}

	@Override
	public List<House> getAllHousesWithStatus(HouseState houseState) {
		return activSearch.stream().filter(x -> x.getHouseState() == houseState).collect(Collectors.toList());
	}

	@Override
	public List<House> getAllHousesWithMinArea(double area) {
		return activSearch.stream().filter(x -> x.getArea() >= area).collect(Collectors.toList());
	}

	@Override
	public List<House> getAllHousesWithMaxArea(double area) {
		return activSearch.stream().filter(x -> x.getArea() <= area).collect(Collectors.toList());
	}

	@Override
	public List<House> getAllHousesWithMinPrice(double price) {
		return activSearch.stream().filter(x -> x.getPrice() >= price).collect(Collectors.toList());
	}

	@Override
	public List<House> getAllHousesWithMaxPrice(double price) {
		return activSearch.stream().filter(x -> x.getPrice() <= price).collect(Collectors.toList());
	}

	@Override
	public void save(House house) {
		houses.add(house);
		File file = new File(path);
		try {
			FileWriter fr = new FileWriter(file, true);
			String data = house.getId() + "#" + house.getArea() + "#" + house.isGarten() + "#" + house.isGarage() + "#"
					+ house.getPrice() + "#" + house.getHouseState().name() + "#" + house.getHouseType().name() + "#";
			for (Room item : house.getRooms())
				data = data + item.getType().name() + "-" + item.getArea() + "-";
			data = data.substring(0, data.length() - 1);
			fr.write("\n" + data);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readDb(String data) {
		HouseBuilder houseBuilder;

		String[] result = data.split("#");
		switch (result[6]) {
		case "EINFAMILIENHAUS":
			houseBuilder = new EinfamilienHausBuilder();
			break;
		case "BUNGALOW":
			houseBuilder = new BungalowBuilder();
			break;
		case "VILLA":
			houseBuilder = new VillaBuilder();
			break;

		default:
			throw new IllegalStateException("Unexpected value: " + result[6]);
		}
		String[] splittedRoom = result[result.length - 1].split("-");
		List<Room> rooms = createRoomsFromString(splittedRoom);

		House house = houseBuilder.id(result[0]).area(Double.parseDouble(result[1]))
				.garten(Boolean.parseBoolean(result[2])).garage(Boolean.parseBoolean(result[3]))
				.price(Double.parseDouble(result[4])).houseState(HouseState.valueOf(result[5])).rooms(rooms).build();

		this.houses.add(house);
	}

	private List<Room> createRoomsFromString(String[] splittedString) {
		List<Room> rooms = new ArrayList<>();
		for (int i = 0; i < (splittedString.length / 2); i++) {
			Room room = RoomFactory.getRoom(RoomType.valueOf(splittedString[i]),
					Double.parseDouble(splittedString[++i]));
			rooms.add(room);
		}
		return rooms;
	}
}
