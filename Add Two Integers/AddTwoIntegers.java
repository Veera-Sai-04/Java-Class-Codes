import java.util.*;

public class AddTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer (M): ");
        int M = sc.nextInt();
        System.out.print("Enter the second integer (N): ");
        int N = sc.nextInt();
        int sum = M + N;
        System.out.println("The sum of M and N is: " + sum);
        sc.close();
    }
}
