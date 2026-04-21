public class GraduateStudent extends Student {
    private String specialization;

    // Constructor
    public GraduateStudent(String name, int age, int rollNumber, double marks, String specialization) {
        super(name, age, rollNumber, marks);
        this.specialization = specialization;
    }

    // Display method
    public void displayGraduateStudent() {
        displayStudent(); // inherited
        System.out.println("Specialization: " + specialization);
    }
}