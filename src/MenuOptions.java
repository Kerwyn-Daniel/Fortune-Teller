public class MenuOptions {

public int DisplayMenu(){
KeyboardInput keys = new KeyboardInput();
System.out.println("");
System.out.println("0 = Exit");
System.out.println("1 = Full Fortune");
System.out.println("2 = Random");
System.out.println("");
int value = keys.getIntegerValue("Select Menu Option ! ");
return value;
    }
}
