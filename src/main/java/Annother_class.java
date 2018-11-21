/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jaime18001
 */
import java.util.*; 
/**
 * This class allow you more attempts 
 * @author Jaime Martínez
 */
public class Annother_class {   
    /**
     * This is the main function of this class
     * @return i It returns the number of the loop counter.
     */
    public static int pa ()
    {
        Scanner answer = new Scanner (System.in); 
        System.out.println("Do you want to play again?\nSet 1 to Yes and 0 to No! ");
        int answern = answer.nextByte();
        if (answern == 1)
        {
            return 0;
        }
        else
        {
            return 4;
        }   
    }    
}
