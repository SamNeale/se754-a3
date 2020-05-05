import org.junit.Test;
import static org.junit.Assert.*;

public class StringCheckTest {
    private StringCheck stringCheck = new StringCheck();

    @Test
    public void testIsPalindrome() {
        assertFalse(stringCheck.isPalindrome("aabb"));
        assertFalse(stringCheck.isPalindrome(null));
        assertFalse(stringCheck.isPalindrome("NotEvenClose"));
        assertTrue(stringCheck.isPalindrome(""));
        assertTrue(stringCheck.isPalindrome("abba"));
        assertTrue(stringCheck.isPalindrome("tattarrattat"));

        // also added this
        assertTrue(stringCheck.isPalindrome("    ")); // assuming only whitespace is still a palindrome - as empty strings seem to be considered one
    }

    /**
     * TBD:
     * - Create tests for the other methods you create in the StringCheck Class
     */

    @Test
    public void testIsEmptyFails(){
        assertFalse(stringCheck.isEmpty("not empty"));
    }

    @Test
    public void testIsEmptyPasses(){
        assertTrue(stringCheck.isEmpty(""));
    }

    @Test
    public void testIsNullFails(){
        assertFalse(stringCheck.isNull("not null"));
    }

    @Test
    public void testIsNullPasses(){
        assertTrue(stringCheck.isNull(null));
    }

    @Test
    public void testIsOnlyWhitespaceFails(){
        assertFalse(stringCheck.isOnlyWhitespace(" not only whitespace"));
    }

    @Test
    public void testIsOnlyWhitespacePasses(){
        assertTrue(stringCheck.isOnlyWhitespace("       "));
    }
}
