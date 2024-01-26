package week2.nationprogram.country;

import java.util.Arrays;
import java.util.List;

public class MainDemo {

    public static void main(String[] args) {
        // 국가 객체 생성
        Nation southkorea = new AsiaNation("Korea", 50000000, true, "Moon Jae-in", new String[]{"Seoul"}, "Korean");
        Nation japan = new AsiaNation("Japan",126500000, true, "Naruhito", new String[]{"Tokyo"}, "Japanese");
        Nation russia = new EuropeNation("Rusia", 146599183, false, "Vladimir Putin", new String[]{"Moscow"}, "Russian");
        Nation northkorea = new AsiaNation("NorthKorea",50000000, false, "Kim Jung Eun", new String[]{"Seoul"}, "Korean");

        russia.setWar(true);

        // 국민 객체 생성
        citizen Korean1 = new citizen("SeoSungWoo", "AB123456", southkorea);
        citizen Japanese1 = new citizen("Jane Doe", "CD789012", japan);
        citizen Russian1 = new citizen("Ivan Ivanov", "EF345678", russia);
        citizen North_Korean1 = new citizen("KimJungEun", "ZZ89", northkorea);
        List<citizen> citizens = Arrays.asList(Korean1, Japanese1, Russian1);


        // 여행자 여행 테스트
        // 사실 객체를 southkorea로 지칭하고 참조함으로, 생성자를 변경해줄 필요가 있다.
        System.out.println("여행 테스트");
        southkorea.travelAgency.travel_approval(Korean1);
        northkorea.travelAgency.travel_approval(Japanese1);
        southkorea.travelAgency.travel_approval(Russian1);
        northkorea.travelAgency.travel_approval(North_Korean1);
        russia.travelAgency.travel_approval(Russian1);
        russia.travelAgency.travel_approval(North_Korean1);

        // 이민자 테스트 및 국적 변경 확인
        System.out.println("이민자 테스트 및 국적 변경 확인");
        japan.immigrationOffice.immigration_approval(Korean1, japan);
        southkorea.travelAgency.travel_approval(Korean1);

        southkorea.immigrationOffice.immigration_approval(Korean1, southkorea);     //자기 자신의 국적으로 이민 불가 확인

        // 집단 망명
        System.out.println("집단 망명");
        southkorea.immigrationOffice.groupImmigrationApproval(Arrays.asList(Korean1, Japanese1, Russian1, North_Korean1), southkorea);

        // 단체 여행
        System.out.println("단체 여행");
        northkorea.travelAgency.groupTravelApproval(Arrays.asList(Korean1, North_Korean1), northkorea);
//        citizens.stream().forEach(c -> korea.travelAgency.travel_approval(c, travelCountry));



//        // 여행청 이민청 생성
//        //지금 꺼는 세계 정부
//        nation.TravelAgency travelManager = new nation.TravelAgency();
//        nation.ImmigrationOffice immigrationManager = new nation.ImmigrationOffice();
//
//        // 여행자 여행 테스트
//        System.out.println("여행 테스트");
//        travelManager.travel_approval(Korean1, southkorea);         //자신의 나라로 여행
//        travelManager.travel_approval(Japanese1, northkorea);
//        travelManager.travel_approval(Russian1, southkorea);
//        travelManager.travel_approval(North_Korean1, northkorea);   //자신의 나라로 여행
//        travelManager.travel_approval(Russian1, russia);            //전쟁중인 국가 입국 거부
//        travelManager.travel_approval(North_Korean1, russia);       //전쟁중인 국가 입국 거부

//        // 이민자 테스트 및 국적 변경 확인
//        System.out.println("이민자 테스트 및 국적 변경 확인");
//        immigrationManager.immigration_approval(Korean1, japan);    // 국적 변경(한국->일본)
//        travelManager.travel_approval(Korean1, southkorea);         // 변경 확인
//
//
//        // 집단 망명
//        System.out.println("집단 망명");
//        immigrationManager.groupImmigrationApproval(Arrays.asList(Korean1, Japanese1, Russian1, North_Korean1), southkorea);
//        // 단체 여행
//        System.out.println("단체 여행");
//        travelManager.groupTravelApproval(Arrays.asList(Korean1, North_Korean1), northkorea);
    }
}
