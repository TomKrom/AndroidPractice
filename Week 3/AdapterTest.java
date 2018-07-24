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
    
    // Properties of the class
    private String name;
    private String program;
    private int studentNumber;
    private int EC;

    // Constructor of the class
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
    Enum to hold the constants that users can pick to determine what the borders of the
    data printed to the console look like.
*/
enum LayoutType {
        DASH, CIRCLE, STAR;
}


/* 
    This class holds the functionality of the "adapter", which takes in an array and the layout
    type to show (the enum). It then iterates over the array and prints out the appropriate layout
    for every student object in the array.
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

        // Determine layout type
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
        

        // Creation of the array containing student objects
        Student[] students = {
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
            new Student("Tim Meijer", "Business Information Systems", 11153431, 90),
        };
        
        // Constructing the adapter and starting it
        ArrayAdapter adapter = new ArrayAdapter(students, LayoutType.DASH);
        adapter.start();
    }
}