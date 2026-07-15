import java.util.Scanner;

public class User_Details_Input {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.print("Enter name of student: ");
        String name = ip.nextLine();

        System.out.print("Enter age of student: ");
        int age = ip.nextInt();

        System.out.print("Enter gender of student (M/F): ");
        char gender = ip.next().charAt(0);

        System.out.print("Enter height of student (cm): ");
        double height = ip.nextDouble();

        System.out.println("\n----- User Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Height : " + height + " cm");

        ip.close();
    }
}