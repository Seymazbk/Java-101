import java.util.Scanner;

public class horoscope {
    public static void main(String[] args) {

        int day, month;
        String zodiac = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("What month were you born in? ");
        month = inp.nextInt();
        System.out.print("What day of the month were you born? ");
        day = inp.nextInt();

        if ((month >= 1) && (month <= 12) && (day >= 1)) {
            if ((month == 3) && (day > 20 && day <= 31) || (month == 4) && (day < 21)) {
                zodiac = "Aries";
            } else if ((month == 4) && (day > 20 && day <= 30) || (month == 5) && (day < 22)){
                zodiac = "Taurus";
            } else if ((month == 5) && (day > 21 && day <= 31) || (month == 6) && (day < 23)){
                zodiac = "Gemini";
            } else if ((month == 6) && (day > 22 && day <= 31) || (month == 7) && (day < 23)){
                zodiac = "Cancer";
            } else if ((month == 7) && (day > 22 && day <= 31) || (month == 8) && (day < 23)){
                zodiac = "Leo";
            } else if ((month == 8) && (day > 22 && day <= 31) || (month == 9) && (day < 23)){
                zodiac = "Virgo";
            } else if ((month == 9) && (day > 22 && day <= 31) || (month == 10) && (day < 23)){
                zodiac = "Libra";
            } else if ((month == 10) && (day > 22 && day <= 31) || (month == 11) && (day < 22)){
                zodiac = "Scorpio";
            } else if ((month == 11) && (day > 21 && day <= 31) || (month == 12) && (day < 22)){
                zodiac = "Sagittarius";
            } else if ((month == 12) && (day > 21 && day <= 31) || (month == 1) && (day < 22)){
                zodiac = "Capricorn";
            } else if ((month == 1) && (day > 21 && day <= 31) || (month == 2) && (day < 20)){
                zodiac = "Aquarius";
            } else if ((month == 2) && (day > 19 && day <= 31) || (month == 3) && (day < 21)){
                zodiac = "Pisces";
            } else {
                System.out.print("No date found. Please enter your birthday from 1-31.");
            }
        } else {
            System.out.print("No date found. Please enter your month of birth, a value from 1 to 12.");
        }
        System.out.print("Your zodiac sign: " + zodiac);

    }
}