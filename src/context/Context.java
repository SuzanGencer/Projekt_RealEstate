package context;

import states.StartState;
import states.State;
import java.util.Scanner;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class Context {
    private State activeState = new StartState();
    private String line;

    public static boolean loop=true;
    Scanner scanner;
    public void openScanner(){
        scanner = new Scanner(System.in);
    }
    public void closeScanner(){
        if(scanner!=null){
            scanner.close();
        }
    }
    public void readLine(){
        line = scanner.nextLine();
    }
    public void showOptions(){
        activeState.showOptions();
    }
    public void handleRequest(){
        switch(line){
            case "1":   activeState.enterKey1(this);break;
            case "2":   activeState.enterKey2(this);break;
            case "3":   activeState.enterKey3(this);break;
            case "4":   activeState.enterKey4(this);break;
            case "5":   activeState.enterKey5(this);break;
            case "6":   activeState.enterKey6(this);break;
            case "7":   activeState.enterKey7(this);break;
            case "8":   activeState.enterKey8(this);break;
            case "y":
            case "Y":  activeState.enterYes(this);break;
            default:
                activeState.enterOtherKeys(this);
                break;
        }
    }
    public State getActiveState() {
        return activeState;
    }

    public void setActiveState(State activeState) {
        this.activeState = activeState;
    }
    public String getLine() {
        return line;
    }
}