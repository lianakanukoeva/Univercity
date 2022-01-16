package comparators;

import model.Students;

public class CurrentCourseNumberComparator implements StudentsComparator {

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getFullName().compareTo(o1.getFullName());
    }
}
