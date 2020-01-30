package kata;

public class SquareDigit {
//Welcome. In this kata, you are asked to square every digit of a number.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//Note: The function accepts an integer and returns an integer
    public static int squareDigits(int n) {
        int squaredNumber = 0;
        int squaredPlace = 1;
        while (true) {
            int digitToSquare = n / 10;
            if (digitToSquare == 0) {
                digitToSquare = n % 10;
                int squaredDigit = digitToSquare * digitToSquare;
                squaredNumber += squaredDigit * squaredPlace;
                break;
            } else {
                digitToSquare = n % 10;
                int squaredDigit = digitToSquare * digitToSquare;
                squaredNumber += squaredDigit * squaredPlace;
                if (squaredDigit / 10 > 0)
                    squaredPlace *= 100;
                else
                    squaredPlace *= 10;
                n /= 10;
            }
        }
        return squaredNumber;
    }
}