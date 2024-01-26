package week2.nationprogram.country;

import java.util.List;

// 여행 인터페이스
interface ITravel {
    void travel_approval(citizen citizen);
    void groupTravelApproval(List<citizen> citizens, Nation immigrationCountry);

}
// 국적 인터페이스
interface Iimmigrant {
    void immigration_approval(citizen citizen, Nation immigrationCountry);
    void groupImmigrationApproval(List<citizen> citizens, Nation immigrationCountry);
}
