

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIII.Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dawit.gebremichael
 */
public class StudentManager2 {

    List<Student> students = new ArrayList();

    private void studentInfo() {
        Student student = new Student();
        student.setName("Daniel");
        student.setGpa(2.4);
        //student.setNoCourse(40);
        display(student);

        Student student2 = new Student();
        student2.setName("Mike");
        student2.setGpa(3.0);
        //student2.setNoCourse(66);
        display(student2);
    }

    private void studentInfo2() {
        Student student = new Student("Daniel", "CS", 2.4);
// Student student = new Student();
// student.setName("Daniel");
// student.setGpa(2.4);
// student.setNoCourse(40);
        students.add(student);
//
//
// Student student2 = new Student();
// student2.setName("Mike");
// student2.setGpa(3.0);
// student2.setNoCourse(66);
        Student student2 = new Student("Mike", "CS", 3.0);
        students.add(student2);
        display(students);

    }
    private static void display(List<Student> s) {

        for (Student student : s) {
            System.out.println(student.getName()+" "+student.getGpa());

        }

    }

    private static void display(Student s) {
        System.out.println(s.getName());
        System.out.println(s.getGpa());

    }

    public void readFile() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("C:\\Users\\Pinhan\\OneDrive\\Shared\\Coding\\git\\javabyLiang\\src\\JavaIII\\students.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        Student student;
        while((line = br.readLine()) != null){
// System.out.println(line);
            String [] value = line.split(",");

            student = new Student((String)value[0],
                    (String)(value[1]),
                    Double.parseDouble(value[2]));
            students.add(student);


        }
        display(students);

    }

    public void writeFile(){

    }

    public static void main(String[] args) throws IOException {
        StudentManager2 sm = new StudentManager2();
//sm.studentInfo2();
        sm.readFile();
    }
}
