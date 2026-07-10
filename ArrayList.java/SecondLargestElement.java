import java.util.*;

public class SecondLargestElement {public static void main(String[] args) {
    

Scanner sc=new Scanner(System.in);
System.out.println("Enter no of emements");
int[] arr=new int[sc.nextInt()];
System.out.println("enter elements of array");
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
 int max=arr[0];
 int max2=arr[0];
for(int i=0;i<arr.length;i++){
    max2=max;
    if (arr[i] > max) {
    max2 = max;
    max = arr[i];
} else if (arr[i] > max2 && arr[i] != max) {
    max2 = arr[i];
}
}
System.out.println(max2);
}
}