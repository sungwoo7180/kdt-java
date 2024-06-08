package javamentoring.chapter13;

import java.io.FileReader;
import java.io.IOException;

public class Practice13_2 {
    public static void main(String[] args) {

        FileReader in = null;
        try {
            in = new FileReader("c:/windows/system.ini");
            char[] buf = new char[1024]; // 2KB buffer (1024 글자)
            int numChars; // 읽은 문자 수
            while ((numChars = in.read(buf)) != -1) {
                String output = new String(buf, 0, numChars); // 읽은 글자 수만큼의 문자열 생성
                output = output.toUpperCase(); // 문자열을 대문자로 변환
                System.out.print(output); // 대문자로 변환된 문자열 출력
            }
            in.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

    }
}
