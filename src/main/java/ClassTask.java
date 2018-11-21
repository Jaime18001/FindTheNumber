/**
 * This is a game in which you have to find a random number in attempts 
 * @author Jaime Martínez Fernández
 * @version 1.0
 */
/**
 * I have imported the java.util library
 */
import java.util.*; 
/**
 * This is the main class
 * @author Jaime Martínez
 */
public class ClassTask { 
  /**
 * This method is the main method. 
 * @author Jaime Martínez Fernández
 * @param args This input is needed
 */
    public static void main(String[] args)
    {
        int i = 0;
        System.out.println("What number is it?. Try to guess it. You have got 3 attempts.");
        double rnumber = randomgen();
        while (i<3)
        {  
            int number = scannumber();
            i = compnumber (rnumber, number, i);
        }        
    } 
    /**
     * This method scan an integer number from keyboard
     * @return number This is the scan number
     */
    public static int scannumber()
    {
        Scanner inpnumber = new Scanner (System.in); 
        System.out.println("Give me a integer number between 0 and 10");
        int number = inpnumber.nextByte();
        return number;
    }
    /**
     * This method compares the scan number with the random number and print an answer.
     * @param rnumber This is the random number
     * @param number This is de keyboard number
     * @param i This is the loop counter of main function
     * @return i This method returns the loop counter
     */
    public static int compnumber (double rnumber, int number, int i)
    {
        if (rnumber == number)
        {
            printyw();
            i = 4;
        }
        else
        {
            System.out.println("No it is not.\nYou have got " + (2-i) + " attempts.");
            i++;   
        }
        if (i == 3)
        {
            System.out.println("Game Over.");
            i = Annother_class.pa();             
        }
        return i;
    }
    /**
     * This method only print "You win" when you have found the number in less than three attempts 
     */
    public static void printyw()
    {
        System.out.println("You win");
    }
    /**
     * This function generates a random integer number between 0 and 10.
     * @return integer number
     */
    public static double randomgen()
    { 
        double number =  10*Math.random();
        number = Math.round(number);
        return number;
    }   
}


