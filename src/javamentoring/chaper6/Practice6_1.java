package javamentoring.chaper6;

public class Practice6_1 {
    public static void main(String[] args) {
        MyPoint a = new MyPoint(3,20);
        System.out.println(a);
    }
}

class MyPoint {
    private int x,y;

    public MyPoint(int x, int y) {
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        // 클래스 전체 이름에서 마지막 '.' 다음의 문자열을 추출
//        String className = getClass().getName();
//        int lastDotIndex = className.lastIndexOf('.');
//        if (lastDotIndex != -1) {
//            className = className.substring(lastDotIndex + 1);
//        }
//        return className + "(" + this.x + "," + this.y + ")";
        return getClass().getName() + "(" + this.x + "," + this.y + ")"; //getClass() -> Object클래스명 / getName() -> Class명 리턴
    }
}
