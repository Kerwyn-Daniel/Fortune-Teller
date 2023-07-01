import java.util.Scanner;

public class AgeInfo {

    Scanner input = new Scanner(System.in);


    public int getAge()throws InterruptedException {
        int yrsOld = 0;
        KeyboardInput keys = new KeyboardInput();
        boolean ageTest = false;
        while (!ageTest) {
            yrsOld = keys.getIntegerValue("Anywho...how old are you?");
            if ((yrsOld >= 1) && (yrsOld <= 130)) {
                Thread.sleep(500);
                System.out.println("Thank you.");
                Thread.sleep(500);
                System.out.println("Wait, " + yrsOld + "!! I envy your age!");
                Thread.sleep(1000);
                ageTest = true;
            } else {
                Thread.sleep(1000);
                System.out.println(" I take my profession seriously, I expect you to do the same");
                Thread.sleep(1000);
            }
        }
        return yrsOld;
    }

    public int getBirth() throws InterruptedException {
        KeyboardInput keys = new KeyboardInput();
        int birth = 0;
        boolean monthTest = false;
        while (!monthTest) {
            Thread.sleep(1000);
            birth = keys.getIntegerValue("What is your birth month in digits from 1-12");
            if ((birth >= 1) && (birth <= 12)) {
                switch (birth) {
                    case 1: {
                        System.out.println("Ah, January, your soul symbol is the Dragon!");
                        monthTest = true;
                        break;
                    }
                    case 2: {
                        System.out.println("Ah, February, your soul symbol is the Phoenix!");
                        monthTest = true;
                        break;
                    }
                    case 3: {
                        System.out.println("Ah, March, your soul symbol is Ying-Yang!");
                        monthTest = true;
                        break;
                    }
                    case 4: {
                        System.out.println("Ah, April, your soul symbol is the Lion!");
                        monthTest = true;
                        break;
                    }
                    case 5: {
                        System.out.println("Ah, May, your soul symbol is the Wolf!");
                        monthTest = true;
                        break;
                    }
                    case 6: {
                        System.out.println("Ah, June, your soul symbol is the Fish!");
                        monthTest = true;
                        break;
                    }
                    case 7: {
                        System.out.println("Ah, July, your soul symbol is Fire!");
                        monthTest = true;
                        break;
                    }
                    case 8: {
                        System.out.println("Ah, August, your soul symbol is the Horse!");
                        monthTest = true;
                        break;
                    }
                    case 9: {
                        System.out.println("Ah, September, your soul symbol is the Flower!");
                        monthTest = true;
                        break;
                    }
                    case 10: {
                        System.out.println("Ah, October, your soul symbol is the Star!");
                        monthTest = true;
                        break;
                    }
                    case 11: {
                        System.out.println("Ah, November, your soul symbol is the Tree!");
                        monthTest = true;
                        break;
                    }
                    case 12: {
                        System.out.println("Ah, December, your soul symbol is Water!");
                        monthTest = true;
                        break;
                    }
                }
            } else {
                System.out.println("I am only familiar with the Cesar calendar..or is it julian calendar.");
                System.out.println("Please tell me your birth month in number form");
            }
        }
        return birth;
    }

    public int getSiblings() throws InterruptedException {
        int siblings = 0;
        KeyboardInput keys = new KeyboardInput();
        boolean sibTest = false;
        while (!sibTest) {
            Thread.sleep(1000);
            siblings = keys.getIntegerValue("Please tell me how many siblings are connected to you");
            if (siblings < 0) {
                Thread.sleep(500);
                System.out.println("Were you disowned by your family?");
            } else if (siblings > 13) {
                System.out.println("...wow, talk about fertile soil HaHaHa... ");
                Thread.sleep(1000);
                System.out.println("wow...you do look like a bunny");
                Thread.sleep(1000);
                System.out.println("lets just say thirteen is the max i can siblings i can see... ");
            } else {
                sibTest = true;
            }
            // System.out.println("please, still enter your previous siblings as well");
            // }else if(siblings>13){
            //
        }
        return siblings;
    }
}
