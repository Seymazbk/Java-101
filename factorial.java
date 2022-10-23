import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int n=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Factorial number: ");
        n=input.nextInt();
        int total=1;

        for (int i=1; i<=n; i++) {
            total= total*i;
        }
        System.out.print(n + ". Factorial= " + total);
    }
}
