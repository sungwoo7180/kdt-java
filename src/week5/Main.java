package week5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 크기 N의 패턴을 만들기
        String[] pattern = new String[N];
        pattern[0] = "***";
        pattern[1] = "* *";
        pattern[2] = "***";

        // 크기 3부터 N까지의 패턴 생성
        for (int size = 3; size <= N; size *= 3) {
            for (int i = 0; i < size; i++) {
                pattern[i] = pattern[i] + pattern[i] + pattern[i];
            }
            for (int i = size; i < 2 * size; i++) {
                pattern[i] = pattern[i - size] + " ".repeat(size) + pattern[i - size];
            }
            for (int i = 2 * size; i < 3 * size; i++) {
                pattern[i] = pattern[i - 2 * size] + pattern[i - 2 * size] + pattern[i - 2 * size];
            }
        }

        // 결과 출력
        for (String row : pattern) {
            System.out.println(row);
        }
    }
}
