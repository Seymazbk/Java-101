import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        // calculate the mean of the numbers divisible by 3 and 4 up to the entered number
        int k, total=0, n=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number: ");
        k=inp.nextInt();

        for (int i=1; i<=k; i++) {
            if(i%3==0 && i%4==0 ){
                n++;
                total+=i;
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.print("Average of numbers divisible by 3 and 4 up to the entered number: " +total/n);



    }

}
