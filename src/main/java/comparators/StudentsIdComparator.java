package comparators;

import model.Students;


public class StudentsIdComparator implements StudentsComparator {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
