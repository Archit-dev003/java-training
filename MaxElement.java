import java.util.*;
public class MaxElement {
    public static void main(String[] args) {
        
        Scanner joy = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = joy.nextInt();
        int[] arr = new int[n];

        System.err.println("Enter the Elements: ");

        for(int i=0;i<n;i++)
        {
            arr[i]= joy.nextInt();
        }

        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>max)
           max=arr[i];

           else
           continue;
        }
        System.out.println("The Max element is: "+ max);

    }
}
