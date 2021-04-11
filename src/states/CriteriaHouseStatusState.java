package states;

import context.Context;
import model.houses.HouseState;
import java.util.Arrays;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class CriteriaHouseStatusState extends State {
	{
		setStateOptions(Arrays.asList("Please select House Status", "1 - MIETE", "2 - KAUF", "3 - WG"));
	}

	@Override
	public void enterKey1(Context context) {
		realEstate.setActivSearch(realEstate.getAllHousesWithStatus(HouseState.MIETE));
		context.setActiveState(new ResultOrAddCriteriaState());
	}

	@Override
	public void enterKey2(Context context) {
		realEstate.setActivSearch(realEstate.getAllHousesWithStatus(HouseState.KAUF));
		context.setActiveState(new ResultOrAddCriteriaState());
	}

	@Override
	public void enterKey3(Context context) {
		realEstate.setActivSearch(realEstate.getAllHousesWithStatus(HouseState.WG));
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