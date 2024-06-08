package javamentoring.chapter7;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice7_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<Point>();
        System.out.println("쥐가 이동한 위치(x, y)를 5개 입력하라.");

        //points.add(new Point(0, 0)); // 시작 위치 추가

        for ( int i = 0 ; i < 5 ; i++ ) {
            System.out.print(">>  ");
            String locationCoordinates = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(locationCoordinates ," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x, y));
        }
        points.add(new Point(0, 0));

        double totalDistance = 0.0;

        //for (int i = 0; i < points.size(); i++) {
        for (Point point : points) {        // 향상된 for문, ArrayList<Point>에 있는 인덱스 만큼 싹다 반복문 돌리기
            totalDistance += point.getDistanceFromOrigin(); // 각 포인트의 원점으로부터 거리를 계산
        }

        System.out.printf("총 이동 거리는 %.2f입니다.\n", totalDistance);
        scanner.close();
    }

}

@Getter
@Setter
class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    // 원점(0,0)으로부터 이 포인트까지의 거리를 계산
    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
}

