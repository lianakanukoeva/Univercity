package comparators;

import model.Students;
import model.University;

import java.util.Comparator;

public class UniversityIdComparator implements UniversityComparator {
    @Override
    public int compare(University o1, University o2) {
        return o1.getId().compareTo(o1.getId());
    }
}
