package jsonutil;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Students;
import model.University;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {
    public static void universitySerialize(University university) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(university);
        System.out.println(json);
    }

    public static List<University> universityListSerialize(List<University> university) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(university);
        System.out.println(json);
        return university;
    }

    public static void UniversityDeserialize(String jsonName) throws IOException {
        FileReader file = new FileReader(jsonName);
        Gson gson = new Gson();
        gson.fromJson(file, University.class);
        System.out.println(gson);
    }

    public static void UniversityListDeserialize(String jsonName) throws IOException {
        FileReader file = new FileReader(jsonName);
        Type universityList = new TypeToken<List<University>>() {}.getType();
        List<University> gson = new Gson().fromJson(file, universityList);
        System.out.println(gson);
    }

    public static void StudentsSerialize(Students students) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(students);
        System.out.println(json);
    }

    public static List<Students> studentsListSerialize(List<Students> students) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(students);
        System.out.println(json);
        return students;
    }

    public static void StudentsDeserialize(String jsonName) throws IOException {
        FileReader file = new FileReader(jsonName);
        Gson gson = new Gson();
        gson.fromJson(file, Students.class);
        System.out.println(gson);
    }

    public static void StudentsListDeserialize(String jsonName) throws IOException {
        FileReader file = new FileReader(jsonName);
        Type studentsList = new TypeToken<List<Students>>() {}.getType();
        List<Students> gson = new Gson().fromJson(file, studentsList);
        System.out.println(gson);
    }
}
