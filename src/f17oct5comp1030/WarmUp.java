package f17oct5comp1030;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class WarmUp {
    public static void main(String[] args)
    {
        //prompt and store the user's name
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter your name: ");
        String userName = keyboard.nextLine();
        
        //ask user for their birth year and store it
        System.out.printf("Please enter the year you were born: ");
        int birthYear = keyboard.nextInt();
        
        //ask a method to calculate their age
        int age = getAge(birthYear);
        
        //display their name and age
        System.out.printf("%s, your age is %d%n", userName, age);
    }
    
    public static int getAge(int yearBorn)
    {
        //return 2017-yearBorn;  this "hard" coded
        return LocalDate.now().getYear() - yearBorn;
    }
}
