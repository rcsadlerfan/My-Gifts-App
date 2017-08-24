package moffa.nick.mygifts.data;

public class StoredAnswers {

    //Main question answers
    static final String[] GENDER_QUESTION = {"Male", "Female", "Unisex, Unsure"};
    static final String[] AGE_QUESTION = {"0-3 years old", "4-6 years old", "7-10 years old",
            "11-15 years old", "16-20 years old", "21-30 years old", "31-45 years old", "46-60 years old",
            "61-75 years old", "75+ years old"};
    static final String[] RELATIVITY_QUESTION = {"Father", "Mother", "Brother", "Sister", "Husband/Boyfriend",
    "Wife/Girlfriend", "Cousin", "Nephew", "Niece", "Friend", "Colleague/Associate", "Co-worker", "Boss",
    "Teacher/Professor", "Pet", "Baby", "Other"};
    static final String[] OCCASION_QUESTION = {"Anniversary", "Apology", "Baby Shower", "Back to School",
    "Birthday", "Bridal Shower", "Congratulations", "Good Luck", "Graduation", "Holiday", "House Warming",
    "Illness", "Party", "Promotion", "Religious", "Retirement", "Thank You", "Thinking of You", "Wedding"};

    //Options for certain answers
    static final String[] HOLIDAYS = {"Christmas", "Easter", "Father's Day", "Halloween", "Hanukkah",
    "Independence Day", "Kwanzaa", "Memorial Day", "Mother's Day", "Father's Day", "New Year's Eve/Day", "Thanksgiving"};

    private static final StoredAnswers ourInstance = new StoredAnswers();

    public static StoredAnswers getInstance() {
        return ourInstance;
    }

    private StoredAnswers() {
    }

    //Getters to allow access to String arrays
    public static String[] getGenderQuestion() {
        return GENDER_QUESTION;
    }

    public static String[] getAgeQuestion() {
        return AGE_QUESTION;
    }

    public static String[] getRelativityQuestion() {
        return RELATIVITY_QUESTION;
    }

    public static String[] getOccasionQuestion() {
        return OCCASION_QUESTION;
    }

    public static String[] getHOLIDAYS() {
        return HOLIDAYS;
    }
}
