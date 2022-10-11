import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14;

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        r = input.nextInt();
        System.out.print("Enter the central angle measure:");
        a = input.nextInt();

        double area = (pi*(r*r)*a)/360 ;
        System.out.println("Area of the circle section: " + area);






    }
}
