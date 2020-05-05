import java.util.Arrays;

public class Calculator {

	/**
     * TBD:
     * - Add all Integers together
     * - Note: do not change method signature
     */
    public Integer sumAllNumbers(final Integer... valuesParam){

        if (valuesParam == null){
            return null;
        }

        Integer sum = 0;

        for (Integer i : valuesParam){
            sum += i;
        }

        return sum;
    }
    
	/**
     * TBD:
     * - Multiply all Integers together
     * - Note: do not change method signature
     */
    public Integer multiplyAllNumbers(final Integer... valuesParam){

        if (valuesParam == null){
            return null;
        }

        Integer prod = 1;

        for (Integer i : valuesParam){
            prod *= i;
        }

        return prod;
    }
}
