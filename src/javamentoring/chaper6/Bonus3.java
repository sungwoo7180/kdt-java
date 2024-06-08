package javamentoring.chaper6;

import java.util.Scanner;

public class Bonus3 {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String first= text.substring(0,1);
        String last= text.substring(1);
        text = last +first;
        System.out.println(text);
        System.out.println("문자열을 입력하고 Enter를 누르세요. 'q'를 입력하면 프로그램이 종료됩니다.");
    }
}
