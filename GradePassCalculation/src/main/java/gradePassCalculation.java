import java.util.Scanner;

public class gradePassCalculation {
    public static void main(String[] args) {
        /* Courses: Mathematics, Physics, Turkish, Chemistry, Music
        Passing Grade : 55
        Homework
        If the course grades entered are not between 0 or 100, they should not be included in the average.
        */

        int mat, phy, turk, che, mus, courses=0, total=0;
        double gpa;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your math grade: ");
        mat = inp.nextInt();
        if ((0<=mat)&&(mat<=100)) {
            total+=mat;
            courses++;
        } else {
            System.out.println("You entered an invalid value. Your grade will not be included in the average.");
        }
        System.out.print("Enter your physics grade: ");
        phy = inp.nextInt();
        if ((0<=phy)&&(phy<=100)) {
            total+=phy;
            courses++;
        } else {
            System.out.println("You entered an invalid value. Your grade will not be included in the average.");
        }
        System.out.print("Enter your turkish grade: ");
        turk = inp.nextInt();
        if ((0<=turk)&&(turk<=100)) {
            total+=turk;
            courses++;
        } else {
            System.out.println("You entered an invalid value. Your grade will not be included in the average.");
        }
        System.out.print("Enter your chemistry grade: ");
        che= inp.nextInt();
        if ((0<=che)&&(che<=100)) {
            total+=che;
            courses++;
        } else {
            System.out.println("You entered an invalid value. Your grade will not be included in the average.");
        }
        System.out.print("Enter your music grade: ");
        mus  = inp.nextInt();
        if ((0<=mus)&&(mus<=100)) {
            total+=mus;
            courses++;
        } else {
            System.out.println("You entered an invalid value. Your grade will not be included in the average.");
        }
        if (courses==0) {
            System.out.print("You must enter at least 1 valid value.");
        } else {
            gpa = total/courses;
            System.out.println("your average: " + gpa);
            if (gpa>=55) {
                System.out.println("You passed the class. Congrats! ");
            } else {
                System.out.println("You failed the class.See you next year.");
            }

        }


    }
}
