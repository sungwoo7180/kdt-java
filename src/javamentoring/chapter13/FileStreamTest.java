package javamentoring.chapter13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 파일 쓰기
        try (FileWriter out = new FileWriter("c:/workspace/test.txt")) {
            String textWord = scanner.nextLine();
            char[] cbuf = (new String(textWord)).toCharArray();
            out.write(cbuf);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // 파일 읽기
        try (FileReader in = new FileReader("c:/workspace/test.txt")) {
            char[] buf = new char[1024];
            int numChars;
            while ((numChars = in.read(buf)) != -1) {
                System.out.print(new String(buf, 0, numChars));  // 읽은 문자 수만큼만 출력
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
