import java.util.Scanner;
public class airTemperature {
    public static void main(String[] args) {
        /*
        Conditions :
Suggest to "Ski" if the temperature is less than 5.
Suggest the "Cinema" event if the temperature is between 5 and 15.
Suggest the "Picnic" event if the temperature is between 10 and 25.
Suggest the "Swimming" event if the temperature is greater than 25.
         */
        int temp;
        Scanner inp = new Scanner(System.in);
        System.out.print("What is the air temperature? ");
        temp = inp.nextInt();
        System.out.print("Activity suggestion:  ");
        if (temp<5) {
            System.out.print("You can ski. ");
        } else if (temp<=25) {
            if (temp <= 15) {
                System.out.println("You can go to the cinema. ");
            }
            if (temp >= 10) {
                System.out.println("You can go to the picnic. ");
            }
        } else {
                System.out.print("You can swim. ");
            }
    }
}
