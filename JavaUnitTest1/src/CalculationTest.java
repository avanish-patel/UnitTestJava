import static org.junit.Assert.*;

public class CalculationTest {

    Calculation calc;

    @org.junit.Before
    public void setUp() throws Exception {

        System.out.println("Instance of Calculation is created by calling Before");

        calc = new Calculation();
    }


    @org.junit.Test
    public void cube() {

        assertEquals(27, calc.cube(3));
    }

    @org.junit.Test
    public void square() {

        assertEquals(9,calc.square(3));
    }

    @org.junit.Test
    public void hypotenious() {

        assertEquals(5,calc.hypotenious(3,4));
    }


    @org.junit.After
    public void tearDown() throws Exception {

        System.out.println("After method called");
    }

}