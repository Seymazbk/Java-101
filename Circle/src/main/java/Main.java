import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        r= input.nextInt();
        double circuit = 2*pi*r ;
        double area = pi*r*r ;
        System.out.println("circle circumference:  "  + circuit);
        System.out.println("circle area: " + area);



    }
}
