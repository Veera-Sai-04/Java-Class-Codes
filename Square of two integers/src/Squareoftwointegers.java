import java.util.Scanner;

public class Squareoftwointegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        // Check if M is greater than N
        if (M > N) {
            System.out.println("Invalid input: M should be less than or equal to N.");
        } else {
            int sum = 0;

            for (int i = M; i <= N; i++) {
                sum += i * i;
            }
            System.out.println("Sum of squares from " + M + " to " + N + " is: " + sum);
        }

    }
}
