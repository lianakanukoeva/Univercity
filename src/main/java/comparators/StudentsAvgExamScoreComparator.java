package comparators;

import model.Students;

public class StudentsAvgExamScoreComparator implements StudentsComparator{
    @Override
    public int compare(Students o1, Students o2) {
        Double a1 = new Double(o1.getAvgExamScore());
        Double a2 = new Double(o2.getAvgExamScore());
        return a1.compareTo(a2);
    }
}
