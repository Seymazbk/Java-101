import java.util.Scanner;

public class harmonicSeies {
    public static void main(String[] args) {
        // 1 + 1/2 + 1/3 + 1/4 +...+ 1/n
        int n;
        double soh=0;
        Scanner inp = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = inp.nextInt();
        for (double i=1; i<=n; i++ ) {
            soh += (1/i);
        }
        System.out.println(soh);



    }
}
