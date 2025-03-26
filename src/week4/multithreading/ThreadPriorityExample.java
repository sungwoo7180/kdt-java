package week4.multithreading;

//
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // 스레드 생성
        Thread highPriorityThread = new Thread(new MyRunnable());
        Thread lowPriorityThread = new Thread(new MyRunnable());

        // 높은 우선순위로 설정
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        // 낮은 우선순위로 설정
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        // 스레드 시작
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
