package week2.poketmon;

public class PoketmonBattleStruct {
    // 기능을 중심으로
    String monsterName1;
    String monsterName1skillName;
    int monsterName1hp;
    int monsterName1skillDmg;

    String monsterName2;
    String monsterName2skillName;
    int monsterName2hp;
    int monsterName2skillDmg;

    public void poketmonStruct(String monsterName1, int monsterName1hp, String monsterName1skillName, int monsterName1skillDmg
    , String monsterName2, int monsterName2hp, String monsterName2skillName, int monsterName2skillDmg){
        this.monsterName1 = monsterName1;
        this.monsterName1hp = monsterName1hp;
        this.monsterName1skillName = monsterName1skillName;
        this.monsterName1skillDmg = monsterName1skillDmg;
        this.monsterName2 = monsterName2;
        this.monsterName2hp = monsterName2hp;
        this.monsterName2skillName = monsterName2skillName;
        this.monsterName2skillDmg = monsterName2skillDmg;
    }

    public void PoketmonBattleInStruct() {

    }
}
