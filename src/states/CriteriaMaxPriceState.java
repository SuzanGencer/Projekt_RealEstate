package states;

import context.Context;
import java.util.Arrays;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class CriteriaMaxPriceState extends State {
	{
		setStateOptions(Arrays.asList("Please write max Price"));
	}

	@Override
	public void enterKey1(Context context) {
		getMaxPrice(context);
	}

	@Override
	public void enterKey2(Context context) {
		getMaxPrice(context);
	}

	@Override
	public void enterKey3(Context context) {
		getMaxPrice(context);
	}

	@Override
	public void enterKey4(Context context) {
		getMaxPrice(context);
	}

	@Override
	public void enterKey5(Context context) {
		getMaxPrice(context);
	}

	@Override
	public void enterKey6(Context context) {
		getMaxPrice(context);
	}

	@Override
	public void enterKey7(Context context) {
		getMaxPrice(context);
	}

	@Override
	public void enterKey8(Context context) {
		getMaxPrice(context);
	}

	@Override
	public void enterYes(Context context) {
		staySameState();
	}

	@Override
	public void enterOtherKeys(Context context) {
		getMaxPrice(context);
	}

	private void getMaxPrice(Context context) {
		try {
			realEstate.setActivSearch(realEstate.getAllHousesWithMaxPrice(Double.parseDouble(context.getLine())));
			context.setActiveState(new ResultOrAddCriteriaState());
		} catch (NumberFormatException e) {
			staySameState();
		}
	}
}