package comparators;

import model.Students;

public class StudentsUniversityId implements StudentsComparator{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getUniversityId().compareTo(o2.getUniversityId());
    }
}
