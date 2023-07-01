import java.util.Scanner;

public class Name {
    Scanner input = new Scanner(System.in);

    public String getFName() throws InterruptedException {
        int test;
        String fname = "";
        boolean nameTest = false;
        while (!nameTest){
            Thread.sleep(1000);
        System.out.println("Please, tell me your first name, ");
        // user enters name
        fname = input.nextLine();
        test = fname.length(); 
        if((test>0)&&(test<50)){
            Thread.sleep(1000);
            System.out.println(" I knew that! " + fname);
            Thread.sleep(1000);
            nameTest = true;
        }else{
        if (test == 0) {
            System.out.println("Silent type huh?");
            Thread.sleep(1000);
            System.out.println("Please, even a monicker will work");
            Thread.sleep(1000);
        }
        if (test > 50) {
            System.out.println("Hmm..I doubt that is a real name...");
            Thread.sleep(1000);
            System.out.println("..unless you are some kind of alien..aaahhh");
            }
        }}
        return fname;
    
    }

    public String getLName() throws InterruptedException {
        String lname = "";
        boolean nameTest = false;
        System.out.println("In fact i know your last name as well..");
        Thread.sleep(1000);
        System.out.println(" Its....");
        Thread.sleep(1000);
        System.out.println("ugh its on the tip of my tongue!");
        while(!nameTest){
        // user enters last name
        lname = input.nextLine();
        // if((lname<=-1)||(lname>=1)){
        //     System.out.println("If your name really is a number, please use letters to spell.");
        // }
        //else{
        int test = lname.length(); 
        if((test>0)&&(test<50)){
            System.out.println(lname + "!! Yes, " + lname + ". How could I have forgotten " + lname);
            Thread.sleep(3000);
            System.out.println("I went to school with your father. we always used to call him " + lname + " the sleeper");
            nameTest = true;
        }else{
        if (test == 0) {
            System.out.println("Okay, I am still waking up, what is your last name?");
            Thread.sleep(1000);
        }
        if (test > 50) {
            System.out.println("Hmm..I doubt that is a real name...");
            Thread.sleep(1000);
            System.out.println("..unless you are some kind of alien..aaahhh");
            Thread.sleep(1000);
            System.out.println("Please tell me your last name");
            }
        }
    }
        return lname;
    }
}
