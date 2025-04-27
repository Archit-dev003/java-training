import java.util.*;
public class TotalEvenOddNums {
    public static void main(String[] args) {
        
        Scanner joy= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=joy.nextInt();
        int[] block =new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0;i<block.length;i++)
        {
            block[i]=joy.nextInt();
        }
        int EvenCount=0,OddCount=0;
        for(int i=0;i<block.length;i++)
        {
            if(block[i]%2==0)
            EvenCount++;

            else
            OddCount++;
        }
        System.out.println("Number of Even elements: "+ EvenCount);
        System.out.println("Number of Odd elements: "+ OddCount);
    }
}
