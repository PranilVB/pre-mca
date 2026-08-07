import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter elements in the array");
         arr[0] = sc.nextInt();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            } 
        }
        System.out.println("Greatest element in array is" + max);
    }

}
