package se.lexicon;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_isAdult_youngAdult(){

        //AAA

        //Arrange - Prepare
        int age = 18;

        String expected = "You are an young adult";
        String result;

        //Act - Execute
        result = App.isAdult(age);

        //Assert - Make sure
        assertEquals(expected,result);
        assertTrue(result.contains("young adult"));
        assertNotNull(result); // Not actually needed.



        //Examples
        //assertEquals(10,1000);
        //assertTrue(App.isAdult(18));

    }


    @Test
    public void test_isAdult_baby() {

        //Arrange
        int age = 17;
        String expected = "Baby";

        //Act
        String isAdult = App.isAdult(age);

        //Assert
        assertTrue(isAdult.contains(expected));
    }
}
