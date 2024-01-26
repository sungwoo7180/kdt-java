package week2.nationprogram.country;


class person {
    public int age;                     // 나이
    public int sex;                     // 1 : male,  2 :female
}
public class citizen extends person {

    private int residentNumber;         // 주민등록번호
    public Nation nationality;          // 국적 (필수)
    public String citizenName;          // 이름 (필수)
    public String job;                  // 직업
    public String PassportNumber;       // 여권 번호 (필수)
    public String residence;            // 거주 지역

    public citizen(String citizenName, String PassportNumber, Nation nationality) {
        this.citizenName = citizenName;
        this.PassportNumber = PassportNumber;
        this.nationality = nationality;
    }
}
