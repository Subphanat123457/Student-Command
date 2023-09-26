//import Person.Person;
//import Person.PersonFactory;
import Person.Student;
import Person.Teacher;
//import Person.Staff;
import Person.SchoolStaff;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        PersonFactory fac = new PersonFactory();
//
//        System.out.println("1.Student 2.Teacher 3.Staff");
//        String Person = myObj.nextLine();
//        Person sp = fac.createPerson(Person);
//        System.out.println(sp.compute_salary() + " " + sp.getName("awdawdwd"));


        Scanner choiceSelect = new Scanner(System.in);
        System.out.println("1.Student 2.Teacher");
        String choice = choiceSelect.next();
        if (choice.equals("Student")) {
            int i = 1;
            SchoolStaff sf = new Student();
            while (i > 0) {
                sf.enterData();
                sf.takePhoto();
                sf.uploadDocument();
                sf.generateID(i);
                sf.saveData();
                sf.printID();
                i += 1;
//
            }
        } else if (choice.equals("Teacher")) {
            int i = 1;
            SchoolStaff st = new Teacher();
            while (i > 0) {
                st.enterData();
                st.takePhoto();
                st.uploadDocument();
                st.generateID(i);
                st.saveData();
                st.printID();
                i += 1;
            }
        }
    }

}