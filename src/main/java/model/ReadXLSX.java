package model;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ReadXLSX {
    public static void main(String[] args) throws IOException {
        // подключаемся к файлу
        String fileName = "src/main/resources/universityInfo.xlsx";
        FileInputStream fis = new FileInputStream(fileName);

        // созданы коллекции для аспектов
        // Generic должны быть классовыми (или как там по другому говорится)
        // иначе при работе с методами и попытке записи в список каких либо данных выползет ошибка
        // скажем спасибо еще раз разработчикам IDEA )))
        List<Students> studentsCollection = new ArrayList<>();
        List<University> universityCollection = new ArrayList<>();

        // экземпляры классаов, хэллоу

        University university = new University();

        // создана переменная для работы с excel-файлом
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // второй способ
        // вытаскиваем данные с помощью for
        // для начала объявляем лист, с которым работаем
        Sheet sheet = workbook.getSheet("Студенты");
        // далее определяем количество строк (получаем это количество с помощью метода)
        int rowLength = sheet.getPhysicalNumberOfRows();
        // проходимся по циклу строк
        for (int i = 1; i < rowLength; i++) {
            // объявляем строчки
            // получаем каждую
            Row row = sheet.getRow(i);
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
        for (Students student : studentsCollection) {
            System.out.println(student.toString());
        }
    }
}
// собирать коллекции придется из элементов классов
// создать экзмепляры классов
// присваивать каждому экземепляру значение с таблицы
// добавлять значение экзмепляров в коллециии
// найти способ их не попутать
// вывести мешанину в консоль
// разбить класс на 2 метода
// разобратьс с enum

/*
*
* this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
* */