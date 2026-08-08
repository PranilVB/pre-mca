public class MultipleObjectsExample {

    static class Student {
        int rollNumber;
        String name;

        Student(int rollNumber, String name) {
            this.rollNumber = rollNumber;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student(5, "Pranil");
        Student student2 = new Student(10, "Rahul");

        System.out.println(student1.name);
        System.out.println(student2.name);

        System.out.println(student1.rollNumber);
        System.out.println(student2.rollNumber);
    }
}