public class ThisKeywordExample {

    static class Student {
        int rollNumber;
        String name;

        Student(int rollNumber, String name) {
            this.rollNumber = rollNumber;
            this.name = name;
        }

        void display() {
            System.out.println(this.rollNumber);
            System.out.println(this.name);
        }
    }

    public static void main(String[] args) {

        Student student = new Student(5, "Pranil");

        student.display();
    }
}