package week1.pratice1;

import java.util.Scanner;

public class remoconMachine implements IremoconMethod{       //
    private static boolean power = true;
    private int channel = 1;
    private int volume = 10;

    public remoconMachine() {
        this.channel = 1;
        this.volume = 10;
    }
    public static void main(String[] args) {

        while (power) {
            System.out.println("리모콘 조작 메뉴얼");
            System.out.println("1번 : 전원 on/off");
            System.out.println("2번 : 화면 이동");
            System.out.println("3번 : 볼륨 조절");
            System.out.println("-----------------------------");
            System.out.print("몇번을 고르시겠습니까? ");
            Scanner scanner = new Scanner(System.in);
            String numberStr = scanner.next();
            //int number = Integer.parseInt(numberStr);

            remoconMachine remoteControl = new remoconMachine();

            switch(numberStr) {
                case "1":
                    System.out.println("전원을 키시겠습니까?");
                    remoteControl.turnOn();
                    break;
                case "2":
                    remoteControl.move();
                    break;
                case "3":
                    remoteControl.changeVolume();
                    break;
                case "4":
                    remoteControl.checkStatus();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.\n");
                    break;
            }
        }
    }
    // 전원 on/off
    public void turnOn() {
        if(power) {
            System.out.println("전원을 끕니다.\n");
            power = false;
        }
        else {
            System.out.println("전원을 켭니다.\n");
        }
    }
    // 이동
    public void move() {
        System.out.print("몇번으로 이동 하시겠습니까?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        this.channel = num;
        System.out.println("현재 채널: " + this.channel + "\n");
    }

    // 볼륨 변경
    public void changeVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("볼륨을 몇으로 변경하시겠습니까? ");
        int num = scanner.nextInt();
        this.volume = num;
        System.out.println("현재 볼륨: " + this.volume+ "\n");
    }

    public void checkStatus() {
        System.out.println("현재 채널: " + this.channel + "\n현재 볼륨: " + this.volume+ "\n");
    }
}
