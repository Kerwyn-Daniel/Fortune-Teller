import java.util.Scanner;

public class RoyGbiv {
Scanner input = new Scanner(System.in);

public int getColor()throws InterruptedException {
char col = 'X';
int hue = 0;
boolean colorTest=false;
while(!colorTest){
    Thread.sleep(1000);
    System.out.println("");
    System.out.println("Please tell me your favorite R-O-Y-G-B-I-V color");
    Thread.sleep(1000);
    System.out.println("If you do not know what R-O-Y-G-B-I-V, please type \'H\' for help, and explanation");
    col = input.next().charAt(0);
    col = Character.toUpperCase(col);
switch (col){
    case 'H':
    System.out.println("");
    Thread.sleep(1000);
    System.out.println("Please see the explanation below");
    System.out.println("");
    Thread.sleep(1000);
    System.out.println("R - Is the color Red!");
    Thread.sleep(300);
    System.out.println("O - Is the color Orange");
    Thread.sleep(300);
    System.out.println("Y - Is the color Yellow");
    Thread.sleep(300);
    System.out.println("G - Is the Color Green");
    Thread.sleep(300);
    System.out.println("B - Is the Color Blue");
    Thread.sleep(300);
    System.out.println("I - Is the color Indigo");
    Thread.sleep(300);
    System.out.println("V - Is the color Violet");
    System.out.println("");
        break;
    case 'R':
        System.out.println(" Pokemon Red is the one with Charizard!");
        System.out.println("");
        hue = 1;
        colorTest = true;
        break;
    case 'O':
        System.out.println("Charizard was more Orange than red...Just saying");
        System.out.println("");
        hue = 2;
        colorTest = true;
        break;
    case 'Y':
        System.out.println("Pokemon Yellow was my first pokemon game!");
        System.out.println("");
        hue = 3;
        colorTest = true;
        break;
    case 'G':
        System.out.println("Pokemon Green originally released only in Japan");
        System.out.println("");
        hue = 4;
        colorTest = true;
        break;
    case 'B':
        System.out.println("Pokemon Blue had Blastoise on the cover!");
        System.out.println("");
        hue = 5;
        colorTest = true;
        break;
    case 'I':
        System.out.println("The Indigo league is just classic!");
        System.out.println("");
        hue = 6;
        colorTest = true;
        break;
    case 'V':
        System.out.println("Pokemon Violet open world is fun!");
        System.out.println("");
        hue = 7;
        colorTest = true;
        break;
    default :
    System.out.println("");
        System.out.println("Please enter a character of the \"R-O-Y-G-B-I-V\" format.");
        System.out.println("Type \'H\' if you do not know what R-O-Y-G-B-I-V is");
        System.out.println("");
        break;

}}
    // System.out.println(hue+"0");
    return hue;
}
}
