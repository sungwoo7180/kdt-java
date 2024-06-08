package javamentoring.chapter7;

import java.util.HashMap;
import java.util.Scanner;

public class Practice7_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Float> pointManger = new HashMap<String, Float>();
        System.out.println("** 포인트 관리 프로그램입니다. **");
        while(true) {
            System.out.print("이름과 포인터 입력>>");
            String input = scanner.nextLine();
//            StringTokenizer st = new StringTokenizer(query, " ");
//            pointManger.put(scanner.next(), scanner.nextFloat());

            String[] parts = input.split(" ");  // 입력 라인을 공백으로 분리
            if (parts.length < 2) {
                System.out.println("올바르지 않은 입력입니다. 다시 시도하세요.");
                continue;
            }

            String name = parts[0];  // 이름 부분
            float points = Float.parseFloat(parts[1]);  // 포인트 부분 파싱

            // Solve1) 점수 누적 처리
//            pointManger.merge(name, points, Float::sum);  // 메소드 레퍼런스로

            // Solve2) 점수 누적 처리
            if (pointManger.containsKey(name)) {
                // 이름이 이미 존재하면 기존 값에 새로운 포인트를 더함
                pointManger.put(name, pointManger.get(name) + points);
            } else {
                // 이름이 존재하지 않으면 새로운 키-값 쌍을 추가
                pointManger.put(name, points);
            }


            // 현재까지의 모든 고객 포인트 점수 출력
            System.out.println("현재까지의 모든 고객 포인트:");
            for (HashMap.Entry<String, Float> entry : pointManger.entrySet()) {
                System.out.print("(" + entry.getKey() + ", " + entry.getValue() + ")");
            }
            // pointManager.forEach((k, v) -> System.out.println(k + ": " + v));
            System.out.println();
        }

    }
}
