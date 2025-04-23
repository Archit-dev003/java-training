import java.util.*;
public class linear_Search {
    public static void main(String[] args)
     {
        System.out.print("Enter the size of array:  ");
        Scanner joy = new Scanner(System.in);

        int n= joy.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements of Array: ");

        for(int i=0;i<n;i++)
        {
          arr[i] = joy.nextInt();
        }

        System.out.println("Enter the number you want to find: ");
        int k = joy.nextInt();

        boolean found = false;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == k)
            {found = true;

            break;}
        }

        if(found)
        System.out.println(k+ " found");

        else
        System.out.println(k+ " not found");
    }

}
