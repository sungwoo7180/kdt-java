package week3.poketmon;

import java.util.Random;
import java.util.Scanner;

public class PoketmonStruct {
    private String poketmonName;
    private String Level;                   // 기능 미구현
    private String nickName;
    private int hp;
    private int maxhp;
    private String skillName1;
    private int skillDmg1;
    private int skillSpeed1;
    private String skillName2;
    private int skillDmg2;
    private int skillSpeed2;

    public int getHp() {
        return hp;
    }

    public String getPoketmonName() {
        return poketmonName;
    }

    public PoketmonStruct(String poketmonName, String nickName, int hp,
                          String skillName1, int skillDmg1, int skillSpeed1,
                          String skillName2, int skillDmg2, int skillSpeed2) {
        this.poketmonName = poketmonName;
        this.nickName = nickName;
        this.hp = hp;
        this.maxhp = hp;
        this.skillName1 = skillName1;
        this.skillDmg1 = skillDmg1;
        this.skillSpeed1 = skillSpeed1;
        this.skillName2 = skillName2;
        this.skillDmg2 = skillDmg2;
        this.skillSpeed2 = skillSpeed2; }
    @Override
    public String toString() {
        return "PoketmonStructure{" +
                "poketmonName='" + poketmonName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", hp=" + hp +
                ", maxhp=" + maxhp +
                ", skillName1='" + skillName1 + '\'' +
                ", skillDmg1=" + skillDmg1 +
                ", skillSpeed1=" + skillSpeed1 +
                ", skillName2='" + skillName2 + '\'' +
                ", skillDmg2=" + skillDmg2 +
                ", skillSpeed2=" + skillSpeed2 +
                '}';
    }
    public void attack(PoketmonStruct targetPokemon) {
        if (targetPokemon.hp > 0) {
            System.out.println( "가랏!!! " + this.nickName + "!");
            skillSelect(targetPokemon);
            System.out.println("-------------------------------------");
        }
    }

    private void skillSelect(PoketmonStruct targetPokemon) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.poketmonName + " ( 체력 : " + this.hp + " )");
        System.out.println("1. " + this.skillName1 + " ( 스킬 데미지 : " + this.skillDmg1 + " 스킬 속도 : " + this.skillSpeed1 + ")");
        System.out.println("2. " + this.skillName2 + " ( 스킬 데미지 : " + this.skillDmg2 + " 스킬 속도 : " + this.skillSpeed2 + ")");

        int firstSelectedSkill;
        do {
            System.out.print("사용할 기술을 선택하세요 (1 또는 2): ");
            firstSelectedSkill = scanner.nextInt();

            if (firstSelectedSkill != 1 && firstSelectedSkill != 2) {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        } while (firstSelectedSkill != 1 && firstSelectedSkill != 2);

        System.out.println(targetPokemon.poketmonName + " ( 체력 : " + targetPokemon.hp + " )");
        System.out.println("1. " + targetPokemon.skillName1 + " ( 스킬 데미지 : " + targetPokemon.skillDmg1 + " 스킬 속도 : " + targetPokemon.skillSpeed1 + ")");
        System.out.println("2. " + targetPokemon.skillName2 + " ( 스킬 데미지 : " + targetPokemon.skillDmg2 + " 스킬 속도 : " + targetPokemon.skillSpeed2 + ")");
        int lastSelectedSkill;
        do {
            System.out.print("사용할 기술을 선택하세요 (1 또는 2): ");
            lastSelectedSkill = scanner.nextInt();

            if (lastSelectedSkill != 1 && lastSelectedSkill != 2) {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        } while (lastSelectedSkill != 1 && lastSelectedSkill != 2);

        processSkill(firstSelectedSkill, lastSelectedSkill, targetPokemon);
    }

    private void processSkill(int firstSelectedSkill, int lastSelectedSkill, PoketmonStruct targetPokemon) {
        int speedDifference = this.getSkillSpeed(firstSelectedSkill) - targetPokemon.getSkillSpeed(lastSelectedSkill);

        System.out.println();
        if (speedDifference > 0 ) {                     //내 포켓몬이 더 빠른 경우
            useSkill(this.getSkillName(firstSelectedSkill), this.getSkillDamage(firstSelectedSkill), targetPokemon, this);
            useSkill(targetPokemon.getSkillName(lastSelectedSkill), targetPokemon.getSkillDamage(lastSelectedSkill), this, targetPokemon);
        } else if(speedDifference < 0) {                //상대 포켓몬이 더 빠른 경우
            useSkill(targetPokemon.getSkillName(lastSelectedSkill), targetPokemon.getSkillDamage(lastSelectedSkill), this, targetPokemon);
            useSkill(this.getSkillName(firstSelectedSkill), this.getSkillDamage(firstSelectedSkill), targetPokemon, this);
        } else {                                        // 방법 1 : 두 포켓몬의 속도가 같은 경우 랜덤으로 처리
            Random random = new Random();               // 방법 2 : 먼저 공격을 선택한 쪽이 더 빠르게 공격 처리
            boolean isThisFirst = random.nextBoolean();
            System.out.print("간발의 차로");
            if (isThisFirst) {
                useSkill(this.getSkillName(firstSelectedSkill), this.getSkillDamage(firstSelectedSkill), targetPokemon, this);
                useSkill(targetPokemon.getSkillName(lastSelectedSkill), targetPokemon.getSkillDamage(lastSelectedSkill), this, targetPokemon);
            } else {
                useSkill(targetPokemon.getSkillName(lastSelectedSkill), targetPokemon.getSkillDamage(lastSelectedSkill), this, targetPokemon);
                useSkill(this.getSkillName(firstSelectedSkill), this.getSkillDamage(firstSelectedSkill), targetPokemon, this);
            }
        }

//            case 1:
//                if (this.skillSpeed1 >= targetPokemon.skillSpeed1) {
//                    useSkill(this.skillName1, this.skillDmg1, targetPokemon);
//                } else {
//                    System.out.println(this.poketmonName + "(이)가 느리기 때문에 " + targetPokemon.poketmonName + "에게 선공을 내달리지 못했습니다.");
//                }
//                break;
//            case 2:
//                if (this.skillSpeed2 >= targetPokemon.skillSpeed2) {
//                    useSkill(this.skillName2, this.skillDmg2, targetPokemon);
//                } else {
//                    System.out.println(this.poketmonName + "(이)가 느리기 때문에 " + targetPokemon.poketmonName + "에게 선공을 내달리지 못했습니다.");
//                }
//                break;

    }

    private void useSkill(String skillName, int skillDmg, PoketmonStruct targetPokemon, PoketmonStruct subject) {
        System.out.println(subject.nickName + "이(가)" +skillName + " 기술을 사용합니다.");
        targetPokemon.hp -= skillDmg;
        System.out.println(targetPokemon.poketmonName + " 남은 HP: " + targetPokemon.hp);

        if (targetPokemon.hp <= 0) {
            System.out.println(targetPokemon.poketmonName + "이 항복했습니다.");
        }
    }

    private int getSkillSpeed(int selectedSkill) {
        switch (selectedSkill) {
            case 1:
                return this.skillSpeed1;
            case 2:
                return this.skillSpeed2;
            default:
                return 0;
        }
    }

    private int getSkillDamage(int selectedSkill) {
        switch (selectedSkill) {
            case 1:
                return this.skillDmg1;
            case 2:
                return this.skillDmg2;
            default:
                return 0;
        }
    }

    private String getSkillName(int selectedSkill) {
        switch (selectedSkill) {
            case 1:
                return this.skillName1;
            case 2:
                return this.skillName2;
            default:
                return null;
        }
    }

}
