/* 
     Native App Studio Course UvA
     A simulation of what an adapter class is doing behind the scene but in a very simplified manner.
     
     To compile: javac AdapterTest.java
     To run: java AdapterTest
     
*/


/*
    A class depicting a student. For this example it contains only getters since we do not
    actually need to set values.
*/
class Student {

    static final String UNIVERSITY_NAME = "University of Amsterdam";
    static int studentCount;
    
    private String name;
    private String program;
    private int studentNumber;
    private int EC;

    public Student(String aName, String aProgram, int aStudentNumber, int someEC) {
        name = aName;
        program = aProgram;
        studentNumber = aStudentNumber;
        EC = someEC;
    }

    public int getEC() {
        return EC;
    }

    public String getName() {
        return name;
    }


    public String getProgram() {
        return program;
    }


    public int getStudentNumber() {
        return studentNumber;
    }
}

/*
    ....
*/
enum LayoutType {
        DASH, CIRCLE, STAR;
}


/* 
    ....
*/
class ArrayAdapter {
    
    private Student[] studentArray;
    private LayoutType layoutType;
    
    public ArrayAdapter(Student[] studentArray, LayoutType layoutType) {
        this.studentArray = studentArray;
        this.layoutType = layoutType;
    }
    
    public void start() {
        for (int i = 0; i < studentArray.length; i++) {
            Student currentStudent = studentArray[i];
            String currentRow = createRow(currentStudent);
            System.out.println(currentRow);
        }
    }
    
    private String createRow(Student student) {

        String horizontalBorder, verticalBorder;

        switch(layoutType) {
            case DASH:
                horizontalBorder = "\n---------------------\n";
                verticalBorder = "|";
                break;
            case CIRCLE:
                horizontalBorder = "\no 0 o 0 o 0 o 0 o 0 o\n";
                verticalBorder = "0";
                break;
            case STAR:
                horizontalBorder = "\n*********************\n";
                verticalBorder = "*";
                break;
            default:
                horizontalBorder = "\n---------------------\n";
                verticalBorder = "|";
                break;
        }

        return horizontalBorder + verticalBorder + " " + student.getName() + " " + horizontalBorder;

    }
}

/*
    The class containing the main method.
*/
class AdapterTest {
    
    // The main method is the start of the program
    public static void main(String[] args) {

    }

}