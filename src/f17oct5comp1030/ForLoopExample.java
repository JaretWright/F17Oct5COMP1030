package f17oct5comp1030;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class ForLoopExample {
    public static void main(String[] args)
    {
        //class name    variable name   constructor with argument
        Scanner         keyboard = new Scanner(System.in);
        Dice            die1     = new Dice(6);
        Dice            die2     = new Dice(6);
        
        System.out.printf("The value of the die1 is %d%n", die1.getFaceValue());
        System.out.printf("The value of the die2 is %d%n", die2.getFaceValue());
        
        die1.rollDice();
        die2.rollDice();
        
        System.out.printf("%5s %10s%n", "Die 1", "Die 2");
        
        int count = 0;
        
        //roll the dice until we roll snake eyes
        while (die1.getFaceValue()+die2.getFaceValue() != 2)
        {
            die1.rollDice();
            die2.rollDice();
            System.out.printf("%5d %10d%n", die1.getFaceValue(), 
                                            die2.getFaceValue());
            count++;
        }
        System.out.printf("It took %d attempts to roll snake eyes.%n", count);
        
        forLoop();
    }
    
    public static void forLoop()
    {
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(6);
        System.out.printf("%5s %10s%n", "Die 1", "Die 2");
        
        //sample 100,000 rolls of the dice and see how many times
        //snake eyes came up
        int count = 0;
        for (int i=1; i<=100000; i++)
        {
            die1.rollDice();
            die2.rollDice();
            System.out.printf("%5d %10d%n", die1.getFaceValue(), 
                                            die2.getFaceValue());
            if (die1.getFaceValue()+die2.getFaceValue()==2)
                count++;
        }
        System.out.printf("In 100,000 rolls, snake eyes came up %d times%n", count);
        
    }
}
