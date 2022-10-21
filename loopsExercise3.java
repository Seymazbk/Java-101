import java.util.Scanner;

public class loopsExercise3 {
    public static void main(String[] args) {
//Program that prints powers of 4 and 5 up to the number entered with Java loops
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n= inp.nextInt();

        System.out.print ("multiples of 4: ");
        for (int i=1; i<=n; i*=4) {
                System.out.print(i + ", ");
        }

        System.out.print("multiples of 5:  ");
        for (int i=1; i<=n; i*=5) {
            System.out.print(i + ", ");
        }

    }
}
