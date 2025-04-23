public class loop {
    public static void main(String[] args) {
        // for(int i=0; i<5; i++)
        // System.out.println("Joyboy");

        // int j=0;
        // while (j<6) {
        // System.out.println("Camellya");
        // j++;
        // }
        int i;
        for ( i= 0; i <= 5; i++) {
            System.out.println(" ");

            for (int j = 5; j >= i; j--)
                System.out.print(" ");

            for (int  j= 0;  j<= i; j++)
                System.out.print("*");

            for (int  j= 1;  j<= i; j++)
                System.out.print("*");

        }

        for (i = 1; i <= 5; i++) {
            System.out.println(" ");

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int  j= 5;  j>= i; j--)
                System.out.print("*");

            for (int j = 4; j >= i; j--)
                System.out.print("*");
        }

    }
}
