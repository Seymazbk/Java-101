import java.util.Scanner;

public class ranking {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the 3 numbers you want to sort in ascending order.");

        System.out.print("Enter the 1st number ");
        a= inp.nextInt();
        System.out.print("Enter the 2nd number ");
        b= inp.nextInt();
        System.out.print("Enter the 3rd number ");
        c= inp.nextInt();
        if ((a<b)&&(a<c)) {
           if (b<c) {
               System.out.print("a<b<c");
           } else {
               System.out.print("a<c<b");
           }
        }else if ((b<a)&&(b<c)) {
            if (a<c) {
                System.out.print("b<a<c");
            } else {
                System.out.print("b<c<a");
            }
        }else {
            if (a<b) {
                System.out.print("c<a<b");
            } else {
                System.out.print("c<b<a");
            }
        }


    }
}
