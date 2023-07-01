import java.util.Scanner;
public class KeyboardInput {

private Scanner input = new Scanner(System.in);
//This gets a integer keyboard VALUE
public String getStringValue(String prompt){
    //THIS IS THE VALUE THAT WILL BE RETURNED
    String value;
    System.out.println(prompt+": " );
    value = input.nextLine();
    return value;
}


public int getIntegerValue(String prompt){

    int value =0;
    System.out.println(prompt+ ": ");
    boolean exitMethod= false;
do{
    try{
    String checkValue = input.nextLine();
// if(checkValue == "quit"){
// exitProgram = true;
// }else{
    value = Integer.parseInt(checkValue);
    exitMethod=true;
    }
    catch(
    NumberFormatException ne){
    System.out.println("You did not enter a number");
    }
    }
    while(!exitMethod);

    // System.out.println(prompt);
    // value = input.nextInt();

    return value;
}
}
