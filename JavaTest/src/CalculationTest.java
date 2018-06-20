import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationTest {

    Calculation calc;

    @Before
    public void setUp(){

        calc = new Calculation();
    }


    @Test
    public void testFindMax(){

        assertEquals(4,calc.findMax(new int[]{1,3,4,2}));


        assertEquals(-1, calc.findMax(new int[] {-1,-2,-3,-4}));

    }

}