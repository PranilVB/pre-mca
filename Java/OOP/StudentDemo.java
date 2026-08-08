public class StudentDemo {
    public static void main(String[] args) {
        Student Pranil = new Student(5, "Pranil", 99f);
        Student Koustubh = new Student(2, "Koustubh", 95f);
        System.out.println(Pranil.Rollnum);
        System.out.println(Pranil.Name);
        System.out.println(Pranil.Marks);
        System.out.println(Koustubh.Rollnum);
        System.out.println(Koustubh.Name);
        System.out.println(Koustubh.Marks);
        
    }

   
} 
class Student{
        int Rollnum;
        String Name;
        Float Marks;
        Student(int r,String n,float m){
        this.Rollnum=r;
        this.Name=n;
        this.Marks=m;
        }
    }
