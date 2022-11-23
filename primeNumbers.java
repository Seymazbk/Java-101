package loops;

public class primeNumbers {
    public static void main(String[] args) {
        //Write a program that prints prime numbers from 1 to 100 in Java.
        System.out.println("Prime numbers from 1 to 100");

        for(int i=2; i<=100; i++) {
            boolean isPrime = true;
            for(int n=2; n<i; n++){
                if (i%n==0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
    }
}
