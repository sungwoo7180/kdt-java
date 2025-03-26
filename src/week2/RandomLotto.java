package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class RandomLotto {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();       //퍼스트 타임 체크
        // 컬렉션 인스턴스 생성
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0 ; i < 7 ; i++) {
            list.add(rand.nextInt(45) + 1);
            System.out.println(list.get(i));
        }
        long afterTime = System.currentTimeMillis();        //라스트 타임 체크
        double secDiffTime = (afterTime - beforeTime) / 1000.0;   //두 시간에 차 계산 (소요시간)
        System.out.println("소요 시간 : " + secDiffTime + "초 입니다.");
    }
}
