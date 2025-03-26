package week4.cafe;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class OrderSheet {
    int DailyOrderNumber;                                               // 주문 번호 (하루 영수증 순번)
    boolean isTakeout;                                                  // 테이크 아웃 여부
    public Map<Food, Integer> OrderList = new LinkedHashMap<>();        // 주문 모음
    public int total;                                                   // 총 금액
    //public int miles;                                                 // 총 마일리지
    //public int addMiles;                                              // 추가된 마일리지

    public int calculateTotal() {
        int total = 0;
        for (Map.Entry<Food, Integer> entry : OrderList.entrySet()) {
            Food food = entry.getKey();
            int quantity = entry.getValue();
            total += food.getFoodPrice() * quantity;
        }
        return total;
    }


}
