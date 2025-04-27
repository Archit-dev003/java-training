import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {

        System.out.print("Enter the size of array:");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[]= new int[n];
        System.out.print("Input elements: ");

        for(int i =0; i<=arr.length-1;i++)
        {
            arr[i]=in.nextInt();
            
        }
        System.out.println(" Reverse of the array is: ");

        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }


    }
}
