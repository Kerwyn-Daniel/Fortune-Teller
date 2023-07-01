// import java.util.Scanner;

// public class NewPerspn {
//     private String firstName;
//     private String lastName;
//     private int Age;
//     private int bMo;
//     private int sib;
//     private char color;
//     Scanner input = new Scanner(System.in);

//         public String getFName()throws InterruptedException{
//         String fname;
        
//         System.out.println("Please, tell me your first name, ");
//         //user enters name
//         fname = input.nextLine();
//         if(fname == null){
//             System.out.println("Silent type huh?");
//             Thread.sleep(1000);
//             System.out.println("Please, even a monicker will work");
//             Thread.sleep(1000);
//             fname = input.nextLine();
//         } else{
//         if(fname.length()>50){
//             System.out.println("Hmm..I doubt that is a real name.");
//             Thread.sleep(1000);
//             System.out.println("unless you are some kind of alien..aaahhh");
//             fname = input.nextLine();
//         }}
//         Thread.sleep(1000);
//         System.out.println(" I knew that! "+fname);
//         Thread.sleep(1000);

//         firstName = fname;
//         return firstName;
//     }

//     public String getLName()throws InterruptedException{
//         String lname;
//         System.out.println("In fact i know your last name as well..");
//         Thread.sleep(1000);
//         System.out.println(" Its....");
//         Thread.sleep(1000);
//         System.out.println("ugh its on the tip of my tongue!");
//         //user enters last name
//         lname = input.nextLine();
//         System.out.println(lname + "!! Yes, "+ lname +". How could I have forgotten " +lname);
//         Thread.sleep(3000);
//         System.out.println("I went to school with your father. we always used to call him "+lname+ " the sleeper");
            
//             lastName = lname;
//             return lastName;
//     }
    
//     public int getAgeInfo()throws InterruptedException{
//         int yrsOld = 0;
//         // KeyboardInput keys = new KeyboardInput();
        
//         boolean ageTest = false;

//         while(!ageTest){
//             System.out.println("Anywho...how old are you?");
//         yrsOld = input.nextInt();
//         if((yrsOld>=1)&&(yrsOld<=130)){
//             System.out.println("Thank you.");
//             ageTest= true;
//         }else{
//                 Thread.sleep(1000);
//                 System.out.println(" I take my profession seriously, I expect you to do the same");
//                 Thread.sleep(1000);
//         }}
//     Age = yrsOld;
//     return Age;        
//     }

// public int getBirth()throws InterruptedException{
// int birth=0;
// boolean monthTest = false;
// while(!monthTest){
// Thread.sleep(1000);
// System.out.println("ah, I envy your age");
// System.out.println("What is your birth month in digits from 1-12");
// birth = input.nextInt();
// if((birth>=1)&&(birth<=12)){
// switch(birth){
//         case 1:{
//         System.out.println("January");
//         monthTest=true;
//         break;
//     }
//         case 2:{
//         System.out.println("February");
//         monthTest=true;
//         break;
//     }
//         case 3:{
//         System.out.println("March");
//         monthTest=true;
//         break;
//     }
//         case 4:{
//         System.out.println("April");
//         monthTest=true;
//         break;
//     }
//         case 5:{
//         System.out.println("May");
//         monthTest=true;
//         break;
//     }
//         case 6:{
//         System.out.println("June");
//         monthTest=true;
//         break;
//     }
//         case 7:{
//         System.out.println("July");
//         monthTest=true;
//         break;
//     }
//         case 8:{
//         System.out.println("August");
//         monthTest=true;
//         break;
//     }
//         case 9:{
//         System.out.println("September");
//         monthTest=true;
//         break;
//     }
//         case 10:{
//         System.out.println("October");
//         monthTest=true;
//         break;
//     }
//         case 11:{
//         System.out.println("November");
//         monthTest=true;
//         break;
//     }
//         case 12:{
//         System.out.println("December");
//         monthTest=true;
//         break;}
//     }}
//     else {
//         System.out.println("I am only familiar with the Cesar calendar..or is it julian calendar.");
//     System.out.println("Please tell me your birth month in number form");
//     }
//     bMo = birth;
//     }
// return bMo;
// }

// public int getSiblings(){
//     int siblings = 0;
//     System.out.println("Please tell me how many siblings are connected to you");
//     siblings = input.nextInt();
// if(siblings<0){
//     System.out.println("Were you disowned by your family?");
//     System.out.println("please, still enter your previous siblings as well");
// }else if(siblings>13){
//     System.out.println("...wow, talk about fertile soil HaHaHa... ");
// }
// sib = siblings;
// return sib;
// }
// } 
