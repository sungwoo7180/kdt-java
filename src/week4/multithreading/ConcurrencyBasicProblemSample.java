package week4.multithreading;

public class ConcurrencyBasicProblemSample {
    private int passCount = 0;

    public static void main(String[] args) {
        ConcurrencyBasicProblemSample example = new ConcurrencyBasicProblemSample();
        // 20개의 스레드를 생성해 실행
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(() -> example.process());    //시간의 국면에서 순차적으로 하지만 스레드의 상태가 달름
            thread.start();
        }
    }
    // 각 스레드는 heap 영역에 공유된 passCount 값을 참조
//    private void process() {
//        if (passCount < 10) {
//            // 아래 1ms 만에 모든 스레드가 다 진입 성공함
//            try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); } //돌릴때마다 다름
//            // 안전하지 않은 방법으로 (lock 없이) 카운트 처리 수행
//            System.out.println("passCount: " + (++passCount));
//        } else System.out.println("blocked by passCount condition");
//    }

    // 메서드에 synchronized 키워드를 사용해 스레드 동기화
    private synchronized void process() {
        if (passCount < 10) {
            try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("passCount: " + (++passCount));
        } else {
            System.err.println("blocked by passCount condition");
        }
    }
}
