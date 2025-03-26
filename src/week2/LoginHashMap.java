package week2;

import java.util.HashMap;
import java.util.Scanner;

public class LoginHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> id = new HashMap<>();
        HashMap<Integer, String> passwd = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        id.put(1, "sungwoo7180");
        passwd.put(1, "as159357");

        while(true){
            boolean correctLogin = false;
            System.out.print("메뉴 1. 로그인 2. 회원가입 : ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                while(!correctLogin) {
                    System.out.print("ID를 입력해주세요 : ");
                    String putId = scanner.nextLine().trim();
//                  if(!id.get(1).equals(putId)) {
//                        System.out.println("존재 하지 않는 아이디입니다.");
//                        continue;}
                    if (!id.containsValue(putId)) {             //containsValue 메서드를 사용하여 입력된 ID가 id 해시맵에 존재하는지 확인합니다
                        System.out.println("아이디가 존재하지 않습니다.");
                        continue;
                    }
                    System.out.print("PASSWORD를 입력해주세요 : ");
                    String putPasswd = scanner.nextLine();
                    //이래선 안됨
//                    if(id.get(1).equals(putId) && passwd.get(1).equals(putPasswd)) {
//                        correctLogin = true;
//                        System.out.println("로그인 되었습니다.");
//                    } else {
//                        System.out.println("아이디 또는 비밀번호가 틀립니다.");
//                    }
                    boolean found = false;
                    for (int i = 1; i <= number; i++) {
                        if (id.get(i).equals(putId) && passwd.get(i).equals(putPasswd)) {
                            found = true;
                            correctLogin = true;
                            System.out.println("로그인 되었습니다.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("아이디 또는 비밀번호가 틀립니다.");
                    }
                }
            }
            else if(choice.equals("2")) {
                boolean register = false;
                boolean duplicate = false;
                while(!register) {
                    System.out.print("등록할 ID를 입력하시오.");
                    String registerId = scanner.nextLine().trim();
                    for (int i = 1; i < number; i++) {
                        if (!id.get(i).equals(registerId)) {        //
                            id.put(number, registerId);
                            duplicate = false;
                        } else {
                            duplicate = true;
                            System.out.println("중복된 값입니다."); }
                    }
//                    System.out.print("등록할 PASSWORD 를 입력하시오.");
//                    String registerPassWd = scanner.nextLine();
//                    passwd.put(number, registerPassWd);
                    if (!duplicate) {
                        System.out.print("등록할 PASSWORD를 입력하시오: ");
                        String registerPassWd = scanner.nextLine();
                        number++;
                        id.put(number, registerId);
                        passwd.put(number, registerPassWd);
                        register = true;
                        System.out.println("회원가입이 성공적으로 이루어졌습니다.");
                        System.out.println("현재 이용자 수는 " + number + "입니다.");
                    }
                }
            }

        }

        //if(map.get(1) == )
    }
    public void login(){}
}
