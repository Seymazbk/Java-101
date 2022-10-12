import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        String userName, password, newpassword;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your username: ");
        userName = inp.nextLine();
        System.out.print("Enter your password: ");
        password = inp.nextLine();

        if (userName.equals ("patika")&& password.equals("java123")) {
            System.out.println("You logged in! ");
        } else {
            System.out.println("Your information is wrong! ");
            System.out.println("Would you like to reset your password? If yes, write 1, if no, write 2.");
            int answer = inp.nextInt();

            switch (answer) {
                case 1 :
                    System.out.print("Enter new password: ");
                    inp.nextLine();
                    newpassword = inp.nextLine();
                    if (newpassword.equals("java123")) {
                        System.out.print("your password cannot be the same as the old one. ");
                    } else {
                        System.out.print("Your password is reset.");
                    }
                    break;
                case 2:
                    System.out.print("Ok. Try logging in with the old password");
                    break;
                default:
                    System.out.print("Please make a selection.");



            }
        }

    }
}
