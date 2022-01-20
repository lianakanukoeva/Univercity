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
        // вытаскиваем данные
        List<University> universities = readUniversity("src/main/resources/universityInfo.xlsx");
        List<Students> students = readStudents("src/main/resources/universityInfo.xlsx");


        UniversityComparator universityComparators = SortEnums.universitySort(UniversityEnum.SHORT_NAME_COMPARATOR);
        StudentsComparator studentsComparators = SortEnums.studentsSort(StudentsEnum.UNIVERSITY_ID);

        // делаем стримы и сортируем по вызванным методам-компораторам
        Stream universitiesStream = universities.stream();
        universitiesStream.sorted(universityComparators).forEach(System.out::println);

        Stream studentsStream = students.stream();
        studentsStream.sorted(studentsComparators).forEach(System.out::println);

        // сериализация листов
        String universityjsonlist = JsonUtil.universityListSerialize(universities);
        String studentsjsonList = JsonUtil.studentsListSerialize(students);

        JsonUtil.universityListDeserialize(universityjsonlist);
        JsonUtil.studentsListDeserialize(studentsjsonList);

         /*
         * Сравнить количество элементов в исходной и в десериализованной коллекциях, чтобы убедиться, что десериализация выполняется корректно.
         * !!!С помощью Java Stream API выполнить для исходных коллекций сериализацию отдельных элементов.!!!
         */
    }
}
