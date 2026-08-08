public class ObjectExample {

    static class Student {
        int rollNumber;
        String name;
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.rollNumber = 5;
        student.name = "Pranil";

        System.out.println(student.rollNumber);
        System.out.println(student.name);
    }
}