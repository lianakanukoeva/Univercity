package comparators;

import model.Students;

public class StudentsFullNameComparator implements StudentsComparator {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
