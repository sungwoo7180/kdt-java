    package week3.poketmon;

    import java.io.*;
    import java.util.HashMap;
    import java.util.Scanner;
    import java.util.Scanner;

    public class LoginHashMap {
        private HashMap<Integer, String> id;
        private HashMap<Integer, String> passwd;
        private int number;
        private final String FILE_PATH = "login_info.txt"; // 파일 경로

        Scanner scanner = new Scanner(System.in);

        public LoginHashMap() {
            this.id = new HashMap<>();
            this.passwd = new HashMap<>();
            this.number = 1;
            loadFromFile(); // 기존에 저장된 데이터를 읽어옴
            // 여기에서 파일로부터 데이터를 읽어올 수 있음
        }

        public void saveToFile() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
                for (int i = 1; i <= number; i++) {
                    String username = id.get(i);
                    String password = passwd.get(i);
                    // 파일에 저장된 ID와 중복 체크
                    if (containsDuplicateInFile(username)) {
                        System.out.println("중복된 ID가 발견되었습니다. ID: " + username + " 는 파일에 저장되지 않습니다.");
                        continue;
                    }
                    writer.write(i + "," + id.get(i) + "," + passwd.get(i) + "\n");
                }
                System.out.println("로그인 정보를 파일에 성공적으로 저장했습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void loadFromFile() {
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    int userId = Integer.parseInt(parts[0]);
                    String username = parts[1];
                    String password = parts[2];

                    id.put(userId, username);
                    passwd.put(userId, password);
                    number = Math.max(number, userId); // 가장 큰 userId 값을 찾아 업데이트
                }
                System.out.println("로그인 정보를 파일에서 성공적으로 불러왔습니다.");
            } catch (IOException e) {
                System.out.println("로그인 정보 파일이 없습니다. 새로운 파일을 생성합니다.");
            }
        }

        public void startPokemon() {
            boolean loginpass = false;
            while(!loginpass) {
                System.out.print("메뉴 1. 로그인 2. 회원가입 : ");
                String choice = scanner.nextLine();
                if (choice.equals("1")) {
                    login();
                    loginpass = true;
                } else if(choice.equals("2")) {
                    register();
                    saveToFile();
                }
            }
        }
        public void login() {
            boolean correctLogin = false;
            while(!correctLogin) {
                System.out.print("ID를 입력해주세요 : ");
                String putId = scanner.nextLine().trim();
    //                  if(!id.get(1).equals(putId)) {
    //                        System.out.println("존재 하지 않는 아이디입니다.");
    //                        continue;}
                if (!id.containsValue(putId)) {             //containsValue 메서드를 사용하여 입력된 ID가 id 해시맵에 존재하는지 확인합니다
                    System.out.println("아이디가 존재하지 않습니다.");
                    continue;
                } else if (putId.equals("BACK")) {
                    break;
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
                    String storedPasswd = passwd.get(i);
                    if (storedPasswd  != null && id.get(i).equals(putId) && storedPasswd.equals(putPasswd)) {
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

        public void register() {
            boolean register = false;
            boolean duplicate = false;
            while (!register) {
                System.out.print("등록할 ID를 입력하시오: ");
                String registerId = scanner.nextLine().trim();

                // 파일에 저장된 ID와 중복 체크 & 메모리에 저장된 ID와 중복 체크
                if (containsDuplicateInFile(registerId) || id.containsValue(registerId)) {
                    System.out.println("중복된 ID가 발견되었습니다. 다른 ID를 입력해주세요.");
                    continue;
                }

                System.out.print("등록할 PASSWORD를 입력하시오: ");
                String registerPassWd = scanner.nextLine();
                id.put(number, registerId);
                passwd.put(number, registerPassWd);
                register = true;
                System.out.println("회원가입이 성공적으로 이루어졌습니다.");
                System.out.println("현재 이용자 수는 " + number + "입니다.");
                number++;
            }
        }
        private boolean containsDuplicateInFile(String username) {
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");

                    if (parts.length < 2) {     // 예외 처리: 배열의 길이가 2보다 작으면 유효한 데이터가 아니므로 건너뜁니다.
                        continue;
                    }
                    String storedUsername = parts[1];
                    if (storedUsername.equals(username)) {
                        return true;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
    }
