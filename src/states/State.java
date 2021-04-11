package states;

import context.Context;
import service.RealEstate;
import java.util.List;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public abstract class State {

	private List<String> stateOptions;
	public static RealEstate realEstate = RealEstate.getInstance();

	public abstract void enterKey1(Context context);

	public abstract void enterKey2(Context context);

	public abstract void enterKey3(Context context);

	public abstract void enterKey4(Context context);

	public abstract void enterKey5(Context context);

	public abstract void enterKey6(Context context);

	public abstract void enterKey7(Context context);

	public abstract void enterKey8(Context context);

	public abstract void enterYes(Context context);

	public abstract void enterOtherKeys(Context context);

	public void staySameState() {
		System.out.println("Please enter a valid value!!!");
	}

	public void showOptions() {
		for (String temp : stateOptions) {
			System.out.println(temp);
		}
	}

	public void setStateOptions(List<String> stateOptions) {
		this.stateOptions = stateOptions;
	}
}