
package f17oct5comp1030;

import java.security.SecureRandom;

/**
 *
 * @author JWright
 */
public class Dice {
    //these are the instance variables.  We make them private
    //so only THIS class can access/modify their contents
    private int faceValue, numOfSides;
    
    /**
     * This is the constructor, it accepts the number of sides
     * of the die as an argument.  Valid numbers are 4-100
     * 
     * constructors look like methods, but they do not have a return type
     * and the name must match the class name exactly
     */
    public Dice(int numberOfSides)
    {
        if (numberOfSides >= 4 && numberOfSides <= 100)
            numOfSides = numberOfSides; //set the instance variable to the
                                        //number of sides given
        else
            throw new IllegalArgumentException("Dice must have 4-100 sides");
        rollDice();
    }   //end of the constructor
    
    /**
     * This method will simulate rolling the dice (die) with a pseudo
     * random number
     */
    public void rollDice()
    {
        //rng stands for random number generator
        SecureRandom rng = new SecureRandom();
        faceValue = rng.nextInt(numOfSides)+1;
        
        //secure random starts counting at 0, so if it was a 6 sided
        //die, the possible outcomes are 0, 1, 2, 3, 4, 5.  However,
        //we would need 1, 2, 3, 4, 5, 6.  
    }
    
    public int getFaceValue()
    {
        return faceValue;
    }
    
}//end of the class

