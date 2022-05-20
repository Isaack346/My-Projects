import java.util.Scanner;
public class RollDice {
    public static void  main(String[]args) {
        int dice1 = (int)(Math.random() * 6);
        dice1 += 1;
        int dice2 = (int)(Math.random() * 6);
        dice2 += 1;
        //declare my variables used int because it is  a dice game
        // used math.random to get a random number and switch math.random to an int
        // also times it by 6 and updated it to 1 because a dice
        // consists of 1-6
rollDie(dice1 , dice2);
// here i just called my method 
    }
    public static void rollDie(int dice1 , int dice2) {
        while( dice1 != dice2  ) {
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
             dice1 = (int)(Math.random() * 6);
             dice2 = (int)(Math.random() * 6);
             /// here i created a method and printed out a print statement
             // then i declared the variables again so that it will consistently 
             // randomize in the loop 
             // i also use != so that the loop will just keep going

if(dice1 == dice2) {
    System.out.println("Dice 1: " + dice1);
   System.out.println("Dice 2: " + dice2);
   System.out.println("You rolled a double");
   // now here i used an if statement
   // so if dice1 == dice2
   // i have a print statement saying "you rolled a double"
                 }
}








}

}