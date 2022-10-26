import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)

        int n,r, i;
        long fn=1, fr=1, fd=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Combination Calculator");
        System.out.print("number of elements (n) : ");
        n=scan.nextInt();
        System.out.print("number of choices (r) : ");
        r=scan.nextInt();

        for (i=1; i<=n; i++) {
            fn *=i;
        }
        for (i=1; i<=r; i++) {
            fr *=i;
        }
        for (i=1; i<=(n-r); i++) {
            fd *=i;
        }
        double result = fn/(fr*fd);

        System.out.print("Combination = "  + result);
    }
}
