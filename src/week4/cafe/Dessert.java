package week4.cafe;

import lombok.Getter;

@Getter
public class Dessert extends Food {

    String dessertName;   // 디저트 이름
    int dessertPrice;     // 디저트 가격
    int piece;            // 조각, 6조각이 한판

    public Dessert(String dessertName, int dessertPrice) {                      // 전체 구매 시
        super(dessertName, dessertPrice);
        this.dessertName = foodName;
        this.dessertPrice = foodPrice;
    }

    public Dessert(String dessertName, int dessertPrice, int piece) {           // 조각으로 구매 시
        super(dessertName, dessertPrice);
        this.dessertName = foodName;
        this.dessertPrice = foodPrice;
        this.piece = piece;
    }
}
