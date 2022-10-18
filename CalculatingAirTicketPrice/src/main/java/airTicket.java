import java.util.Scanner;

public class airTicket {
    public static void main(String[] args) {

        int km, age, type;
        double price = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the distance to travel in kilometers:  ");
        km = inp.nextInt();
        System.out.print("Enter the passenger age: ");
        age = inp.nextInt();
        System.out.print("Enter the type of journey (1 if one way, 2 if round trip): ");
        type = inp.nextInt();
        double total = (km*0.1);

        if (km>0&&age>0&&(type<3&&type>0)) {
            if (age<12) {
                price = total*0.5;
            } else if (age>=12&&age<=24){
                price = total-(total*0.1);
            } else if (age>=65) {
                price = total-(total * 0.3);
            } else if (age>24&&age<65) {
                price = total;
                }
            if (type==1) {
                System.out.print("Total trip amount:  " + price);
            } else {
                System.out.print("Total trip amount:  " + 2*(price-(price*0.2)));
            }
        } else {
            System.out.print("You entered incorrect data.");
        }
    }
}
