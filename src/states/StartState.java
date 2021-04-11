package states;

import context.Context;
import java.util.Arrays;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class StartState extends State {
    {
        setStateOptions(Arrays.asList("1 - Start Search","2 - Add new house","3 - Quit"));
        realEstate.setActivSearch(realEstate.getAllHouses());
    }
    @Override
    public void enterKey1(Context context) {
        context.setActiveState(new SearchState());
    }

    @Override
    public void enterKey2(Context context) {
        context.setActiveState(new CreateHouseState());
    }

    @Override
    public void enterKey3(Context context) {
        context.setActiveState(new QuitState());
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
