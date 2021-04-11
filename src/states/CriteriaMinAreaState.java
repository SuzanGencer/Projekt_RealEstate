package states;

import context.Context;
import java.util.Arrays;

/**
 * @author Gencer on
 * @project RealEstate
 **/
public class CriteriaMinAreaState extends State {
	{
		setStateOptions(Arrays.asList("Please write min Area"));
	}

	@Override
	public void enterKey1(Context context) {
		getMinArea(context);
	}

	@Override
	public void enterKey2(Context context) {
		getMinArea(context);
	}

	@Override
	public void enterKey3(Context context) {
		getMinArea(context);
	}

	@Override
	public void enterKey4(Context context) {
		getMinArea(context);
	}

	@Override
	public void enterKey5(Context context) {
		getMinArea(context);
	}

	@Override
	public void enterKey6(Context context) {
		getMinArea(context);
	}

	@Override
	public void enterKey7(Context context) {
		getMinArea(context);
	}

	@Override
	public void enterKey8(Context context) {
		getMinArea(context);
	}

	@Override
	public void enterYes(Context context) {
		staySameState();
	}

	@Override
	public void enterOtherKeys(Context context) {
		getMinArea(context);
	}

	private void getMinArea(Context context) {
		try {
			realEstate.setActivSearch(realEstate.getAllHousesWithMinArea(Double.parseDouble(context.getLine())));
			context.setActiveState(new ResultOrAddCriteriaState());
		} catch (NumberFormatException e) {
			staySameState();
		}
	}
}