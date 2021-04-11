package states;

import context.Context;
import model.houses.House;
import java.util.Arrays;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class ResultOrAddCriteriaState extends State {
	{
		setStateOptions(Arrays.asList("Please select an Option", "1 - Show Result", "2 - Add Another Criteria",
				"3 - Go To Start Page"));
	}

	@Override
	public void enterKey1(Context context) {
		if (realEstate.getActivSearch().isEmpty()) {
			System.out.println("There isn't any house with your criteria...");
		}
		int count = 1;

		for (House item : realEstate.getActivSearch()) {
			System.out.println(count + " - " + item);
			count++;
		}
	}

	@Override
	public void enterKey2(Context context) {
		context.setActiveState(new SearchState());
	}

	@Override
	public void enterKey3(Context context) {
		context.setActiveState(new StartState());
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