package JavaIII.Practice;

import JavaIII.Practice.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    public static void collectStudents() throws IOException {
        // Create the ArrayList
        ArrayList<Student> studentsList = new ArrayList(); // ArrayList does not accept Primitive Data

        FileReader fr = new FileReader("C:\\Users\\Pinhan\\OneDrive\\Shared\\Coding\\git\\javabyLiang\\src\\inClassCodes\\students.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

//        String path = System.getProperty("(user.dir)" + "src\\inClassCodes\\students.txt");
//        FileInputStream file = new FileInputStream(path);

        while(line != null){
            //System.out.println("Line " + line);
            String[] delLine = line.split(",");
            String name = delLine[0];
            String major = delLine[1];
            double gpas = Double.parseDouble(delLine[2]);

            // System.out.println(delLine[2]);
//          double gpa = Double.parseDouble(gpas);  // Can also be written as separate

            // Create the student objects
            Student student = new Student(name, major, gpas);

            // Use ArrayList add method to fill the ArrayList with student objects
            studentsList.add(student);

            System.out.println(studentsList);



            //displayArrayList(students);

            // Call display method to display student "Object"
            display(studentsList);


            line = br.readLine();
        }
    }

    public static void display(List<Student> student) {
        System.out.println("Print from Student Object");
        for (Student students : student) {
            System.out.println(student);
        }

    }

    public static void main(String[] args) throws IOException {
        collectStudents();
    }
}