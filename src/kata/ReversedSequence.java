package kata;

public class ReversedSequence {
    //Get the number n (n>0) to return the reversed sequence from n to 1.
    //
    //Example : n=5 >> [5,4,3,2,1]

    public static int[] reverse(int n){
        int[] reversedSequence = new int[n];
        for (int i = 0; i < n; i++) {
            reversedSequence[i] = n - i;
        }
        return reversedSequence;
    }
}
