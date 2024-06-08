package javamentoring.chapter7;

import java.util.ArrayList;

public class Theory7_8 {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<Double>();
        for (int i = 0; i < 20; i++) {
            double d = Math.random() * 100;  // 0에서 100 사이의 임의의 실수를 생성
            a.add(d);  // 생성된 실수를 ArrayList에 추가
        }

        // 향상된 for문을 사용하여 ArrayList의 요소를 출력
        for (Double d : a) {
            System.out.println(d);
        }
    }
}
