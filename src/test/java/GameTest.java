/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaime
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void game() {
         ClassTask generat = new ClassTask();
         double numbert = generat.randomgen();
         double []n = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         int j = 0;
         while (j <= 11 && n[j] != numbert)
         {
             j++;
         }
         assertEquals(String.valueOf(n[j]), String.valueOf(numbert));   
     }
    
}
