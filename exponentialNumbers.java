import java.util.Scanner;
public class exponentialNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,k,total=1;
        System.out.print("Enter the number to calculate the exponent:  ");
        n=scan.nextInt();
        System.out.print("Enter the number to be the exponent:  ");
        k=scan.nextInt();
        for (int i=1; i<=k;i++) {
            total*=n;
        }
        System.out.print("Answer:  " +total);


    }
}
