import java.util.*;
public class print_array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int[] arr=new int[n];

        // int[] arr={1,2,3,4,5,6,7};
        System.out.println("enter value of arr");

        for(int i=0;i<n;i++)
        arr[i]=in.nextInt();

    for(int k=0;k<arr.length;k++)
    System.out.println(arr[k]);

    }
}
