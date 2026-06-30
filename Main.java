// The Main class contains the entry point to run the program and print the output
public class Main {
    public static void main(String[] args) {
        // 1. Create an instance of the Student class
        Student student = new Student();

        // 2. Set the data using setter methods (Encapsulation)
        student.setStudentID("CU12345");
        student.setName("Ali");
        student.setCGPA(3.75);
        student.setProgramme("BIT"); // From Activity 3.1

        // 3. Retrieve and print data using getter methods to match Expected Output
        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Name       : " + student.getName());
        System.out.println("CGPA       : " + student.getCGPA());
        System.out.println("Programme: " + student.getProgramme());
    }
}

// The Student class holding the data blueprint (Non-public class in the same file)
class Student {

    // Private fields - cannot be accessed directly outside this class
    private String studentID;
    private String name;
    private double cgpa;
    private String programme;

    // --- SETTER METHODS ---
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    // --- GETTER METHODS ---
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getProgramme() {
        return programme;
    }
}
