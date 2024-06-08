package javamentoring.chapter7;
import java.util.Scanner;
import java.util.Vector;

public class Practice7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Float> heights = new Vector<>(10);

        System.out.print("2000~2009년까지 1년 단위로 키(cm)를 입력\n>>");
        for (int i = 0; i < 10; i++) {
            heights.add(scanner.nextFloat());
        }

        float maxGrowth = 0.f; // 최대 성장값 초기화
        int yearOfMaxGrowth = 0; // 최대 성장 연도 초기화

        // 키 성장 계산
        for (int i = 1; i < heights.size(); i++) {
            float growth = heights.get(i) - heights.get(i - 1);
            if (growth > maxGrowth) {
                maxGrowth = growth;
                yearOfMaxGrowth = 2000 + i; // 최대 성장 연도 갱신
            }
        }

        // 결과 출력
        System.out.printf("가장 키가 많이 자란 년도는 %d년, 성장했던 cm는 %.1fcm입니다.\n", yearOfMaxGrowth, maxGrowth);
        scanner.close();
    }
}
