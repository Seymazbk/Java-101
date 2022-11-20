package loops;

import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args) {

        //Program that draws an inverted triangle on the screen with asterisks (*)
        // by taking the number of digits from the user and using loops
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = inp.nextInt();
        for (int i=1; i<=n; i++) {
            for (int l=1; l<=i; l++) {
                System.out.print(" ");
            }
            for (int m=1; m<=2*(n-i)+1; m++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }


    }
}
