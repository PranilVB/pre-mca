import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number");
        int N=ip.nextInt();
        System.out.println("Number is "+N);
        int M=N%2;
        if(M==0){
            System.out.println("its even");
        }
        else{
            System.out.println("its odd");
        }
    }
    
}
