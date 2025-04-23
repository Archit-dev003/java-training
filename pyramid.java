public class pyramid {
    public static void main(String[] args) 
    {
        int[][] arr={{12,4,5,3,7},{3,6,4,3,0}};

        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            count++;
        }
        System.out.println(count);
        int[] sum = new int[count];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
              {
                sum[k]=arr[i][j];
                k++;
              }
    
       }
    
        System.out.println("variables " + count);
        for(int i=0;i<count;i++)
        {
            System.out.print("{ " + sum[i] + " }" + ",");
        }

    }
    
}
