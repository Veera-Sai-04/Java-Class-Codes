import java.util.Scanner;

public class Student_Marks_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println(" Pass with A grade");
        }
        else if (marks >= 70) {
            System.out.println(" Pass with B grade");
        }
        else if (marks >= 60) {
            System.out.println(" Pass with C grade");
        }
        else if (marks >= 50) {
            System.out.println(" Pass with D grade");
        }
        else {
            System.out.println(" Faile ");
        }
    }
}