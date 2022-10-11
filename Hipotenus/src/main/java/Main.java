import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c ;

        Scanner deger = new Scanner (System.in);
        System.out.print("1. kenarı giriniz: ");
        a = deger.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b = deger.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs: "  + c);
    }
}
