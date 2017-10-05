package f17oct5comp1030;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class WhileLoopExample {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pw = keyboard.nextLine();
        
        //test the users' password to see if it matches, if it
        //doesn't prompt the user for another password
        while (!pw.equalsIgnoreCase("deathStar"))
        {
            System.out.print("**Kaboom** (cool Star Wars sound effect) wrong "
                    + "password - try again:");
            pw = keyboard.nextLine();
        }
        System.out.println("We have found Obi-wan and the password is correct too");
    }
}
