import java.util.*;
public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int[] arr=new int[sc.nextInt()];
        System.out.println("enter the elements");
        int sum=0;
        System.out.println(arr.length);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        } 
       System.out.println("Average of all the elements in array is "+ Average(sum, arr.length));
    }
static int Average(int sum,int length){
    int Avg=sum/length;
    return(Avg);
}
    
}
