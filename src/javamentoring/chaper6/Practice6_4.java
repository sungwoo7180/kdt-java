package javamentoring.chaper6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String query = scanner.nextLine();
        query = query.trim();
//        System.out.println(query);

        StringTokenizer st = new StringTokenizer(query, "+");
        int num = st.countTokens();
        int sum = 0;
        for (int i = 0; i<num ; i++) {
            String number = st.nextToken().trim();  // 공백 제거
            sum += Integer.parseInt(number);  // 각 토큰을 정수로 변환하고 합계에 추가
        }

        System.out.println("합은 " + sum);
        scanner.close();
    }
}


