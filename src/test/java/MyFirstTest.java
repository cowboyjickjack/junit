import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstTest {

    Bird bird1 = new Bird("Cardinal");
    Bird bird2 = new Bird("Finch");
    Bird bird3 = new Bird("Finch");
    @Test
    public void testAddition(){
        int input1 = 6;
        int input2 = 8;
        int expectedResult = 14;

        // assertEqual is a method that takes two parameters -> (value, method call)
        // in test driven development, we write the test before we write the method
        assertEquals(expectedResult, Calculator.add(input1, input2));
    }

    @Test
    public void testTipCalculator(){
        double cost = 22.56;
        double tipPercentage = 15;
        double tip = 3.38;

        // delta is the margin of error we put in, it means the difference
        // saying 'it should be approximately equal, to within 0.01'
        assertEquals(tip, Calculator.calculateTip(cost, tipPercentage), 0.01);
    }

    @Test
    public void testObjectSameness(){
//        assertSame(bird2, bird3); // won't work bc different memory addresses!
        assertNotSame(bird2, bird3);
    }

}
