import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm =2.20, startprice = 10, totalprice;

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the distance traveled in kilometers: ");
        km = input.nextInt();

        totalprice = (km*perKm);
        totalprice += startprice;
        totalprice = (totalprice < 20) ? 20 : totalprice;

        System.out.println("Total Price: " + totalprice);




    }
}
