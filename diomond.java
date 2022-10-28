import java.util.Scanner;

public class diomond {
    public static void main(String[] args) {
        /*
             *
            ***
           *****
          *******
         *********
          *******
           *****
            ***
             *
         */
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = scan.nextInt();

        for (int i=1; i<=n; i++) {
            for (int k=1; k<=(n-i); k++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l=1; l<=n; l++) {
            for (int y=1; y<=l; y++) {
                System.out.print(" ");
            }
            for (int z=1; z<=(2*n-(2*l+1)); z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
