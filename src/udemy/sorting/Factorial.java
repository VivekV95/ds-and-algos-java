package udemy.sorting;

public class Factorial {

    public static int performFactorialIterative(int num) {
        if (num == 0)
            return 1;
            int factorial = 1;
            for (int i = num; i >= 1; i--) {
                factorial *= i;
            }
            return factorial;
    }
    public static int performFactorialRecursive(int num) {
        if (num == 0)
            return 1;
        else {
            return num * performFactorialRecursive(num - 1);
        }
    }
}
