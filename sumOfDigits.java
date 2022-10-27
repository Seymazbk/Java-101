import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        // Program to calculate the sum of digits of a number

        int n, total=0;
        Scanner  inp = new Scanner (System.in);
        System.out.print("Enter the number:  ");
        n = inp.nextInt();

        while (n != 0) {
            total += (n % 10);
            n /= 10;
        }
        System.out.print(" Sum of Digits: " +total);
    }
}
