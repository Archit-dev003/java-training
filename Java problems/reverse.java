import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner joy= new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = joy.nextInt();

        System.out.print("Reverse order is: ");

        for(int i=n;i>0;i--)
        {
            System.out.print(i + " ");
        }

    }
}
