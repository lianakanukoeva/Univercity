import comparators.StudentsComparator;
import comparators.UniversityComparator;
import enums.StudentsEnum;
import enums.UniversityEnum;
import inputoutput.SortEnums;
import jsonutil.JsonUtil;
import model.Students;
import model.University;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static model.ReadXLSX.readStudents;
import static model.ReadXLSX.readUniversity;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities = readUniversity("src/main/resources/universityInfo.xlsx");
        List<Students> students = readStudents("src/main/resources/universityInfo.xlsx");

        UniversityComparator universityComparators = SortEnums.universitySort(UniversityEnum.SHORT_NAME_COMPARATOR);
        StudentsComparator studentsComparators = SortEnums.studentsSort(StudentsEnum.UNIVERSITY_ID);

        Stream universitiesStream = universities.stream();
        universitiesStream.sorted(universityComparators).forEach(System.out::println);

        Stream studentsStream = students.stream();
        studentsStream.sorted(studentsComparators).forEach(System.out::println);

        List<University> universityjsonlist = JsonUtil.universityListSerialize(universities);
        List<Students> studentsList = JsonUtil.studentsListSerialize(students);

    }
}
