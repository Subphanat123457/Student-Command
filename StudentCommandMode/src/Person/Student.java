package Person;

import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Student extends SchoolStaff{
    private String id;
    private String name;
    private int score;
    private String subject;


    @Override
    public void enterData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        name = scan.next();

    }

    @Override
    public void takePhoto() {
        System.out.print("2. Take a photo, S M I L E ..........");
    }

    @Override
    public void uploadDocument() {
        System.out.println("3. Upload all documents, please with ...........");
    }

    @Override
    public void generateID(int i) {
        //Initialize your Date however you like it.
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        String yearTH = Integer.toString(year+543);
        if (yearTH.length() >= 2) {
            String lastTwoDigits = yearTH.substring(yearTH.length() - 2);
            String Ist = Integer.toString(i);

            switch (Ist.length()){
                case 1:
                    id = lastTwoDigits + "010100" + i;
                    System.out.println("4. Generate ID :" + lastTwoDigits + "010100" + i);
                    break;
                case 2:
                    id = lastTwoDigits + "01010" + i;
                    System.out.println("4. Generate ID :" + lastTwoDigits + "01010" + i);
                    break;
                case 3:
                    id = lastTwoDigits + "0101" + i;
                    System.out.println("4. Generate ID :" + lastTwoDigits + "0101" + i);
                    break;
            }

        } else {
            System.out.println("The string does not have at least 2 characters.");
        }
    }

    @Override
    public void saveData() {
        System.out.println("5. Saving ........");

    }

    @Override
    public void printID() {

        System.out.println("6."+id+" "+name);

    }

    //    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    private String id;
//    private String name;
//
//    @Override
//    public String getId(String id) {
//        return id;
//    }
//
//    @Override
//    public String getName(String name) {
//        return name;
//    }
//
//    @Override
//    public int compute_salary() {
//        return 9000;
//    }
//
//    @Override
//    public int compute_ot(int hours, int rates) {
//        return 0;
//    }
//
//    @Override
//    public int compute_ot(int hours) {
//        return 0;
//    }


}
