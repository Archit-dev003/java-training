import java.util.*;
public class product {
    public static void main(String[] args) {
        Scanner joy = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int n= joy.nextInt();
        int product=1;
        for(int i=1;i<=n;i++)
        {
            product=product*i;
        }
        System.out.print("Product = "+product);
    }
}
