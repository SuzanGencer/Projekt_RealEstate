package states;

import context.Context;
import model.houses.HouseType;
import java.util.Arrays;

/**
 * @author Gencer on
 * @project RealEstate
 **/
public class CriteriaHouseTypeState extends State {
	{
		setStateOptions(Arrays.asList("Please select House Type", "1 - EINFAMILIENHAUS", "2 - BUNGALOW", "3 - VILLA"));
	}

	@Override
	public void enterKey1(Context context) {
		realEstate.setActivSearch(realEstate.getAllHousesWithTypes(HouseType.EINFAMILIENHAUS));
		context.setActiveState(new ResultOrAddCriteriaState());
	}

	@Override
	public void enterKey2(Context context) {
		realEstate.setActivSearch(realEstate.getAllHousesWithTypes(HouseType.BUNGALOW));
		context.setActiveState(new ResultOrAddCriteriaState());
	}

	@Override
	public void enterKey3(Context context) {
		realEstate.setActivSearch(realEstate.getAllHousesWithTypes(HouseType.VILLA));
		context.setActiveState(new ResultOrAddCriteriaState());
	}

	@Override
	public void enterKey4(Context context) {
		staySameState();
	}

	@Override
	public void enterKey5(Context context) {
		staySameState();
	}

	@Override
	public void enterKey6(Context context) {
		staySameState();
	}

	@Override
	public void enterKey7(Context context) {
		staySameState();
	}

	@Override
	public void enterKey8(Context context) {
		staySameState();
	}

	@Override
	public void enterYes(Context context) {
		staySameState();
	}

	@Override
	public void enterOtherKeys(Context context) {
		staySameState();
	}
}