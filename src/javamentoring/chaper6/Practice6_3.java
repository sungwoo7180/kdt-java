package javamentoring.chaper6;

import java.util.Scanner;

public class Practice6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // Math.random() => 자료형 double, 범위 : 0~1
            int a=(int)(Math.random()*3+1);
            int b=(int)(Math.random()*3+1);
            int c=(int)(Math.random()*3+1);

            System.out.println(a+"\t"+b+"\t"+c);
            if( a==b && b==c) {
                System.out.println("성공");
                break;
            }
        }
    }
}
