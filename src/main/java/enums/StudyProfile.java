package enums;

public enum StudyProfile {
    MEDICINE("Медицина"),
    PROGRAMMING("Программирование"),
    FILOLOGY("Филология"),
    HISTORY("История"),
    ART("Искусство"),
    ECONOMY("Экономика"),
    MARKETING("Марткетинг"),
    PHYSICS("Физика"),
    LINGUISTICS("Лингвистка"),
    MATHEMATICS("Математика");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
}