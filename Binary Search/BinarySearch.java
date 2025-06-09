import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element");
        int n = sc.nextInt();
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = a.length-1;
        boolean found = false;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(a[mid]==n){
                System.out.println("Element found at index "+mid);
                found = true;
                break;
            }
            else if(a[mid]<n){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
