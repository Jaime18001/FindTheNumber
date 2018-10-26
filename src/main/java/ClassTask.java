/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
import java.util.*; 

public class ClassTask {
    
  
    public static void main(String[] args)
    {
        int i = 0;
        System.out.println("What number is it?. Try to guess it. You have got 3 attempts.");
        while (i<3)
        {
            Scanner inpnumber = new Scanner (System.in);
            double rnumber = randomgen();
            System.out.println("Give me a integer number between 0 and 10");
            int number = inpnumber.nextByte();
            if (rnumber == number)
            {
            System.out.println("You win");
            i = 4;
            }
            else
            {
                System.out.println("No it is not. You have got " + (2-i) + " attempts.");
                i++;
            }
            if (i == 3)
            {
            System.out.println("Game Over.");
            }
        }
        
    } 
    public static double randomgen()
    { 
        double number =  10*Math.random();
        number = Math.round(number);
        return number;
    }
    
}


