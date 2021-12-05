package model;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ReadXLSX {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/universityInfo.xlsx";
        FileInputStream fis = new FileInputStream(fileName);

        // создана переменная для работы с excel-файлом
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // работа с листом студентов
        // Sheet sheetStudents = workbook.getSheet("Студенты"); - это важная для понимания строчка
        // <Row> используется как тип, потому что итерация должна проходиться по строчкам
        // строчки, которые мы обрабатываем нам предоставляет оператор, а сами строчки - экземпляры класса Row
        // и чтобы была какая-то состыковка или взаимодействие стоит записать его как Generic
        Iterator<Row> sheetIterator = workbook.getSheet("Студенты").iterator();
        // вызов метода next, чтобы пропустить заголовок также объявление экземпляра класса Row
        Row rowFile = sheetIterator.next();
        int i = 0;
        // далее составить цикл while

        // созданы коллекции для аспектов
        List<String> studentsCollection = new ArrayList<>();
        List<String> universityCollection = new ArrayList<>();
    }
}

/*
* @Parameter(defaultValue = "${project}", required = true, readonly = true)
    public MavenProject project;

    public void execute() {
        getLog().info("Project version: " + project.getVersion());
    }
* */
