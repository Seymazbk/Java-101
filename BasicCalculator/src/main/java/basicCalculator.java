import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {

        int number1, number2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        number1 = input.nextInt();
        System.out.println("Enter the 2nd number");
        number2 = input.nextInt();

        System.out.println("1-addition\n2-deduction\n3-multiplication\n4-division");
        System.out.print("Choose: ");
        select = input.nextInt();

        switch (select) {
            case 1 :
                System.out.println("addition= " + (number1+number2));
                break;
            case 2:
                System.out.println("deduction= " +(number1-number2));
                break;
            case 3:
                System.out.println("multiplication= " +(number1*number2));
                break;
            case 4:
                switch (number2){
                    case 0 :
                        System.out.println("A number cannot be divided by zero");
                        break;
                    default :
                        System.out.println("division= " + (number1/number2));
                }
                break;
            default :
                System.out.println("You made a wrong choice. Try again.");
        }

    }
}
