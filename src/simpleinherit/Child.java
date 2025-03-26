package simpleinherit;

public class Child extends Parent {         //extends를 통해서 상속을 정의
    @Override
    @SuppressWarnings("deprecation")
    public void hello(String target) {
        if (target==null || target.isEmpty()) {
            super.hello(target);
        } else {
            System.out.println("hello "+target+" from child!");
        }
    }
}