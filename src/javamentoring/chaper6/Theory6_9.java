package javamentoring.chaper6;

public class Theory6_9 {
    public static void main(String[] args) {

        String a = new String("     hello      ");
        System.out.println("a의 값은? " + a + "\n");

        String b= a;
        System.out.println("a의 값은? " + a);
        System.out.println("b의 값은? " + b + "\n");

        String c = a.trim();
        System.out.println("a의 값은? " + a);
        System.out.println("b의 값은? " + b);
        System.out.println("c의 값은? " + c + "\n");

        a = a.toUpperCase();
        System.out.println("a의 값은? " + a);
        System.out.println("b의 값은? " + b);
        System.out.println("c의 값은? " + c + "\n");


//        System.out.println("-------------------------");
//        System.out.println("리티럴 스트링의 경우");
//        System.out.println("-------------------------");
//
//        String A = new String("    hello   ");
//        System.out.println("A의 값은? " + A + "\n");
//        String B= new String(A);
//
//        System.out.println("a의 값은? " + A);
//        System.out.println("b의 값은? " + B + "\n");
//
//        String C = new String(A).trim();
//        System.out.println("a의 값은? " + A);
//        System.out.println("b의 값은? " + B);
//        System.out.println("c의 값은? " + C + "\n");
//
//        A = new String(A).toUpperCase();
//        System.out.println("a의 값은? " + A);
//        System.out.println("b의 값은? " + B);
//        System.out.println("c의 값은? " + C + "\n");
    }
}
