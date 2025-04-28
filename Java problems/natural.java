import java.util.*;
public class natural {
    public static void main(String[] args) {
        Scanner joy = new Scanner(System.in);

        System.out.print("Enter the 1st value: ");
        // System.out.println(" ");

        int n = joy.nextInt();
        System.out.print("Enter the 2nd values: ");

        int m = joy.nextInt();
        System.out.print("Even number are: ");
        int count=0;
        for(int i=n;i<=m;i++)
        {
            if (i%2==0) {
                System.out.print(i + " ");
                count++;
            }
        }
                System.out.println(" ");

        System.out.println("Total even nums are: " + count);

    }
}
