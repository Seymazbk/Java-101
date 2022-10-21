import java.util.Scanner;

public class loopsExercise2 {
    public static void main(String[] args) {

        int k, total=0;
        Scanner inp= new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            k = inp.nextInt();
            if (k % 4 == 0) {
                total += k;
            }
        } while (k%2==0) ;

        System.out.print("\"Sum of numbers that are a multiple of 4 from the entered numbers::" + total);


    }
}
