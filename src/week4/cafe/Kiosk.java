package week4.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Kiosk (키오스크) and CafeApp
public class Kiosk extends OrderLuncher implements IOrder {

    static Scanner scanner = new Scanner(System.in);
    private static List<Integer> selectedMenuNumbers = new ArrayList<>();   // 유저 확인용 List (중복 허용 x)

    static int count = 0;
    //    public static int menuNumber[];

    public static void main(String[] args) {
        boolean power = true;
        selectedMenuNumbers.clear();                // 이전 주문 초기화
        OrderSheet order = new OrderSheet();
        System.out.println("SW Coffee숍에 오신걸 환영합니다.");
        while(power) {


//            System.out.print("포장 방법을 선택해주세요. (매장 : 1, 포장 : 2) ");
//            int ChoosePacking = scanner.nextInt();
            boolean firstSearch = true;

            showMenu();                     // 메뉴 보여주기
            selectMenu(order);              // 메뉴 선택
            // selectQuantity();            // 수량 선택
            //selectOption(order);          //옵션 선택 (토핑 등)
//            if(ChoosePacking==1) {
//                callDeliveryAgency();     // call 배달 기사
//            }
            processCash();                  //
            doubleCheck();                  // 주문확인

            System.out.print("더 주문하시겠습니까? (1: Yes, 0: No): ");
            int continueOrder = scanner.nextInt();
            if (continueOrder == 0) {
                power = false;
            } else if (continueOrder == 1) {
                firstSearch = false;
            }
        }
    }



    public static void showMenu() {
        //int count = 0;
//        System.out.println("-------------- 음료 메뉴 --------------");
//        for (Map.Entry<Integer, Drink> entry : cafeMenuCollection.DrinkList.entrySet()) {
//            int menuNumber = entry.getKey();
//            Drink drink = entry.getValue();
//            System.out.printf("%d. %-30s - 가격: %,d원%n", menuNumber, drink.getDrinkName(), drink.getDrinkPrice());
//            //count++;
//        }
//        System.out.println("-------------- 디저트 메뉴 --------------");
//        for (Map.Entry<Integer, Dessert> entry : cafeMenuCollection.DessertList.entrySet()) {
//            int menuNumber = entry.getKey();
//            Dessert dessert = entry.getValue();
//            System.out.printf("%d. %-30s - 가격: %,dSystem.out.println("-------------- 음료 메뉴 --------------");원%n", menuNumber, dessert.getDessertName(), dessert.getDessertPrice());
//        }
        // 형 다형성 확장
        System.out.println("-------------- 음료 메뉴 --------------");
        for (Map.Entry<Integer, Food> entry : CafeMenuBoard.CaffeMenuList.entrySet()) {
            int menuNumber = entry.getKey();
            Food dessert = entry.getValue();
            if(menuNumber == 13) {
                System.out.println("-------------- 디저트 메뉴 --------------");
            }
            System.out.printf("%d. %-30s - 가격: %,d원%n", menuNumber, dessert.getFoodName(), dessert.getFoodPrice());
        }
        System.out.println("------------------------------------");
    }

    public static void selectMenu(OrderSheet order) {
        boolean selectFinish = false;

        do {
            System.out.print("메뉴를 선택하세요 (0을 누르면 주문 완료) : ");
            int selectedMenu = scanner.nextInt();
            if (selectedMenu == 0) {
                selectFinish = true;
            } else if (CafeMenuBoard.CaffeMenuList.containsKey(selectedMenu)) {
                if (!selectedMenuNumbers.contains(selectedMenu)) {          //증복인지 확인
                    selectedMenuNumbers.add(selectedMenu);
                    selectOption(selectedMenu, order);
                    selectQuantity(selectedMenu, order);
                } else {
                    System.out.println("이미 선택한 메뉴입니다. 다른 메뉴를 선택하세요.");
                }
            } else {
                System.out.println("잘못된 메뉴 번호입니다. 다시 선택하세요.");
            }
        } while(!selectFinish);
        System.out.println();
    }


    public static void selectQuantity(int productNumber, OrderSheet order) {
        System.out.println(selectedMenuNumbers);

        // productNumber를 기반으로 선택한 메뉴 가져오기
        Food selectedFood = CafeMenuBoard.CaffeMenuList.get(productNumber);

        System.out.printf("메뉴 %s의 수량을 선택하세요: ", selectedFood.getFoodName());
        int countNum = scanner.nextInt();

        order.getOrderList().put(selectedFood, countNum); // 선택한 음식을 영수증 클래스에 추가

        System.out.println("현재 주문 내역:");
        for (Map.Entry<Food, Integer> entry : order.getOrderList().entrySet()) {
            Food food = entry.getKey();
            int quantity = entry.getValue();
            System.out.printf("%s - 수량 : %d (합계 : %d원) %n", food, quantity, food.foodPrice*quantity);
        }
        System.out.println("총 금액: " + order.calculateTotal() + "원");
    }

    // Drink의 옵션 선택
    public static void selectOption(int selectedMenu, OrderSheet order) {
        // selectedMenu를 기반으로 선택한 메뉴 가져오기
        Food selectedFood = CafeMenuBoard.CaffeMenuList.get(selectedMenu);

        if (selectedFood instanceof Drink) { // Drink 클래스의 인스턴스인지 확인
            Drink selectedDrink = (Drink) selectedFood; // 형변환

            // 옵션 선택 여부 물어보기
            System.out.print(selectedDrink.getDrinkName() + "의 옵션을 선택하시겠습니까? (1: 추가, 0: 선택 안함): ");
            int selectNum = scanner.nextInt();

            if (selectNum == 1) {
                // 옵션 추가 여부 물어보기
                System.out.print("1: Hot, 2: Cold, 0: 선택 안함 - 선택하세요: ");
                int temperatureOption = scanner.nextInt();
                if (temperatureOption == 1) {
                    selectedDrink.setHot(true);
                } else if (temperatureOption == 2) {
                    selectedDrink.setHot(false);
                }
                System.out.print("설탕 추가 하시겠습니까? (1: 추가, 0: 선택 안함): ");
                int sugarOption = scanner.nextInt();
                if (sugarOption == 1) {
                    selectedDrink.addOption();
                }
                System.out.print("시럽 추가 하시겠습니까? (1: 추가, 0: 선택 안함): ");
                int syrupOption = scanner.nextInt();
                if (syrupOption == 1) {
                    selectedDrink.addOption();
                }
                System.out.println(selectedDrink.getDrinkName() + "에 옵션이 추가되었습니다.");
            }
        }
    }


    public static void callDeliveryAgency() {

    }

    private static void processCash() {
    }
    private static void doubleCheck() {

        System.out.println("주문 내역 확인: " + selectedMenuNumbers);
    }
}
