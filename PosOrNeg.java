import java.util.*;
public class PosOrNeg {
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);

        System.out.println("enter your number: ");
        int n = in.nextInt();

        if(n>0)
        System.out.println("positive");

        else if(n<0)
        System.out.println("negative");

        else
        System.out.println("zero");
    }
}
