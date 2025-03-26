package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoSimulator {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();       //퍼스트 타임 체크
        // 컬렉션 인스턴스 생성
        List<Integer> list = new ArrayList<>();
        List<Integer> winningNumber = new ArrayList<>();
        winningNumber.add(4);
        winningNumber.add(14);
        winningNumber.add(16);
        winningNumber.add(29);
        winningNumber.add(37);
        winningNumber.add(45);
        Random rand = new Random();
        boolean LottoWinning = false;
        int tryCount = 0;
        int singleNumberPicked;
        while(!LottoWinning) {
            int i = -1;
            while (list.size() < 6) {
                singleNumberPicked = rand.nextInt(45) + 1;
                if(!list.contains(singleNumberPicked)){ //중복 체크 후 삽입
                    list.add(singleNumberPicked);
                    i++;
                }
                //System.out.print(list.get(i) + "  ");
            }
            Collections.sort(list);
            System.out.println("\n" + list);
            System.out.println(winningNumber);
            if (winningNumber.equals(list)) {
                LottoWinning = true;
                System.out.println("1등 당첨입니다.");
            }
            list.clear();
            tryCount++;

            System.out.println("시도횟수 : " + tryCount);
        }

        long afterTime = System.currentTimeMillis();        //라스트 타임 체크
        double secDiffTime = (afterTime - beforeTime) / 1000.0;   //두 시간에 차 계산 (소요시간)
        System.out.println("소요 시간 : " + secDiffTime + "초 입니다.");
    }
}
