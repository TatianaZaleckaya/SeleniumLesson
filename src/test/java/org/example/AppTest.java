package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
    public void shouldAnswerFalse(){
        assertFalse(false);
    }

    @Test
    public void equalsSmt(){
        assertEquals("Sasha", "Sasha" );
    }



}
