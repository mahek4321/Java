public class Main {
    public static void main(String[] args) {

        GraduateStudent gs = new GraduateStudent(
                "Harshini",
                21,
                101,
                89.5,
                "Computer Science"
        );

        System.out.println("===== Graduate Student Details =====");
        gs.displayGraduateStudent();
    }
}