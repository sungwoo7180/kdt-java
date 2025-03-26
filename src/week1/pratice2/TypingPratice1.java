package week1.pratice2;

import java.util.Scanner;

public class TypingPratice1 {
    private static boolean power = true;
    String princeString1 = new String("여러가지 색깔의 flame\n" +
//            "메모하기 바뻐 여긴 내가 배워갈게 많어\n" +
//            "가만히 좀 내비둬 봐 니가 다시\n" +
//            "깨끗했던 곳의 물줄기를 흐리게 만들어도\n" +
//            "장미 한 송이만 있으면 돼 난 yeah\n" +
//            "매일 타던 비행기가 고장나도 되니깐\n" +
//            "나랑 같이 걸어 또 쟤넨 설명이 넘 많아\n" +
//            "안보이더라도 큼지막한 것은 말야\n" +
//            "내가 상상했던 그런 특이한 design\n" +
//            "I wanna keep 이대로 순수한 값만\n" +
//            "나름 소신 지켜 나를 왜 또 잡어\n" +
//            "페리형도 안돼 내 미래를 control\n" +
//            "Yeah yeah 그들만의 밤\n" +
//            "누군가를 거절하고 혼자지낸\n" +
//            "방까지 밀어 밀어 버려\n" +
//            "그게 만약 나를 바꿔주는 계기가 된다면\n" +
            "계속 유지해버리고 나를 밀어");
    //multiline string을 쓸 경우에 \n을 쓰지 않아도 알아서 처리 해준다.
    String princeString2 = new String("""
            What is love?
            We can fly girl when you see me twice
            So what so what so what so what
            What is love?
            We can fly girl when you feel me twice
            So what so what so what so what
            """);
    String princeString3 = new String("""
            ねぇ、もしも全て投げ捨てられたら
            笑って生きることが楽になるの
            また胸が痛くなるから
            もう何も言わないでよ
            ねぇ、もしも全て忘れられたなら
            ないで生きることも楽になるの？
            でもそんな事出来ないから
            もう何も見せないでよ
            君にどれだけ近づいても
            僕の心臓は一つだけ
            酷いよ　酷いよ、もういっそ僕の体を3
            壊して　引き裂いて　好きなようにしてよ
            叫んで　藻掻いて　瞼を腫らしても
            まだ君は僕の事を抱きしめて離さない
            もういいよ
            ねぇ、もしも僕の願いが叶うなら
            君と同じものが欲しいんだ
            """);
    private static Scanner scanner = new Scanner(System.in); // 클래스 수준에서 Scanner 선언

    public static void main(String[] args) {
        while(power) {
            System.out.println("타자 연습 게임 메뉴얼");
            System.out.print("언어를 선택해주세요. (1. 한국어 2. 영어 3. 일본어 4. 종료) ");
            TypingPratice1 user = new TypingPratice1();
            String numberStr = scanner.next();
            scanner.nextLine(); // 버퍼 비우기
            // T : 제어문에서 함수 처리로 큰 덩어리를 분해 하면 좋다.
            if(numberStr.equals("1")){
                user.koreanTyping();
            } else if (numberStr.equals("2")) {
                user.englishTyping();
            } else if (numberStr.equals("3")) {
                user.japaneseTyping();
            } else if (numberStr.equals("4")) {
                power = false; // 종료 옵션 선택 시 루프 종료
            }
            else {
                System.out.println("잘못된 언어 선택입니다. (1. 한국어 2. 영어 3. 일본어 4. 종료)");
            }
        }
    }

    public void koreanTyping() {
        // 문자열을 줄 단위로 분할하여 출력
        String[] lines = princeString1.split("\n");
        lineCheck(lines);
    }
    public void englishTyping() {
        // 문자열을 줄 단위로 분할하여 출력
        String[] lines = princeString2.split("\n");
        lineCheck(lines);
    }
    public void japaneseTyping() {
        String[] lines = princeString3.split("\n");
        lineCheck(lines);
    }

    public void lineCheck(String[] lines) {
        double count= 0, incorrectNum = 0;
        long beforeTime = System.currentTimeMillis();       //퍼스트 타임 체크
        for (String line : lines) {
            boolean CorrectInput = false;
            while(!CorrectInput) {
                System.out.println(line);
                String inString = scanner.nextLine();
                count++;
                //next() 메소드는 공백이나 개행 문자를 기준으로 입력을 받아들이기 때문에 한 줄의 모든 문자열을 받지 않고 공백 문자까지만 인식하고 루프가 반복될 때 이전에 입력된 문자열을 그대로 사용하게 됩니다.
                //System.out.println(inString); System.out.println(line);
                if(line.equals(inString)){
                    CorrectInput = true; // 입력이 올바르면 루프 종료
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    incorrectNum++;
                }
            }
        }
        long afterTime = System.currentTimeMillis();        //라스트 타임 체크
        long secDiffTime = (afterTime - beforeTime)/1000;   //두 시간에 차 계산 (소요시간)
        System.out.println("소요 시간 : " + secDiffTime + "초 입니다.");
        double accuracy = 100 - (double) incorrectNum / count * 100;
        System.out.printf("정확도는 %.3f%% 입니다.\n", accuracy);    }
}
