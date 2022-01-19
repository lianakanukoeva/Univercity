package model;

import java.io.Serializable;

public class Students implements Serializable {
    private String id;
    private String fullName;
    private String universityId;
    private double currentCourseNumber;
    private double avgExamScore;

    public Students (String id, String fullName, String universityId, double currentCourseNumber, double avgExamScore) {
        this.id = id;
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public Students() {

    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public double getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public double getAvgExamScore() {
        return avgExamScore;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setCurrentCourseNumber(double currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public void setAvgExamScore(double avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", universityId='" + universityId + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }
}
