import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {

        int year, rate;
        String zodiac = " ";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        year = input.nextInt();
        rate = year%12;

        if      (rate==0) {   zodiac = "Monkey"; }
        else if (rate==1) {   zodiac = "Cockerel"; }
        else if (rate==2) {   zodiac = "Dog"; }
        else if (rate==3) {   zodiac = "Pig"; }
        else if (rate==4) {   zodiac = "Mouse"; }
        else if (rate==5) {   zodiac = "Bullock"; }
        else if (rate==6) {   zodiac = "Tiger"; }
        else if (rate==7) {   zodiac = "Rabbit"; }
        else if (rate==8) {   zodiac = "Dragon";}
        else if (rate==9) {   zodiac = "Snake"; }
        else if (rate==10){   zodiac = "Horse"; }
        else if (rate==11){   zodiac = "Sheep"; }

        System.out.print("Your chinese zodiac sign: "  + zodiac);



    }
}
