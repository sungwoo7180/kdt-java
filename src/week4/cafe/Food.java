package week4.cafe;

import lombok.Getter;

@
        Getter
public class Food {        //Q1) food로 엮는게 좋을지?
    // 장점 : 형다형성, 코드 단일화
    // 단점 : main 메소드에서 Dessert와 Drink만 가지고 있는걸 참조하는 경우 싹다 고쳐야 하고

    String foodName;                // 음료 이름
    int foodPrice;                  // 음료 가격
    int optionAddCount = 0;             // 옵션 추가 횟수 ( 시럽, 샷 추가 )
    //int countNumber = 0;            // Q2) 수량 서택을 위해 필드 멤버를 추가 했는데 실세계와 연관지을때 논리 오류?
                                    // static을 넣어선 안됨 영수증 마다 따로 count
    public Food(String foodName, int foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }
    public void addOption() {
        this.optionAddCount++;
    }
    @Override
    public String toString() {
        return String.format("%-30s - 가격: %,d원", foodName, foodPrice);
    }

}
