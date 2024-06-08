package javamentoring.chapter7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("빈 칸으로 분리하여 5개의 학점을 입력 ( A / B / C / D / F ) >>");
        String userGrade = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(userGrade, " ");
        ArrayList<String> grades = new ArrayList<String>(5);
        while (st.hasMoreTokens()) {
            grades.add(st.nextToken());  // 토큰을 읽어 ArrayList에 추가
        }
        for(int i=0;i<grades.size();i++) {
            if(grades.get(i).equals("A")) {
                System.out.print(4.0);
            }
            else if(grades.get(i).equals("B")) {
                System.out.print(3.0);
            }
            else if(grades.get(i).equals("C")) {
                System.out.print(2.0);
            }
            else if (grades.get(i).equals("D")) {
                System.out.print(1.0);
            }
            else if(grades.get(i).equals("F")) {
                System.out.print(0.0);
            }
            else {
                System.out.print("잘못된 입력입니다.");
            }
            System.out.print(" ");
        }
    }
}
