import java.util.*;
public class EvenandOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number needed to be checked : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("entered number is even: " + num);
        } else {
            System.out.println("entered number is odd: " + num);
        }
    }
}