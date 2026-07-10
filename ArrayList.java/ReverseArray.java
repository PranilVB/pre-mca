import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of elements");
    int[] arr=new int[sc.nextInt()];
    int length=arr.length;
    System.out.println("Enter elements of array");
    for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       
                int l=0;
                int r=arr.length-1;
                int temp=0;
                for(int j=0;j<arr.length/2;j++){
                    temp=arr[l];
                    arr[l]=arr[r];
                    arr[r]=temp;
                    r--;
                    l++;
                    
                }
                for(int i=0;i<length;i++){
                    System.out.print(arr[i]+" ");
                
        }

    
}

}
