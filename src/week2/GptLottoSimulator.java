//package week2;
//
//import java.util.*;
//
//public class GptLottoSimulator {
//
//    // 번호를 고르는 메서드
//    private static Set<Integer> pickUniqueNumbers(Random numberPicker) {
//        Set<Integer> numberSet = new HashSet<>();
//        while (numberSet.size() < 6) {
//            int singleNumberPicked = numberPicker.nextInt(45) + 1; // 1부터 45까지 번호를 선택
//            numberSet.add(singleNumberPicked);
//        }
//        return numberSet;
//    }
//
//    public static void main(String[] args) {
//        Set<Integer> lottoWinnerNumberSet = new HashSet<>();
//        Random numberPicker = new Random();
//
//        // 로또 당첨 번호 생성
//        lottoWinnerNumberSet = pickUniqueNumbers(numberPicker);
//
//        // 로또 당첨 번호와 일치할 때까지 뽑기
//        int tryCount = 0;
//
//        Set<Integer> lottoTryNumberSet;
//        do {
//            lottoTryNumberSet = pickUniqueNumbers(numberPicker);
//            tryCount++;
//            System.out.println("-----------------------");
//        } while (!lottoWinnerNumberSet.equals(lottoTryNumberSet));
//
//        System.out.println(tryCount + "회차 로또를 구매하여 로또에 당첨되었습니다!");
//        System.out.println("당첨 번호: " + lottoWinnerNumberSet);
//        System.out.println("구매한 번호: " + lottoTryNumberSet);
//    }
//}
package week2;

import java.util.*;

public class GptLottoSimulator {

    private static Set<Integer> pickUniqueNumbers(Random numberPicker) {
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 6) {
            int singleNumberPicked = numberPicker.nextInt(45) + 1; // 1부터 45까지 번호를 선택
            numberSet.add(singleNumberPicked);
        }
        return numberSet;
    }
    private static void checkNumber(int matchedNumbers, Set<Integer> lottoTryNumberSet, Set<Integer> lottoWinnerNumberSet){
        // 등수 판단
        if (matchedNumbers == 6) {
            System.out.println("1등 당첨! 축하합니다!");
        } else if (matchedNumbers == 5 && lottoWinnerNumberSet.containsAll(lottoTryNumberSet)) {
            System.out.println("2등 당첨! 축하합니다!");
        } else if (matchedNumbers == 5) {
            System.out.println("3등 당첨! 축하합니다!");
        } else if (matchedNumbers == 4) {
            System.out.println("4등 당첨! 축하합니다!");
        } else if (matchedNumbers == 3) {
            System.out.println("5등 당첨! 축하합니다!");
        } else {
            System.out.println("아쉽지만 당첨되지 않았습니다. 다음 기회에!");
        }
    }
    public static void main(String[] args) {
        Set<Integer> lottoWinnerNumberSet = new HashSet<>();
        Random numberPicker = new Random();

        // 로또 당첨 번호 생성
        lottoWinnerNumberSet = pickUniqueNumbers(numberPicker);

        // 로또 당첨 번호와 일치할 때까지 뽑기
        int tryCount = 0;

        Set<Integer> lottoTryNumberSet;
        do {
            int matchedNumbers = 0;
            lottoTryNumberSet = pickUniqueNumbers(numberPicker);
            tryCount++;
            // 당첨 번호와 구매한 번호의 일치하는 숫자 개수 파악
            System.out.print("맞춘 번호는 ");
            for (int number : lottoTryNumberSet) {
                if (lottoWinnerNumberSet.contains(number)) {
                    System.out.print(number + "\t");
                    matchedNumbers++;
                }
            }
            System.out.println();
            checkNumber(matchedNumbers, lottoTryNumberSet, lottoWinnerNumberSet);
            System.out.println(lottoTryNumberSet);
            System.out.println("-----------------------");
        } while (!lottoWinnerNumberSet.equals(lottoTryNumberSet));

        System.out.println(tryCount + "회차 로또를 구매하여 로또에 당첨되었습니다!");
        System.out.println("당첨 번호: " + lottoWinnerNumberSet);
        System.out.println("구매한 번호: " + lottoTryNumberSet);
        System.out.println("당신의 소비 금액은: " + tryCount + "000원이며");
        if(tryCount < 1000000) {
            System.out.println("당신의 이득은 " + (1000000-tryCount) + "000원 입니다,");
        } else {
            System.out.println("당신의 손해는" + (tryCount-1000000) + "000원 입니다,");
        }


    }
}
