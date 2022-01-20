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

    public static String universityListSerialize(List<University> university) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(university);
        System.out.println(json);
        return json;
    }

    public static void UniversityDeserialize(String jsonName) throws IOException {
        Gson gson = new Gson();
        gson.fromJson(jsonName, University.class);
        System.out.println(gson);
    }

    public static void universityListDeserialize(String jsonName) throws IOException {
        Type universityList = new TypeToken<List<University>>() {}.getType();
        List<University> gson = new Gson().fromJson(jsonName, universityList);
        System.out.println(gson);
    }

    public static void StudentsSerialize(Students students) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(students);
        System.out.println(json);
    }

    public static String studentsListSerialize(List<Students> students) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(students);
        System.out.println(json);
        return json;
    }

    public static void StudentsDeserialize(String jsonName) throws IOException {
        Gson gson = new Gson();
        gson.fromJson(jsonName, Students.class);
        System.out.println(gson);
    }

    public static void studentsListDeserialize(String jsonName) throws IOException {
        Type studentsList = new TypeToken<List<Students>>() {}.getType();
        List<Students> gson = new Gson().fromJson(jsonName, studentsList);
        System.out.println(gson);
    }
}
