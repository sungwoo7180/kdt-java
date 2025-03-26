package week2.poketmon;
public class poketmonStruct {
    // 기능을 중심으로 했더니 한계가... 사물을 중심으로 하니깐 능동 수동 구분을 할 필요가 없이 편해짐.
    String monsterName;
    String skillName;
    int hp;
    int skillDmg;

    public poketmonStruct(String monsterName, int hp, String skillName, int skillDmg){
        this.monsterName = monsterName;
        this.hp = hp;
        this.skillName = skillName;
        this.skillDmg = skillDmg;
    }

    public void attack(poketmonStruct targetPoketmon) {
        if (targetPoketmon.hp > 0) {
            // poketmon2 공격 후 poketmon1 Hp 표시
            System.out.println(this.monsterName + "이(가)" + targetPoketmon + "를 공격합니다.");
            System.out.println(this.skillName + " 스킬을 사용합니다.");
            targetPoketmon.hp -= this.skillDmg;
            System.out.println(targetPoketmon.monsterName + "남은 HP : " + targetPoketmon.hp);
            if (targetPoketmon.hp <= 0) {
                System.out.println(targetPoketmon.monsterName + "(이)가 항복했습니다.");
            }
        }
    }
}
