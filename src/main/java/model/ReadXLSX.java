package model;

import enums.StudyProfile;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ReadXLSX {
    private ReadXLSX (){}

    public static List<Students> readStudents(String fileName) throws IOException {
//        fileName = "src/main/resources/universityInfo.xlsx";
        // созданы коллекции для аспектов
        // Generic должны быть классовыми (или как там по другому говорится)
        // иначе при работе с методами и попытке записи в список каких либо данных выползет ошибка
        // скажем спасибо еще раз разработчикам IDEA )))
        FileInputStream fis = new FileInputStream(fileName);
        List<Students> studentsCollection = new ArrayList<>();

        // создана переменная для работы с excel-файлом
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // второй способ
        // вытаскиваем данные с помощью for
        // для начала объявляем лист, с которым работаем
        Sheet sheetStudents = workbook.getSheet("Студенты");
        // далее определяем количество строк (получаем это количество с помощью метода)
        int rowLength = sheetStudents.getPhysicalNumberOfRows();
        // проходимся по циклу строк
        for (int i = 1; i < rowLength; i++) {
            // объявляем строчки
            // получаем каждую
            Row row = sheetStudents.getRow(i);
            Students students = new Students();
            // проходимся по ним циклом (тем же способом, что и со строчками), в котором получаем ячейки
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell = row.getCell(j);
                students.setId(i + "-" + j + "");
                if (j == 0) {
                    students.setUniversityId(cell.getStringCellValue());
                }
                if (j == 1) {
                    students.setFullName(cell.getStringCellValue());
                }
                if (j == 2) {
                    students.setCurrentCourseNumber(cell.getNumericCellValue());
                }
                if (j == 3) {
                    students.setAvgExamScore(cell.getNumericCellValue());
                }
            }
            studentsCollection.add(students);
        }
        return studentsCollection;
    }

    // тоже самое только теперь с Университетами
    public static List<University> readUniversity(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);

        List<University> universityCollection = new ArrayList<>();

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        Sheet sheetUniversity = workbook.getSheet("Университеты");

        int rowLengthUn = sheetUniversity.getPhysicalNumberOfRows();

        for (int i = 1; i < rowLengthUn; i++) {
            Row row = sheetUniversity.getRow(i);
            University university = new University();
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell = row.getCell(j);
                if(j == 0) {
                university.setId(cell.getStringCellValue());
                }
                if (j == 1) {
                    university.setFullName(cell.getStringCellValue());
                }
                if (j == 2) {
                    university.setShortName(cell.getStringCellValue());
                }
                if (j == 3) {
                    university.setYearOfFoundation((int)cell.getNumericCellValue());
                }
                if (j == 4) {
                    // спасибо IDEA <з
                    university.setMainProfile(StudyProfile.valueOf(cell.getStringCellValue()));
                }
            }
            universityCollection.add(university);
        }
        return universityCollection;
    }
}