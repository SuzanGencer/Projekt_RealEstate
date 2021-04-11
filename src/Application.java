import context.Context;

/**
 * @author Gencer on
 * @project RealEstate
 **/

public class Application {

     public static void main(String[] args) {
        Context context=new Context();
        context.openScanner();
        while(Context.loop){
            context.showOptions();
            context.readLine();
            context.handleRequest();
        }
        context.closeScanner();
    }

}
