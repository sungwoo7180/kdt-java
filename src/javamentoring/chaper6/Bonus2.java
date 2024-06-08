package javamentoring.chaper6;

import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String s = scanner.nextLine();
            StringBuffer sb = new StringBuffer(s);
            if(sb.equals("exit")) {
//                System.out.println("종료합니다.");
                break;
            }
            int index = (int)(Math.random()*s.length());
            System.out.println(index);
            while(true) {
                int i = (int)(Math.random()*26);
                System.out.println(i);
                char c = (char)('a' + i);
                System.out.println(c);
                if( sb.charAt(index) != c) {
                    sb.replace(index, index + 1, String.valueOf(c));
                    break;
                }
            }
            System.out.println(sb);
        }

    }
}
