package lecture01;

/**
 * Demonstrates object instantiation and the use of parameterized constructors in Java.
 */
public class Code {

    public static void main(String[] args) {

        /*
         * APPROACH 1: Manual Initialization (Commented Out)
         *
         * Student student = new Student();
         * student.rollNumber = 18;
         * student.marks = 100.0f;
         * student.name = "Vijay Hiremath";
         *
         * Drawbacks: This approach is repetitive, clutters the main logic,
         * and makes the code harder to maintain.
         */

        /*
         * APPROACH 2: Constructor Initialization (Recommended)
         *
         * A constructor is a special method that runs automatically when an
         * object is instantiated. It allows us to pass values immediately
         * upon creation, keeping the code clean and concise.
         */
        Student student = new Student(13, "Vijay Hiremath", 100.0f);

        // Output the initialized values to the console
        System.out.println("Student Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Marks: " + student.marks);
    }
}

/**
 * Represents a Student entity with basic academic details.
 */
class Student {

    // Instance variables
    int rollNumber;
    String name;
    float marks;

    /**
     * Parameterized constructor to initialize a new Student object.
     *
     * @param rollNumber The unique roll number assigned to the student.
     * @param name       The full name of the student.
     * @param marks      The academic marks achieved by the student.
     */
    public Student(int rollNumber, String name, float marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
}