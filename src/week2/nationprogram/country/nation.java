package week2.nationprogram.country;

import java.util.*;
import lombok.Getter;
@Getter                     //필드 하나 하나에 @Getter 을 쓸수도 있지만 class인 nation 위에 @Getter을 넣어서 일관성 있게 처리 가능
public class nation {
    public String nationName;                       // 나라 이름
    public int countCitizen;                        // 시민수
    public boolean policy;                          // ture : democratic & capitalism  | false : socialism
    public String presidentName;                    // 대통령 이름
    List<String> location = new ArrayList<>();      // 지역 컬렉션 프레임워크 (관광 명소, 시 도 군)
    public boolean inWar = false;                    // true : 전쟁중 o | false(default) : 전쟁중 x

    // 이민청 및 여행청 인스턴스 생성
    public ImmigrationOffice immigrationOffice = new ImmigrationOffice();
    public TravelAgency travelAgency = new TravelAgency();

    public boolean isWar() { return inWar; }

    public void setWar(boolean inWar) { this.inWar = inWar; }       //setWar(true); 전쟁중으로 set
    // 여행청
    public class ImmigrationOffice implements Iimmigrant {            // 이민 처리 기능...
        public void immigration_approval (citizen citizen, nation immigrationCountry) {
            if(!citizen.nationality.equals(immigrationCountry)){
                // 이민 가는 나라(tourismCountry)
                if(citizen.nationality == null) {            //citizen.nationality.equals("")
                    System.out.println("무국적자"+ citizen.citizenName + "에게 이민을 승인할 수 없습니다.");
                } else if(immigrationCountry.isWar()) {
                    System.out.println("이민 대상인" + immigrationCountry.nationName + " 나라는 전쟁중입니다." + citizen.citizenName + "님의 이민을 승인할 수 없습니다. ");
                } else if(citizen.nationality.isWar()){
                    System.out.println("전시 상황이기에 이민을 승인할 수 없습니다." + citizen.citizenName + "님 국방의 의무를 다해주세요 ^ㅇ^ ");
                } else{
                    System.out.println("여권 번호\t" + citizen.PassportNumber + "\t" + citizen.citizenName + "의 " + immigrationCountry.nationName + "이민을 승인합니다.");
                    System.out.println(citizen.nationality.nationName + "->" + immigrationCountry);
                    citizen.nationality = immigrationCountry;
                }
            } else {
                System.out.println(citizen.citizenName +"님 의 국적은" + citizen.nationality.nationName + "로 자신의 국적으로 이민 갈 수 없습니다." );
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
        public void groupImmigrationApproval(List<citizen> citizens, nation immigrationCountry) {
            for (citizen c : citizens) {
                immigration_approval(c, immigrationCountry);
            }
        }
    }
    // 이민청
    public class TravelAgency implements ITravel {                     // 여행 처리 기능...

        public void travel_approval (citizen citizen, nation travelCountry) {
            if(!citizen.nationality.equals(travelCountry)){
                // immigrationCountry(여행 가는 나라)
                if(citizen.nationality == null) {
                    System.out.println("무국적자"+ citizen.citizenName + "에게 여행을 승인할 수 없습니다.");
                } else if(travelCountry.isWar()) {
                    System.out.println("여행 대상인 " + travelCountry.nationName + "는 전쟁중입니다." + citizen.citizenName + "님의 여행을 승인할 수 없습니다. ");
                } else if(citizen.nationality.isWar()){
                    System.out.println("전시 상황이기에 여행을 승인할 수 없습니다." + citizen.citizenName + "님 국방의 의무를 다해주세요 ^ㅇ^ ");
                } else{
                    System.out.println("여권 번호\t" + citizen.PassportNumber + "\t" + citizen.citizenName + "의 " + travelCountry.nationName + "여행을 승인합니다. 즐거운 여행 되십시오.");
                    System.out.println(citizen.nationality.nationName + "->" + travelCountry);
                }
            } else {
                System.out.println(citizen.citizenName +"님의 국적은 " + citizen.nationality.nationName + "로 여행에 대해 허락받으실 필요는 없습니다. 즐거운 여행 되십시오." );
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }

        public void groupTravelApproval(List<citizen> citizens, nation immigrationCountry) {
            for (citizen c : citizens) {
                travel_approval(c, immigrationCountry);
            }
        }
    }

    public nation (String nationName, int countCitizen, boolean policy, String presidentName, String[] location) {
        this.nationName = nationName;
        this.countCitizen = countCitizen;
        this.policy = policy;
        this.presidentName = presidentName;
        this.location.addAll(Arrays.asList(location));
        //this.inWar = inWar;
    }
    public nation (String nationName, int countCitizen, boolean policy, String presidentName, String[] location, boolean offices) {
        this.nationName = nationName;
        this.countCitizen = countCitizen;
        this.policy = policy;
        this.presidentName = presidentName;
        this.location.addAll(Arrays.asList(location));
        if (offices) {

        }
        //this.inWar = inWar;
    }

    @Override
    public String toString() {
        return nationName +
                "{ countCitizen=" + countCitizen +
                ", policy=" + (policy ? "democratic & capitalism" : "socialism") + //policy 가 true 라면 democratic & capitalism return함
                ", presidentName='" + presidentName + '\'' +
                ", location=" + location +
                '}';
    }
}
