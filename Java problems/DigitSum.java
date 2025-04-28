import java.util.*;
public class DigitSum {
    public static void main(String[] args) {
        Scanner joy = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n= joy.nextInt();
        System.out.print("Total digits are: ");

        int count=0;
        while (n%10!=0) {
            count++;
            n=n/10;
        }
        System.out.print(count);
    }
}
