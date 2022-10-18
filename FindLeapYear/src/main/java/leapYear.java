import java.util.Scanner
        ;
public class leapYear {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);
        System.out.println("Find leap year!" );
        System.out.print( "Enter the year : ");
        year = inp.nextInt();

        if ((year%400==0) || ((year%100!=0)&&(year%4==0))){
            System.out.print( year + " is a leap year.");
        } else {
            System.out.print(year + " isn't a leap year.");
        }
    }
}
