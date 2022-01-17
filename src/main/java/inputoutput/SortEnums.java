package inputoutput;

import comparators.*;
import enums.StudentsEnum;
import enums.UniversityEnum;

// примерно так enum и работает
public class SortEnums {
    public static UniversityComparator universitySort(UniversityEnum universityEnum) {
        switch (universityEnum) {
            case FULL_NAME:
                return new UniversityFullNameComparator();
            case SHORT_NAME_COMPARATOR:
                return new UniversityShortNameComparator();
            case MAIN_PROFILE:
                return new UniversityMainProfile();
            case YEAR_COMPARATOR:
                return new UniversityYearComparator();
            default:
                return new UniversityIdComparator();
        }
    }

    public static StudentsComparator studentsSort(StudentsEnum studentsEnum) {
        switch (studentsEnum) {
            case FULL_NAME:
                return new StudentsFullNameComparator();
            case CURRENT_COURSE_NUMBER:
                return new CurrentCourseNumberComparator();
            case UNIVERSITY_ID:
                return new StudentsUniversityId();
            case AVG_EXAM_SCORE:
                return new StudentsAvgExamScoreComparator();
            default:
                return new StudentsIdComparator();
        }
    }
}
