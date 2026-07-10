import java.util.Scanner;

public class ArrayMin {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter elements in the array");
         arr[0] = sc.nextInt();
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]<min) {
                min = arr[i];
            } 
        }
        System.out.println("Smallest element in array is" + min);
    }

}
