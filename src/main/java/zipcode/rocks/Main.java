package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "TenFiveZero.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();
//ver1
//        List listOfStudents = programObject.loadCSVFile(student_source);
        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine ( String line ) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
// ver1
//        Person newPerson = new Person(values[0], values[1], values[2], values[3],values[4],values[5]);
//        return newPerson;

        //ver2
        return null;
    }

    // copy from here...
    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person std1 = new Person("Teddy", "Archibald");
        std1.setColor("Red");
        std1.setBeverage("H&H");
        std1.setBirthMonth("March");
        std1.setPet(false);
        students.add(std1);

        Person std2 = new Person("Qian", "Wang");
        std2.setColor("purple");
        std2.setBeverage("Latte");
        std2.setBirthMonth("Feb");
        std2.setPet(true);
        students.add(std2);

        Person std3 = new Person("Teddy", "Archibald");
        std3.setColor("Red");
        std3.setBeverage("Coffee");
        std3.setBirthMonth("March");
        std3.setPet(false);
        students.add(std3);

        Person std4 = new Person("Tim", "Linkous");
        std4.setColor("Green");
        std4.setBeverage("Water");
        std4.setBirthMonth("June");
        std4.setPet(true);
        students.add(std4);

        Person std5 = new Person("Bryan", "Smith");
        std5.setColor("Red");
        std5.setBeverage("Tea");
        std5.setBirthMonth("White");
        std5.setPet(false);
        students.add(std5);

        Person std6 = new Person("Will", "Chapman");
        std6.setColor("red");
        std6.setBeverage("water");
        std6.setBirthMonth("March");
        std6.setPet(false);
        students.add(std6);

        Person std7 = new Person("Jared", "Thacker");
        std7.setColor("green");
        std7.setBeverage("Devi");
        std7.setBirthMonth("Dec");
        std7.setPet(true);
        students.add(std7);

        // and so on for EACH person in the cohort.

        return students;
    }
    //...to here. Paste below the `getRecordFromLine()` method in Main.java

}
