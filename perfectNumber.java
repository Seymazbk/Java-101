package loops;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        //A number whose positive integer factors are equal to itself, excluding the number itself, is called a perfect number.

        Scanner input = new Scanner(System.in);
        int n, total=0;
        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int i=1; i<n; i++) {
            if (n%i==0) {
                total += i;
            }
        }
        if (n==total){
            System.out.println(n + " is the perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");

        }

    }
}
