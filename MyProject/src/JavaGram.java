import java.util.Scanner;
    public class JavaGram {
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Javagram! Sign in below");
            System.out.printf("Username:");
            String user = sc.nextLine();
            System.out.printf("Password:");
            String pass = sc.nextLine();
            // declared my scanner first then print statements saying welcome to "Javagram"
            /// then  print statements  asking user for password and username
            /// after those statements i made sure to declare my string and used ,nextLine
            // because the user is giving out a line for their password
            // I did the same for pass with my String
            while(!user.equals("Imoney") || !pass.equals("Password1")) {
                System.out.println("Incorrect, please try again:");
                System.out.printf("Username:");
                 user = sc.next();
                System.out.printf("Password:");
                 pass = sc.next();
                 // above is a while loop containing the statements that would
                 //come out if the password and username is incorrect

            }
                if(user.equals("Imoney") && pass.equals("Password1")) {
                    System.out.println("Logging you in please wait a moment....");
                    // right here is my if statement where is user puts in correct credentials
                    //in this case it is "Imoney" and "Password1"
                    // once the credentials are right you get a print statement telling you 
                    // that you are going to be logged in wait a moment

                }

                }

        }