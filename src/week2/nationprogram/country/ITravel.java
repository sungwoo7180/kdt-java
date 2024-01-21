package week2.nationprogram.country;

import java.util.List;

// 여행 인터페이스
interface ITravel {
    void travel_approval(citizen citizen, nation travelCountry);
    void groupTravelApproval(List<citizen> citizens, nation immigrationCountry);

}
// 국적 인터페이스
interface Iimmigrant {
    void immigration_approval(citizen citizen, nation immigrationCountry);
    void groupImmigrationApproval(List<citizen> citizens, nation immigrationCountry);
}
