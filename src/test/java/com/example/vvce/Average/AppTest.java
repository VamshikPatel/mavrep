package com.example.vvce.Average;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	
	App app = new App();
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void AverageOfTwo() {
        assertEquals(5,app.AverageOfTwo(6,4));
        
    }
    public void AverageOfThree() {
        assertEquals(6,app.AverageOfThree(6,4,8));
        
    }
}
