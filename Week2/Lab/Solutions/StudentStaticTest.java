/* 
     Native App Studio Course UvA
     The class depicting a Student demonstrating the behaviour of a static variable.
     
     To compile: javac StudentTest.java
     To run: java StudentTest
     
*/
class Student {

    static int studentCount;
    
    // Properties of the class
    private String name;
    private String program;
    private int studentNumber;
    private int credits;

    // Constructor of the class
    public Student(String aName, String aProgram, int aStudentNumber, int someCredits) {
        name = aName;
        program = aProgram;
        studentNumber = aStudentNumber;
        credits = someCredits;
    }
}

// The class used to contain the main method
class StudentStaticTest {
    
    // The main method is the start of the program
    public static void main(String[] args) {
        
        System.out.println("Running main!");
        
        Student al = new Student("Ada Lovelace", "Computer Science", 61283, 180);
        al.studentCount = 1;
        
        Student ik = new Student("Immanuel Kant", "Philosophy", 81148, 180);
        ik.studentCount = 2;
        
        Student ja = new Student("Jeanne d'Arc", "History", 90382, 40);
        ja.studentCount = 3;
        
        // What is the value of studentCount?
        System.out.println("The value of studentCount: " + Student.studentCount);
    }
}
