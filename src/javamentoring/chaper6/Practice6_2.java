package javamentoring.chaper6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String query = scanner.nextLine();
            if(query.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }
            StringTokenizer st = new StringTokenizer(query, " ");
            int number = st.countTokens();
            System.out.println("어절 갯수는 " + number);
        }


    }
}
