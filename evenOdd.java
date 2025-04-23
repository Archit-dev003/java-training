public class evenOdd {
    public static void main(String[] args) 
    {
        System.out.println("Even or Odd?");

        int num = 6789;
        int sum;
        for(int i = 0;i<=3;i++)
        {
            int e;
            sum = num%10;
            e=sum;
            num = num/10;

            if(sum%2==0)
            System.out.println(sum +" even");
          else
            System.out.println(sum+ " odd");
        }    
    }
}
