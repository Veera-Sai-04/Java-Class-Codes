import java.util.*;
 public class WithInTheRange{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
         int a=sc.nextInt();
         if(a>=10&&a<=100){
             System.out.println("within range");
         }
         else{
             System.out.println("invalid range");
         }
     }
 }