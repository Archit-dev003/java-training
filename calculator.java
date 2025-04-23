import java.util.*;
public class calculator {
    /**
     * @param args
     */
    public static void main(String[] args)
     {
        System.out.println("CALUCATOR");
        Scanner in = new Scanner(System.in);

        System.out.println("enter 1st num: ");
        int a = in.nextInt();

        System.out.println("enetr 2nd num: ");
        int b = in.nextInt();

        System.out.println("enter operator: ");
        char c = in.next().charAt(0);

        switch (c) {
            case '+':
            System.out.println("Addition: "+ (a+b));
                break;

                case '-':
                System.out.println("Subtraction: "+ (a-b));
                break;

                case '*':
                System.out.println("Multiplication: "+ (a*b));
                break;

                case '/':
                System.out.println("Division: "+ (a/b));
                break;


            default:
                break;
        }

    }
}
