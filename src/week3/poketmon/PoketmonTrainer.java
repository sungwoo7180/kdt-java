package week3.poketmon;

import java.util.ArrayList;
import java.util.List;

public class PoketmonTrainer {
    private String name;
    private PoketmonStruct[] poketmonCaptured = new PoketmonStruct[6];  // 정예 6마리 (포켓볼로 소지)
    private List<PoketmonStruct> capturedPoketmonList;                  // 오박사가 관리하는 포켓몬 리스트

    public List<PoketmonStruct> getCapturedPokemonList() {
        return capturedPoketmonList;
    }

    public PoketmonTrainer(String name) {
        this.name = name;
        this.capturedPoketmonList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PoketmonStruct[] getPoketmolCaptured() {
        return poketmonCaptured;
    }

    //    public void setPokemolCaptured(PokemonStruct[] pokemolCaptured) {
    //        this.pokemolCaptured = pokemolCaptured;
    //    }
    public void captureNewPokemon(PoketmonStruct newPoketmon) {
        //PokemonStruct[] 으로도 문제를 해결해야 한다.
        //System.out.println(pokemolCaptured.length); 현재 길이 정보로는 해결하기 어려웠다.
        //배열에서 초기화하지 않은 위치 -> 참조 자료형의 경우 null, 기본 자료형의 경우 해당 자료형의 부정표현(0, 0.0 , false)

        int count = 0;      //index 확인용
        for (PoketmonStruct pokemonSlot : poketmonCaptured) {
            if (pokemonSlot==null) {
                poketmonCaptured[count] = newPoketmon;
                System.out.println(newPoketmon +"을 " + count +"번지에 담았습니다.");
                return;
            }
            count++;
        }
        System.out.println(newPoketmon.getPoketmonName() +"을 담을 공간이 없습니다.");
        capturedPoketmonList.add(newPoketmon);
        //list<> or ArrayList<>
    }

    public void captureNewPokemonInList(PoketmonStruct newPokemon) {
        int currentSize= capturedPoketmonList.size();
        capturedPoketmonList.add(newPokemon);
        System.out.println(newPokemon.getPoketmonName() +"을 " + currentSize +"번지에 담았습니다." );
    }
}
