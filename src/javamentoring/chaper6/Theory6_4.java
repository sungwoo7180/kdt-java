package javamentoring.chaper6;

import java.util.StringTokenizer;

public class Theory6_4 {
    public static void main(String[] args) {

        // (1) 문자열 "20"을 정수 20으로 변환
        int number = Integer.parseInt("20");
        System.out.print(number);
        Object a = number;  // int number를 Object 형으로 형 변환 => 박싱, 필드 변수가 커요? 객체가 커요?
        System.out.println(a instanceof Integer);  // 출력: true

        // (2) 문자열 "35.9"를 double 타입 실수 35.9로 변환
        double doubleNumber = Double.parseDouble("35.9");
        System.out.println(doubleNumber);

        // (3) 불린 값 true를 "true"라는 문자열로 변환
        String booleanString = Boolean.toString(true);
        System.out.println(booleanString);

        // (4) char 타입의 변수 c의 문자가 영문자면 "eng" 출력
        char c = 'a';
        if (Character.isAlphabetic(c)) {
            System.out.println("eng");
        }

        // (5) int 타입의 변수 n의 값을 이진수의 문자열로 변환
        int n = 10;
        String binaryString = Integer.toBinaryString(n);
        System.out.println("binaryString");

        // (6) 정수 50을 16진수의 문자열로 변환
        String hexString = Integer.toHexString(50);
        System.out.println("hexString");

//        double d = new Double(3.4);
        double d = 1.2 + Double.valueOf(3.4); // 또는 1.2 + 3.4; (자동 박싱을 사용)
        System.out.println(d);
        // float f = 1.1f + Float.valueOf(3.1f);


        String st = "sungwoo, computer, software";
        StringTokenizer stoken = new StringTokenizer( st, " " );


    }
}
