import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;
        while (right > 0) {
            System.out.print ("Enter the username: ");
            userName = inp.nextLine();
            System.out.print ("Enter the password: ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello there. Welcome to The Code Bank. ");
                do {
                    System.out.println( "1- Deposit money \n" +
                                        "2- Withdraw money \n" +
                                        "3- Balance query \n" +
                                        "4- Log out ");
                    System.out.print("Please select the action you want to do. ");
                    select = inp.nextInt();
                    if (select==1) {
                        System.out.println("Money Amount: ");
                        int price = inp.nextInt();
                        balance += price;
                    } else if (select==2) {
                        System.out.println("Money Amount: ");
                        int price = inp.nextInt();
                        if (balance < price) {
                            System.out.println("İnsufficient balance. ");
                        } else {
                            balance -= price;
                        }
                    } else if (select==3) {
                        System.out.println("Your balance: " + balance);
                    }
                } while (select != 4) ;
                System.out.println("See you again.");
                break;
            } else {
                --right;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank. ");
                } else {
                    System.out.println("Your remaining right: " +right);
                }
            }
        }
    }
}
