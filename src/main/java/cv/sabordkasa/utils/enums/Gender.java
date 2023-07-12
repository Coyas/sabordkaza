package cv.sabordkasa.utils.enums;

public enum Gender {
    M,
    F;

    public static Boolean isMale(Gender gender){
        return gender == Gender.M;
    }
    public static Boolean isFemale(Gender gender){
        return gender == Gender.F;
    }
}
