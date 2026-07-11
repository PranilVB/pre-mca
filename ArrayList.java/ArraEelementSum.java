import java.util.*;
public class ArraEelementSum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int e=sc.nextInt();
        System.out.println("Enter elements in array");
        int[] arr=new int[e];
        int sum=0;
        for(int i=0;i<e;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum of all elemrnts of array is ="+sum);

    }
}
