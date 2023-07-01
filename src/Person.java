import java.util.Scanner;

public class Person {
    // public void testFortune(){
    String firstName;
    String lastName;
    int Age;
    int bMo;
    int sib;
    int color;
    int retYears;
    String vacay = null;
    String bankBal = null;
    String transport = null;
    Scanner input = new Scanner(System.in);

    // fortune methods
    public int getRetire(int Age) {
        if (Age < 60) {
            if (Age % 2 == 0) {
                retYears = 40;
            } else {
                retYears = 25;
            }
        } else {
            if (Age % 2 == 0) {
                retYears = 10;
            } else {
                retYears = 5;
            }
        }
        return retYears;
    }

    public String getBankBal(int bMo) {
        switch (bMo) {
            case 1: {
                bankBal = " Win cash 4 life, $1000 a day";
                break;
            }
            case 11:
            case 10:
            case 9: {
                bankBal = "company stocks soaring, $800,000";
                break;
            }
            case 6:
            case 4:
            case 2: {
                bankBal = "work paycheck to paycheck, only have about $200";
                break;
            }
            case 5:
            case 3: {
                bankBal = "crypto investments paid off! 4 million";
                break;
            }
            case 8:
            case 7: {
                bankBal = "work average job, you have on average $8,000";
                break;
            }
            default:
                bankBal = "Hit jackpot Powerball! $200 billion";
        }
        return bankBal;
    }

    public String getVacation(int sib) {
        switch (sib) {
            case 0:
                vacay = "Nursing Home";
                break;
            case 1:
            case 2:
                vacay = "Poconos,PA";
                break;
            case 3:
            case 4:
            case 5:
                vacay = "Las Vegas, NV";
                break;
            case 6:
            case 7:
            case 8:
                vacay = "Hamptons, NY";
                break;
            case 9:
            case 10:
            case 11:
                vacay = "Saguenay, Quebec, Canada";
                break;
            case 12:
            case 13:
                vacay = "Cancun, Mexico";
                break;
        }

        return vacay;
    }

    public String getTransport(int color) {
        switch (color) {
            case 1:
                transport = "Hovercraft";
                break;
            case 2:
                transport = "prius";
                break;
            case 3:
                transport = "shove ur leg...like chevrolet";
                break;
            case 4:
                transport = "private jet";
                break;
            case 5:
                transport = "hummer";
                break;
            case 6:
                transport = "vespa";
                break;
            case 7:
                transport = "those rental scooters all around town";
                break;
        }
        return transport;
    }

    public void  fortuneTold() throws InterruptedException {
                // constructor of name class
        Name editName = new Name();
        firstName = editName.getFName();
        lastName = editName.getLName();

        // constructor of age info
        AgeInfo editInt = new AgeInfo();
        Age = editInt.getAge();
        bMo = editInt.getBirth();
        sib = editInt.getSiblings();

        // constructor of color info
        RoyGbiv picked = new RoyGbiv();
        color = picked.getColor();
        
        int retYear = getRetire(Age);
        String bankBals = getBankBal(bMo);
        String vacays = getVacation(sib);
        String transports = getTransport(color);


        
        String feedBack = null;
        System.out.println("Okay okay, the spirits have seen your fortune.");
        Thread.sleep(2000);
        System.out.println("Allow me to tell you in the specific fortune way:");
        System.out.println("");
        Thread.sleep(2000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("");
        System.out.println("Behold, " + firstName + ", of the family " + lastName + "...");
        Thread.sleep(2000);
        System.out.println(firstName + " shall retire in " + retYear + " years, and " + bankBals + " in the bank!");
        Thread.sleep(500);
        System.out.println(" You shall have a vacation home in " + vacays + ", and travel by " + transports + ".");
        System.out.println("");
        Thread.sleep(2000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("");
        System.out.println("Whew, that took a lot out of me!!");
        Thread.sleep(2000);
        System.out.println(" I hope this fortune satisfy your curiosity?");
        Thread.sleep(2000);
        System.out.println("please provide some thoughts so i can tell the powers that be..");
        String response = input.nextLine();
        feedBack = " Whoa...so you feel, and i quote : \"" + response + " \"...i see..";

        System.out.println(feedBack);
        // quitter = true;
        
    }
}
