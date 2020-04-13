
public class StringCheck {
    /**
     *TBD:
     * - Check if the string is a palindrome (a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam).
     * - Please return True if the string is a palindrome, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isPalindrome (final String str) {

        // Error handling
        if (this.isNull(str)){
            return false;
        }
        else if (this.isEmpty(str)){
            return true;
        }
        else if ( this.isOnlyWhitespace(str)){
            return true;
        }

        String backwards = new StringBuilder(str).reverse().toString();

        if (str.equals(backwards)){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * TBD:
     * - Check if the string is empty
     * - Please return True if string is empty, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isEmpty(final String str) {

        if (str.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * TBD:
     * - Check if the string is null
     * - Please return True if string is null, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isNull(final String str) {

        if (str == null){
            return true;
        }
        else {
            return false;
        }

    }
    
    /**
     * TBD:
     * - Check if the string contains only whitespace
     * - Please return True if string contains only whitespace, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isOnlyWhitespace(final String str) {

        if (str.isBlank()){
            return true;
        }
        else {
            return false;
        }
    }
}
