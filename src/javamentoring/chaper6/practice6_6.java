package javamentoring.chaper6;

import java.util.Scanner;

public class practice6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // java naming convention 협약
//        상수는 두드러지게 표현하기 위해 모든 철자를 대문자로 쓰고, 단어의 구분이 필요할 때 _ 를 사용해 구분
//        메소드와 필드 매개변수, 변수는 첫 글자가 소문자로 시작하는 camelCase로 작성
//        메소드명은 동사로 명명하거나 is, has, save, get 등 동사로 시작해야 함
//        변수명은 명사를 사용
        int userWinCount=0, computerWinCount = 0;         // 유저가 이긴 횟수, 컴퓨터가 이긴 횟수

        while(true) {
            System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
            int answer = scanner.nextInt();

            String userAnswer;
            String computerAnswer;
            // (int) Math.random() * (최댓값-최소값+1) + 최소값 => 최소값 ~ 최댓값 정수
            int computerselect = (int)(Math.random() * 3 + 1);
            if(answer == 1) {
                userAnswer = "사용자 가위";
            } else if (answer == 2) {
                userAnswer = "사용자 바위";
            } else if (answer == 3) {
                userAnswer = "사용자 보";
            } else if (answer ==4) {
                System.out.println("사용자가 이긴 횟수 : " + userWinCount);
                System.out.println("컴퓨터가 이긴 횟수 : " + computerWinCount);

                break;
            } else {
                System.out.println("1, 2, 3, 4 만 골라주세요.");
                continue;
            }

            if(computerselect == 1) {
                computerAnswer = "컴퓨터 가위";
            } else if (computerselect == 2) {
                computerAnswer = "컴퓨터 바위";
            } else {
                computerAnswer = "컴퓨터 보";
            }

            System.out.println(userAnswer + ":" + computerAnswer);

            if( answer == computerselect) {
                System.out.println("비겼습니다.");
                // } else if ( (answer == 1 && computerselect == 3) ||
                //            (answer == 2 && computerselect == 1) ||
                //            (answer == 3 && computerselect == 2) ) {
            } else if ( ( answer < computerselect && (computerselect-answer) != 2 ) || (answer - computerselect) == 2 ){
                System.out.println("컴퓨터가 이겼습니다.");
                computerWinCount++;
            } else {
                System.out.println("사용자가 이겼습니다.");
                userWinCount++;
            }

        }
    }
}
