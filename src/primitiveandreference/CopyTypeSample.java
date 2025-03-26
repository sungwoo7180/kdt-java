package primitiveandreference;

public class CopyTypeSample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b =  a;           //얕은 복사 주소값만을 복사하고 heap영역에 같은 객체를 참조함
        int[] c =  a.clone();   //깊은 복사는 heap에 객체를 통채로 복사하고 새로 생긴 객체를 참조함

        a[4] = 99;      // { 1, 2, 3, 4, 99 }
        System.out.println(a[4]);
        System.out.println(b[4]);
        System.out.println(c[4]);

    }
}

