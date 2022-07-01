 import java.util.Scanner;
public class Javapedia {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[][] names = new String[2][3];
    for(int i=0;i<2;i++) {
      System.out.println("Figure " + (i+1));
      System.out.println("\nName: ");
      names[i][0] = input.nextLine();
      System.out.println("\nDate of birth: ");
      names[i][1] = input.nextLine();
      System.out.println("\nOccupation: ");
      names[i][2] = input.nextLine();
      // Above I created a Scanner then a for loop after print statements 
      // and after each print statement i put the variable i in one of the arrays then 
      // I updated the second array each time i printed out a array using i 
    }

        System.out.println("\nThese are the values stored: ");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println("\n"+names[i][j] + " ");
                // Above first i created a print statement 
                // Then I created a nested for loop then I just printed 
                // the variables i and j

            }
        }

    }
    
}

