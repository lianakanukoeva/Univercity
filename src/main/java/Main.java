import model.Students;
import model.University;

import java.io.IOException;
import java.util.List;

import static model.ReadXLSX.readStudents;
import static model.ReadXLSX.readUniversity;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities = readUniversity("src/main/resources/universityInfo.xlsx");
        List<Students> students = readStudents("src/main/resources/universityInfo.xlsx");

        for (University university: universities) {
            System.out.println(university);
        }
        for (Students student : students) {
            System.out.println(student);
        }
    }
}
