package throwingexceptions;
import java.util.Scanner;

public class SimpleTryCatchSample {
    public static void main(String[] args) throws  ArithmeticException {
        // 메인 메소드는 시작점이기 때문에 구문적으로는 지원하나 아무 쓸모가 없다.
        // 메인 메소드에서 시작해서 메인 메소드에서 프로세스가 끝납니다.
        // division(10, 0);
        boolean divisionDone = false;
        int tryCount = 1;
        Scanner userInputScanner = new Scanner(System.in);
        while(!divisionDone) {
            try {
                System.out.print("10을 나눌 분모 값을 입력하시오 : ");
                int devideBy = Integer.parseInt(userInputScanner.nextLine());
                devision(10, devideBy);
                //divisionDone = true;
            } catch (ArithmeticException e){
                //throw e
                System.err.println("0으로 나눌수 없습니다.");
            } catch (NumberFormatException e) {
                System.err.println("숫자 형태로 입력값만 받을 수 있습니다.");
            } catch (Exception e){
                System.err.println("알려지지 않는 예외가 발생했습니다. 다시 시도해주세요");
            } finally {
                System.out.println("시도 횟수 : " + tryCount);
                tryCount++;
                if (tryCount > 0 ) {
                    //divisionDone = true;
                }
            }
        }
    }

    private static double devision(int a, int b) throws ArithmeticException {
        System.out.println(a/b);
        return a/b;
    }
//    double 연산에서는 0으로 나눌때도 오류가 뜨지 않는다.
//    private static double devision(double a, int b) {
//        System.out.println(a/b);
//        return a/b;
//    }
}

