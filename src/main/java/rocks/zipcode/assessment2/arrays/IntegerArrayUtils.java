package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer [] result = new Integer[integerArray.length+1];
        int indexofvalue = integerArray.length;
        for (int i = 0 ; i < integerArray.length ; i ++){
            result[i] = integerArray[i];
        }
        result[indexofvalue] =valueToBeAdded;
        return result;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] replacement = new Integer[integerArray.length];
        for (int i = 0 ; i < integerArray.length ; i ++){
            replacement[i] = integerArray[i];
        }
        replacement[indexToInsertAt] = valueToBeInserted;
        return replacement;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] evenOddArr = new Integer[integerArray.length];
        for (int i = 0 ; i < integerArray.length ; i++){
            if (integerArray[i] % 2 == 0){
               evenOddArr[i] =  integerArray[i]+1;
            } else evenOddArr[i] = integerArray[i]-1;
        }
        return evenOddArr;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] evenArr = new Integer[integerArray.length];
        for (int i = 0 ; i < integerArray.length ; i++){
            if (integerArray[i] % 2 == 0){
                evenArr[i] =  integerArray[i]+1;
            } else evenArr[i] = integerArray[i];
        }
        return evenArr;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] oddArr = new Integer[input.length];
        for (int i = 0 ; i < input.length ; i++){
            if (input[i] % 2 != 0){
                oddArr[i] =  input[i]-1;
            } else oddArr[i] = input[i];
        }
        return oddArr;
    }
}
