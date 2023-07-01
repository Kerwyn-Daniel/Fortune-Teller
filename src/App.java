// import java.util.Scanner;
public class App {


    public static void main(String[] args) throws Exception {
Fortune run = new Fortune();
// Person rando = new Person();


//Menu display to start game
MenuOptions menu = new MenuOptions();

boolean exitProgram = false;
while(!exitProgram){
    System.out.println("");
    int selection = menu.DisplayMenu();
    switch(selection){
        case 1:{
            run.fortuneInfo();
            break;
        }
        case 2:{
            //run random fortune
            System.out.println("");
            Thread.sleep(1000);
            System.out.println("I apologize, this feature is only available through subscription at this time.");
            Thread.sleep(2000);
            System.out.println("Subscriptions start at a low price of $3000.00 a month for unlimited fortunes!!");
            Thread.sleep(2000);
            break;
        }
        case 0:{
            exitProgram = true;
            break;
        }
    }
}
    }
}
