import java.util.Scanner;

public class Ucgen {
        public static void main(String[] args) {
            int a,b,c;
            Scanner kenar = new Scanner(System.in);
            System.out.print("1. kenarı girin: ");
            a = kenar.nextInt();
            System.out.print("2. kenarı girin: ");
            b = kenar.nextInt();
            System.out.print("3. kenarı girin: ");
            c = kenar.nextInt();
            double u,cevre;
            double alan;
            u = (a+b+c)/2;
            cevre = 2*u;
            alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
            System.out.println("Üçgenin Çevresi: " + cevre + " Üçgenin Alanı: " + alan);
        }
}
