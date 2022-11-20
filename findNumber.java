package loops;

import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {
        //Finding Min and Max Values from Entered Numbers

        Scanner inp = new Scanner(System.in);
        int numberCounter, min=1, max=1;
        System.out.print("How many numbers will you enter? ");
        numberCounter = inp.nextInt();
        for (int i=1; i<=numberCounter; i++) {
            System.out.print(i + ". Enter the number: ");
            int number = inp.nextInt();
            if (i==1) {
                min=number;
                max=number;
            } else if (number>max) {
                max=number;
            } else if (number<min) {
                min=number;
            }
        }
        System.out.println("Biggest number = " + max);
        System.out.println("Smallest number = " + min);


    }
}
