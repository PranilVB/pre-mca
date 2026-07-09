import java.util.*;
public class Largest_of_three {
            public static void main(String[] args) {
              Scanner ip=new Scanner(System.in);
        System.out.println("Enter 3 number's");
        int N1=ip.nextInt();
        int N2=ip.nextInt();
        int N3=ip.nextInt();
        if(N1>N2){
            if(N1>N3){
                System.out.println(N1+"is the GOAT");
            }
            else{
                System.out.println(N3+"is the GOAT");
            }}
        else {
            if(N2>N3){
                System.out.println(N2+"is the GOAT");
            }
            else{
                System.out.println(N3+"is the GOAT");
            }
            
        }
        }
            }
