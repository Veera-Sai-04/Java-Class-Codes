import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int A = sc.nextInt();
        System.out.print("Enter value of B: ");
        int B = sc.nextInt();
        System.out.println("Before swapping: A = " + A + ", B = " + B);
        int temp = A;
        A = B;
        B = temp;
        System.out.println("After swapping: A = " + A + ", B = " + B);
    }
}
