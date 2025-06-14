import java.util.*;
public class GreatestNum{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num2 = sc.nextInt();
        if(num>=num1&&num>=num2){
            System.out.println("first number is greater number among the three number: "+num);
        }
        else if(num1>=num&&num1>=num2) {
            System.out.println("second number is greater number among the three number: "+num1);
        }
        else{
            System.out.println("third number is greater number among the three number: "+num2);
        }
    }
}