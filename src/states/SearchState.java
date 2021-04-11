package states;

import context.Context;
import java.util.Arrays;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class SearchState extends State {
	{
		setStateOptions(Arrays.asList("Search Criterias", "1 - AllHouses", "2 - With House Type",
				"3 - With House State", "4 - Min Area", "5 - Max Area", "6 - Min Price", "7 - Max Price",
				"8 - Go to start page ", "Quit for any other Key"));
	}

	@Override
	public void enterKey1(Context context) {
		realEstate.setActivSearch(realEstate.getAllHouses());
		context.setActiveState(new ResultOrAddCriteriaState());
	}

	@Override
	public void enterKey2(Context context) {
		context.setActiveState(new CriteriaHouseTypeState());
	}

	@Override
	public void enterKey3(Context context) {
		context.setActiveState(new CriteriaHouseStatusState());
	}

	@Override
	public void enterKey4(Context context) {
		context.setActiveState(new CriteriaMinAreaState());
	}

	@Override
	public void enterKey5(Context context) {
		context.setActiveState(new CriteriaMaxAreaState());
	}

	@Override
	public void enterKey6(Context context) {
		context.setActiveState(new CriteriaMinPriceState());
	}

	@Override
	public void enterKey7(Context context) {
		context.setActiveState(new CriteriaMaxPriceState());
	}

	@Override
	public void enterKey8(Context context) {
		context.setActiveState(new StartState());
	}

	@Override
	public void enterYes(Context context) {
		context.setActiveState(new QuitState());
	}

	@Override
	public void enterOtherKeys(Context context) {
		context.setActiveState(new QuitState());
	}
}
