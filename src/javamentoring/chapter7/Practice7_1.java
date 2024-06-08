package javamentoring.chapter7;

import java.util.Scanner;
import java.util.Vector;

public class Practice7_1 {
    public static void main(String[] args) {

        Vector<Double> v=new Vector<Double>();

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            v.add(sc.nextDouble());
        }
        double max=-1000000000;
        for(int i=0;i<4;i++) {
            //비교하는 index : (0,1) (1,2) (2,3) (3,4)
            if(v.get(i)>v.get(i+1)) {
                max=v.get(i);
            }
        }

        System.out.println("가장 큰 수는 " + max);

    }
}
