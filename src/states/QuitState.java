package states;

import context.Context;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class QuitState extends State {

	{
		System.out.println("Bye...");
		Context.loop = false;
	}

	@Override
	public void enterKey1(Context context) {

	}

	@Override
	public void enterKey2(Context context) {

	}

	@Override
	public void enterKey3(Context context) {

	}

	@Override
	public void enterKey4(Context context) {

	}

	@Override
	public void enterKey5(Context context) {

	}

	@Override
	public void enterKey6(Context context) {

	}

	@Override
	public void enterKey7(Context context) {

	}

	@Override
	public void enterKey8(Context context) {

	}

	@Override
	public void enterYes(Context context) {

	}

	@Override
	public void enterOtherKeys(Context context) {

	}
}