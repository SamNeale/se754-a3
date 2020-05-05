import org.junit.Test;
import static org.junit.Assert.*;

//Note: These test cases do not follow testing best practices and are for marking purposes only
public class MarkingTestAllPass {
    private Calculator calculator = new Calculator();
    private StringCheck stringCheck = new StringCheck();

    @Test
    public void palindromeTests() {
        assertTrue(stringCheck.isPalindrome(""));
        assertTrue(stringCheck.isPalindrome("mum"));
        assertFalse(stringCheck.isPalindrome("123"));
    }
    
    @Test
    public void isEmptyTests(){
        assertTrue(stringCheck.isEmpty(""));
        assertFalse(stringCheck.isEmpty("test"));
    }
    
    @Test
    public void isNullTests(){
        assertTrue(stringCheck.isNull(null));
        assertFalse(stringCheck.isNull("test"));
    }
    
    @Test
    public void isOnlyWhitespaceTests(){
        assertTrue(stringCheck.isOnlyWhitespace(" "));
        assertTrue(stringCheck.isOnlyWhitespace("     "));
        assertFalse(stringCheck.isOnlyWhitespace("test"));
    }
    
    @Test
    public void sumAllTests(){
        assertEquals(new Integer(3), calculator.sumAllNumbers(1,2));
        assertEquals(new Integer(6), calculator.sumAllNumbers(1,2,3));
        assertEquals(new Integer(10), calculator.sumAllNumbers(1,2,3,4));
    }
    
    @Test
    public void multiplyAllTests(){
        assertEquals(new Integer(3), calculator.multiplyAllNumbers(1,3));
        assertEquals(new Integer(6), calculator.multiplyAllNumbers(1,2,3));
        assertEquals(new Integer(24), calculator.multiplyAllNumbers(1,2,3,4));
    }

}