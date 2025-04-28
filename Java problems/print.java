import java.util.*;
public class print {
    public static void main(String[] args) {

        Scanner joy = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n= joy.nextInt();

        System.out.print("Numbers are: ");

        for(int i=1;i<=n;i++)
        {
            System.out.print(i + " ");
        }

    }
}
