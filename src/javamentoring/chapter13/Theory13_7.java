package javamentoring.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Theory13_7 {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        FileInputStream fin = null;
        try{
            fout = new FileOutputStream("c:\\Temp\\mft0_fb");
            fin = new FileInputStream("C:\\Temp\\test.txt");
            byte[] buf = new byte[128]; // 버퍼 할당
            while(true) {
                int n = fin.read(buf);          // 버퍼 크기만큼 읽기
//                fout.write(buf, 0 ,n);      // 읽은 만큼만 버퍼에서 쓴다.
                if (n != -1) fout.write(buf, 0, n); // 읽은 버퍼만큼 쓴다.
                if(n<buf.length)                // 파일 끝에 도달
                    break;
            }

        } catch (IOException e) {
            e.printStackTrace(); // 예외 처리에서 에러 출력
        }
    }
}
