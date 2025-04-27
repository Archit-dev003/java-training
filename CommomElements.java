import java.util.*;

public class CommomElements {
    public static void main(String[] args) {

        Scanner joy = new Scanner(System.in);
        System.out.print("Enter the size of First array: ");
        int n = joy.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = joy.nextInt();
        }

        System.out.print("Enter the size of Second array: ");
        int m = joy.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = joy.nextInt();
        }
        System.out.println(" ");

        System.out.print("Common elements are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j])
                {
                    System.out.print(arr1[i] + " ");
                }
                 else
                    continue;
            }
        }
    }
}
