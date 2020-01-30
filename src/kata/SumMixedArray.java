package kata;

import java.util.List;

public class SumMixedArray {
    //Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
    //
    //Return your answer as a number.
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object o : mixed) {
            sum += Integer.parseInt(o.toString());
        }
        return sum;
    }
}
