package classandobject.objclass;

public class Cat {

    // 생성자
    public Cat(int age, float furLength, String name) {
        this.age = age;
        this.furLength = furLength;
        this.name = name;
    }

    // Static 변수
    public static final boolean fourLegged = true;      //값을 딱 한번만 할당할 수 있음, 한번 할당된 값은 변경이 불가능
    public static final boolean mammal = true;

    // 인스턴스 메서드
    // 인스턴스 변수
    public int age;
    public float furLength;
    public String name;

    public int getAge() {
        return this.age;            //충돌이 되지 않더라도 this 쓰기를 권장
    }

    public float getFurLength() {
        return furLength;
    }

    public String getName() {
        return name;
    }

    // Static 메서드
    public static void main (String[]args){
        Cat myScottishFold = new Cat(1, 10.123f, "Scattish");
        int catAge = myScottishFold.getAge();
        float catFurLength = myScottishFold.getFurLength();
        String catName = myScottishFold.getName();
        System.out.println("고양이 나이 : " +catAge + "\n고양이 털 길이 : " + catFurLength  + "\n고양이 이름 : " +catName);
        System.out.printf("%d %f %s" ,catAge ,catFurLength ,catName);

    }
}
