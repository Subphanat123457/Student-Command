package Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Teacher extends SchoolStaff{

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
                    id =lastTwoDigits + "000" + i;
                    System.out.println("4. Generate ID :" + lastTwoDigits + "000" + i);
                    break;
                case 2:
                    id = lastTwoDigits + "00" + i;
                    System.out.println("4. Generate ID :" + lastTwoDigits + "00" + i);
                    break;
                case 3:
                    id = lastTwoDigits + "0" + i;
                    System.out.println("4. Generate ID :" + lastTwoDigits + "0" + i);
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
}
