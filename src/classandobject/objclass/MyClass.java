package classandobject.objclass;



public class MyClass {


    // 멤버 변수 (데이터)
    private int myVariable;

    // 생성자 (Constructor)
    public MyClass(int initialValue) {
        this.myVariable = initialValue;
    }
    public int getMyVariable() {
        return myVariable;
    }
    // 메서드 (함수)
    public void myMethod() {
        // 메서드 동작 정의
        System.out.println("내 클래스의 동작을 실행합니다! ");
    }

    public static void main(String[] args) {
        // 객체 생성
        MyClass myObject = new MyClass(10);
        myObject.myMethod();
        //int value = myObject.getMyVariable();
        // 비권장 int value = myObject.myVariable;
        int value = myObject.getMyVariable();
        System.out.println(value);

//

    }
}