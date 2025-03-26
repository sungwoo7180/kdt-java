package week2.poketmon;

public class PokemonLuncher {
    public static void main(String[] args) {
        //여기는 태초마을입니다.
        System.out.println("태초 마을입니다.");

//        //피카츄 만들기
//        String pikachu = "Pikachu";
//        int pikachuHp = 50;
//        String pikachuSkill1 = "백만볼트";
//        int pikachuSkill1Damage = 20;
        poketmonStruct pikachu = new poketmonStruct("Pikachu",50 ,"백만볼트", 20);

        //꼬부기 만들기
//        String kkobugi = "Kkobugi";
//        int kkobugiHp = 50;
//        String kkobugiSkill1 = "물대포";
//        int kkobugiSkill11Damage = 15;
        poketmonStruct kkobugi = new poketmonStruct("Kkobugi",50 ,"물대포", 15);

//        //구구 만들기
//        String gugu = "Gugu";
//        int guguHp = 30;
//        String guguSkill1 = "부리로 쪼기";
//        int guguSkill1Damage = 25;
        poketmonStruct gugu = new poketmonStruct("Gugu",30 ,"부리로 쪼기", 25);

//        //꼬렛 만들기
//        String kkoret = "Kkoret";
//        int kkoretHp = 40;
//        String kkoretSkill1 = "깨물기";
//        int kkoretSkill1Damage = 17;
        poketmonStruct kkoret = new poketmonStruct("Kkoret",40 ,"깨물기", 17);


//        pikachuGuguBattle(pikachu, pikachuHp, pikachuSkill1Damage, pikachuSkill1,
//                gugu, guguHp, guguSkill1Damage, guguSkill1);
    }

//    public static void pikachuGuguBattle(String pikachuName, int pikachuHp, int pikachuSkill1Damage, String pikachuSkill1,
//                                         String poketmon1.name, int guguHp, int guguSkill1Damage, String guguSkill1)
//    {
//        boolean surrenderAny = false;
//        while(!surrenderAny) {
//            if (guguHp > 0) {
//                // 피카츄 공격 후 구구 Hp 표시
//                System.out.println(pikachuName + "(이)가" + poketmon1.name + "(을)를 공격합니다.");
//                System.out.println(pikachuSkill1 + " 스킬을 사용합니다.");
//                guguHp -= guguSkill1Damage;
//                System.out.println(poketmon1.name + "남은 HP : " + guguHp );
//                if(guguHp <= 0) {
//                    surrenderAny = true;
//                    System.out.println(poketmon1.name + "(이)가 항복했습니다.");
//                }
//            } else {
//                surrenderAny = true;
//                System.out.println(poketmon1.name + "(이)가 항복했습니다.");
//            }
//            System.out.println(
//            "--------------------------------------");
//            if(pikachuHp > 0 && !surrenderAny) {
//                //구구 공격 후 피카츄 Hp 표시
//                System.out.println(poketmon1.name + "(이)가" + pikachuName + "(을)를 공격합니다.");
//                System.out.println(guguSkill1 + " 스킬을 사용합니다.");
//                pikachuHp -= pikachuSkill1Damage;
//                System.out.println(pikachuName + "남은 HP : " + pikachuHp );
//            } else {
//                surrenderAny = true;
//                System.out.println(poketmon1.name + "(이)가 항복했습니다.");
//            }
//            System.out.println("--------------------------------------");
//        }
//    }
    //gugu를 포켓몬1로 피카츄를 포켓몬2로
    public static void poketmonBattle(poketmonStruct poketmon1, poketmonStruct poketmon2) {
        boolean surrenderAny = false;
        while(!surrenderAny) {
            if (poketmon1.hp > 0) {
                // poketmon2 공격 후 poketmon1 Hp 표시
                System.out.println(poketmon2.monsterName + "(이)가" + poketmon1.monsterName + "(을)를 공격합니다.");
                System.out.println(poketmon2.skillName + " 스킬을 사용합니다.");
                poketmon1.hp -= poketmon2.skillDmg;
                System.out.println(poketmon1.monsterName + "남은 HP : " + poketmon1.hp );
                if(poketmon1.hp <= 0) {
                    surrenderAny = true;
                    System.out.println(poketmon1.monsterName + "(이)가 항복했습니다.");
                }
            } else {
                surrenderAny = true;
                System.out.println(poketmon1.monsterName + "(이)가 항복했습니다.");
            }
            System.out.println(
            "--------------------------------------");
            if(poketmon2.hp > 0 && !surrenderAny) {
                //구구 공격 후 피카츄 Hp 표시
                System.out.println(poketmon1.monsterName + "(이)가" + poketmon2.monsterName + "(을)를 공격합니다.");
                System.out.println(poketmon1.skillName + " 스킬을 사용합니다.");
                poketmon2.hp -= poketmon2.skillDmg;
                System.out.println(poketmon2.monsterName + "남은 HP : " + poketmon2.hp );
            } else {
                surrenderAny = true;
                System.out.println(poketmon1.monsterName + "(이)가 항복했습니다.");
            }
            System.out.println("--------------------------------------");
        }
    }

}
