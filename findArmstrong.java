public class findArmstrong {
    public static void main(String[] args) {
        //Program to find armstrong numbers 1-999

        System.out.print("Armstrong numbers 1-999");
        int k=999;

        for (int number=1; number<=k; number++ ) {
            int tempNumber = number;
            int nDigit=0;
            int nValue;
            int nPow;
            int result=0;


            while (tempNumber != 0) {
                tempNumber /= 10;
                nDigit++;
            }
            tempNumber = number;

            while (tempNumber!=0 ) {
                nValue = tempNumber % 10;
                nPow=1;
                for (int i=1; i<=nDigit; i++ ){
                    nPow *= nValue;
                }
                result += nPow;
                tempNumber /= 10;
            }
            if (result == number) {
                System.out.println(number + " is an Armstrong number.");
            }

        }
    }
}
