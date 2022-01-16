package comparators;

import model.University;

public class UniversityYearComparator implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        Integer y1 = new Integer(o1.getYearOfFoundation());
        Integer y2 = new Integer(o2.getYearOfFoundation());
        return y1.compareTo(y2);
    }
}
