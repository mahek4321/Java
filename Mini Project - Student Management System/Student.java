public class Student extends Person {
    protected int rollNumber;
    protected double marks;

    // Constructor
    public Student(String name, int age, int rollNumber, double marks) {
        super(name, age);  // calling parent constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Display method
    public void displayStudent() {
        displayPerson(); // inherited method
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}