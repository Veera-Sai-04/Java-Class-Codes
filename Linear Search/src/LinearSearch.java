import java.util.*;
 public class LinearSearch {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int [] a ={1,2,3,4,5,6,7,8,9,10};
         System.out.println("Enter the element");
         int n=sc.nextInt();
         boolean found=false;
         for(int i=0;i< a.length;i++){
             if(a[i]==n) {
                 System.out.println("element found" + i);
                 found = true;
                 break;

             }
         }
         if(!found){
             System.out.println("element not found");
         }
     }
 }
