package week3.poketmon;

public class PoketmonLuncher {
    public static void main(String[] args) {

        LoginHashMap loginHashMap = new LoginHashMap();
        loginHashMap.startPokemon();

        System.out.println("save 지점으로 이동 중입니다.");

        PoketmonStruct pikachu = new PoketmonStruct("Pikachu", "myPikachu", 50, "백만볼트", 20 , 10, "전광석화", 10, 20);
        PoketmonStruct lucario = new PoketmonStruct("Lucario", "myLucario", 60, "악의 파동", 30 , 5, "파동탄", 10, 9);
        PoketmonStruct Garchomp = new PoketmonStruct("Garchomp", "myGarchomp", 60, "파괴광선", 100 , 3, "연속찌르기", 8, 9);
        boolean Traveling = true;
//        while (!Traveling) {
//            System.out.println("1. 모험하기");
//            System.out.println("야생의 누군가가 나타났다.");
//        }
        pokemonObjectUnitBattle(pikachu, lucario);


    }
    // 구조체를 사물 단위로 묶어서 동작과 함께 다루면 어떨까? => 클래스의 개념이 정립됨.
    public static void pokemonObjectUnitBattle (PoketmonStruct pokemon1, PoketmonStruct pokemon2) {
        while (pokemon1.getHp() > 0 && pokemon2.getHp() > 0) {
            // 테스트 코드 (HP를 조절해보자)
            pokemon1.attack(pokemon2);
            if (pokemon2.getHp() > 0) {
                pokemon2.attack(pokemon1);
            }
        }
    }
}
