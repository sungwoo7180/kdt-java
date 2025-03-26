package week4.cafe;

import java.util.LinkedHashMap;
import java.util.Map;

import static week4.cafe.Size.*;


public class CafeMenuBoard {

    // ver 1HashMap이 특성상 순서를 보장해주지 않음 출력할때 순서 보장을 원한다면 LinkedHashMap을 사용해야함
//    public static final Map<String, Drink> CaffeMenuList = new HashMap<>();        // drink 모음
//    public static final Map<String, Dessert> CaffeMenuList = new HashMap<>();    // dessert 모음
    //ver2
//    public static final Map<Integer, Drink> DrinkList = new LinkedHashMap<>();        // drink 모음
//    public static final Map<Integer, Dessert> DessertList = new LinkedHashMap<>();    // dessert 모음
    //ver3
    public static final Map<Integer, Food> CaffeMenuList = new LinkedHashMap<>();    // dessert 모음
    //boolean isTakeout = false;                                  //테이크 아웃의 여부

    static {
        // key값을 제품넘버(주문 번호)로 관리
        //프로젝트내 단어전체검색 : ctrl + shift + f ,  프로젝트내에 단어를 일괄적으로 수정 : ctrl + shift + r
        CaffeMenuList.put(1, new Drink("Americano (Venti size)", 4500, Venti));
        CaffeMenuList.put(2, new Drink("Americano (Grande size)", 4000, Grande));
        CaffeMenuList.put(3, new Drink("Americano (Tall size)",3000 , Tall));
        CaffeMenuList.put(4, new Drink("CaramelMacchiato (Venti size)", 6700, Venti));
        CaffeMenuList.put(5, new Drink("CaramelMacchiato (Grande size)", 6000, Grande));
        CaffeMenuList.put(6, new Drink("CaramelMacchiato (Tall size)",5000 , Tall));
        CaffeMenuList.put(7, new Drink("Cappuccino (Venti size)", 6700, Venti));
        CaffeMenuList.put(8, new Drink("Cappuccino (Grande size)", 5800, Grande));
        CaffeMenuList.put(9, new Drink("Cappuccino (Tall size)",5200 , Tall));
        CaffeMenuList.put(10, new Drink("LemonAde (Venti size)", 6500, Venti));
        CaffeMenuList.put(11, new Drink("LemonAde (Grande size)", 6000, Grande));
        CaffeMenuList.put(12, new Drink("LemonAde (Tall size)",5000 , Tall));

        CaffeMenuList.put(13, new Dessert("CheeseCake",27000));
        CaffeMenuList.put(14, new Dessert("CheeseCake 1Piece",4500, 1));
        CaffeMenuList.put(15, new Dessert("CheeseCake",30000));
        CaffeMenuList.put(16, new Dessert("CheeseCake 1Piece",5000, 1));
        CaffeMenuList.put(17, new Dessert("ChocoCake",25000));
        CaffeMenuList.put(18, new Dessert("CheeseCake 1Piece",4000, 1));
        CaffeMenuList.put(19, new Dessert("Honey Bread",5000));
        CaffeMenuList.put(20, new Dessert("Cheese Bun",4000));
        CaffeMenuList.put(21, new Dessert("Mocha Bun",4000));
        CaffeMenuList.put(22, new Dessert("Tiramisu",6000));
        CaffeMenuList.put(23, new Dessert("Hot Dog",3500));
        CaffeMenuList.put(24, new Dessert("Honey Cinamon Waffle",3500));

        CaffeMenuList.put(25, new Dessert("Waffle",3500));
        //Key 값에 제품명을 쓴 경우
//        DrinkList.put("Americano (Venti size)", new Drink("Americano (Venti size)", 4500, Venti));
//        DrinkList.put("Americano (Grande size)", new Drink("Americano (Grande size)", 4000, Grande));
//        DrinkList.put("Americano (Tall size)", new Drink("Americano (Tall size)",3000 , Tall));
//        DrinkList.put("CaramelMacchiato (Venti size)", new Drink("CaramelMacchiato", 6700, Venti));
//        DrinkList.put("CaramelMacchiato (Grande size)", new Drink("CaramelMacchiato", 6000, Grande));
//        DrinkList.put("CaramelMacchiato (Tall size)", new Drink("CaramelMacchiato",5000 , Tall));
//        DrinkList.put("Cappuccino (Venti size)", new Drink("Cappuccino", 6700, Venti));
//        DrinkList.put("Cappuccino (Grande size)", new Drink("Cappuccino", 5800, Grande));
//        DrinkList.put("Cappuccino (Tall size)", new Drink("Cappuccino",5200 , Tall));
//        DrinkList.put("LemonAde (Venti size)", new Drink("LemonAde", 6500, Venti));
//        DrinkList.put("LemonAde (Grande size)", new Drink("LemonAde", 6000, Grande));
//        DrinkList.put("LemonAde (Tall size)", new Drink("LemonAde",5000 , Tall));
//
//        DessertList.put("CheeseCake", new Dessert("CheeseCake",27000));
//        DessertList.put("CheeseCake 1Piece", new Dessert("CheeseCakePiece",4500, 1));
//        DessertList.put("StrawberryCake", new Dessert("CheeseCake",30000));
//        DessertList.put("StrawberryCake 1Piece", new Dessert("CheeseCakePiece",5000, 1));
//        DessertList.put("ChocoCake", new Dessert("ChocoCake",25000));
//        DessertList.put("ChocoCake 1Piece", new Dessert("CheeseCakePiece",4000, 1));


    }
}
