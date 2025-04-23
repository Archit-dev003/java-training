import java.util.*;

public class Sum_Array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 0, 9, 8, 7, 6, 4 };
        int[] sum = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++)
            sum[i] = arr1[i] + arr2[i];

        for (int i = 0; i < 6; i++) {
            System.out.println(sum[i]);
        }
    }
}
