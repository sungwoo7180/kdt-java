package javamentoring.chapter13;

import java.io.File;

public class Practice13_3 {
    public static void main(String[] args) {
        File root = new File("C:\\"); // C 드라이브 루트 디렉터리를 나타내는 File 객체
        File[] files = root.listFiles(); // 루트 디렉터리의 모든 파일 및 디렉터리 목록을 가져옴

        if (files != null && files.length > 0) {
            File largestFile = null;
            long maxSize = 0; // 가장 큰 파일의 크기를 저장

            for (File file : files) {
                if (file.isFile()) { // 파일인 경우
                    long fileSize = file.length(); // 파일 크기
                    if (fileSize > maxSize) { // 현재까지 찾은 가장 큰 파일보다 크면 업데이트
                        largestFile = file;
                        maxSize = fileSize;
                    }
                }
            }
            if (largestFile != null) { // 가장 큰 파일이 있다면 정보 출력
                System.out.println("가장 큰 파일: " + largestFile.getName() + " - Size: " + maxSize + " bytes");
            }
        }
    }
}
