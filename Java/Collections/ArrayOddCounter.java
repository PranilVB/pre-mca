import java.util.Scanner;

public class ArrayOddCounter {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of eleents in array");
        int[] arr=new int[sc.nextInt()];
        int count=0;
        System.out.println("Enter elements in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.println("no. of odd elements are"+count);
    }
}
