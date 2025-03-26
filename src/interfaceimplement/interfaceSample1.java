package interfaceimplement;

public interface interfaceSample1 {
    abstract void absMethod();
    abstract void absMethod(int a);
    abstract void absMethod(int a, int b);

    default void absMethodInInterface2(int a, int b, int c) {
        System.out.println("이것은 interface 입니다.");
    }
}
