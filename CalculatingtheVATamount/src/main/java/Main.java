import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price, vatRate = 0.18, vatAmount, withVat;

        Scanner input = new Scanner (System.in);
        System.out.print ("Enter the price : ");
        price = input.nextDouble();

        vatAmount = price * vatRate;
        withVat = vatAmount+price ;

        System.out.println("Price without vat : " + price);
        System.out.println("VAT rate : " + vatRate );
        System.out.println ("VAT amount : " + vatAmount);
        System.out.println("Price with VAT :" + withVat );


    }
}
