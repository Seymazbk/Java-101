import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg, m;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the weight in kg:  ");
        kg = inp.nextDouble();
        System.out.print("Enter the height in meters:  ");
        m = inp.nextDouble();
        double bmi = kg/(m*m);
        System.out.println("Body mass index: "  +bmi);


    }
}
