package week4.cafe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Food {

    String drinkName;   // 음료 이름
    int drinkPrice;     // 음료 가격
    boolean isHot;      // isHot : 1(hot), 0(ice)
    int addShotNum;     // 샷 추가 횟수
    Size size;          // 음류 사이즈, Tall(12oz), Grande(16oz), Venti(20oz)

    public Drink(String drinkName, int drinkPrice, boolean isHot, int addShotNum, Size size) {
        super(drinkName, drinkPrice);
        this.drinkName = foodName;
        this.drinkPrice = foodPrice;
        this.isHot = isHot;
        this.addShotNum = addShotNum;
        this.size = size;
    }

    public Drink(String drinkName, int drinkPrice, Size size) {
        super(drinkName, drinkPrice);
        this.drinkName = foodName;
        this.drinkPrice = foodPrice;
        this.size = size;
    }


}
