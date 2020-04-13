import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    /**
     * TBD:
     * - Fix the initial test which is failing on purpose
     * - Add tests for null inputs
     * - Add tests for addition of two numbers
     * - Add tests for addition of multiple numbers
     *
     */
    @Test
    public void testSumAllNumbersWithNullInput() {
    	//this test currently fails on purpose
        assertEquals(null, calculator.sumAllNumbers(null));
    }


    /***
     * Unit test for addition of two numbers
     */
    @Test
    public void testSumAllNumbersWith2Numbers(){
        assertEquals(Integer.valueOf(3), calculator.sumAllNumbers(new Integer[]{1, 2}));
    }

    /***
     * Unit test for addition of multiple numbers
     */
    @Test
    public void testSumAllNumbersWithManyNumbers(){
        assertEquals(Integer.valueOf(15), calculator.sumAllNumbers(new Integer[]{1, 2, 3, 4, 5}));
    }


    /**
     * TBD:
     * - Add tests for null inputs
     * - Add tests for multiplication of two numbers
     * - Add tests for multiplication of multiple numbers
     *
     */
    @Test
    public void testMultiplyAllNumbersWithNullInput() {
        assertEquals(null, calculator.multiplyAllNumbers(null));
    }

    /***
     * Unit test for multiplication of 2 numbers
     */
    @Test
    public void testMultiplyAllNumbersWith2Numbers() {
        assertEquals(Integer.valueOf(2), calculator.multiplyAllNumbers(new Integer[]{1, 2}));
    }

    /***
     * Unit test for multiplication of many numbers
     */
    @Test
    public void testMultiplyAllNumbersWithManyNumbers() {
        assertEquals(Integer.valueOf(120), calculator.multiplyAllNumbers(new Integer[]{1, 2, 3, 4, 5}));
    }


}
