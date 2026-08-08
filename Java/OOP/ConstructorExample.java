public class ConstructorExample {

    static class Student {
        int rollNumber;
        String name;
        float marks;

        Student(int rollNumber, String name, float marks) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {

        Student student = new Student(5, "Pranil", 99f);

        System.out.println(student.rollNumber);
        System.out.println(student.name);
        System.out.println(student.marks);
    }
}