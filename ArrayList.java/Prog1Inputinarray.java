import java.util.*;
public class Prog1Inputinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements in array");
        int a=sc.nextInt();
        int[] x=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter element at position"+i+":-");
            x[i]=sc.nextInt();
                        System.out.println(Arrays.toString(x));

        }

    }
    
}
