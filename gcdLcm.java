package loops;

import java.util.Scanner;

public class gcdLcm {
    public static void main(String[] args) {

        //Write the GCD and LCM values of two numbers in Java using the "While Loop".
        int num1, num2, s;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        num2 = scan.nextInt();

        if (num1 < num2) {
            s=num1;
        } else {
            s=num2;
        }
        int i=s;
        while (i>=1) {
            if (num1%i==0 && num2%i==0){
                System.out.println("Greatest Common Divisor: "  + i);
                break;
            } else {
                i--;
            }
        }
        int l=1;
        while (l<=(num1*num2)) {
            if (l%num1==0 && l%num2==0) {
                System.out.println("Least Common Multiple: "  + l);
                break;
            } else {
                l++;
            }
        }
    }
}
