import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner joy = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int n= joy.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.print("Sum = "+sum);
    }
}
