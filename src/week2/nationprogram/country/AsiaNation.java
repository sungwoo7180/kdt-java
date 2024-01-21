package week2.nationprogram.country;

public class AsiaNation extends nation {
    // Additional static members for Asian nations
    public static final String REGION = "Asia";
    public String language;
    //public static final String location = "ASIA";
    public AsiaNation(String nationName, int countCitizen, boolean policy, String presidentName, String[] location, String language) {
        super(nationName, countCitizen, policy, presidentName, location);
        this.language = language;
    }

    @Override
    public String toString() {
        return nationName +
                "{ countCitizen=" + countCitizen +
                ", policy=" + (policy ? "민주주의 및 자본주의" : "사회주의") +
                ", presidentName='" + presidentName + '\'' +
                ", location=" + location +
                ", language='" + language + '\'' +
                '}';
    }
}
