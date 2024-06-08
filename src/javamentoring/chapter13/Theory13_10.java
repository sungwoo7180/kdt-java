package javamentoring.chapter13;
import java.io.*;

public class Theory13_10 {
    static void print(File f) {


        System.out.println(f.getPath() + " ------------------------------");
        if (f.isFile()) {
//            System.out.println(f.getName() + " (파일 크기: " + f.length() + ")");
        }
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (int i=0; i<files.length; i++) {
//                System.out.println(files[i].getName() + " (파일 크기: " + files[i].length() + ")");
            }
        }
    }

    public static void main(String[] args) {

        File f = new File("c:/workspace/test.txt");         // 1번정답
        if (f.exists()) System.out.println(f.length());              // 2번 정답
        f.renameTo(new File("c:/workspace/test.txt"));
        f.delete();

//        System.out.println(f.length());
        print(new File("c:/windows/system.ini"));
        print(new File("c:/temp"));
    }
}
