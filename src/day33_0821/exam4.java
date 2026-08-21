package day33_0821;

import java.time.LocalTime;

public class exam4 {
    public static void main(String[] args) {
        
        // [1] 시계 구현
        // 1. 새로운 작업(시계) 스레드 실행
        시계스레드 runable1 = new 시계스레드(); // 구현체 생성
        Thread thread1 = new Thread( runable1 ); // 스레드 객체 구현체 대임
        thread1.start();                    // 스레드객체 시작
    }
    
}
class 시계스레드 implements Runnable{ // Runable 인터페이스 구현하면 멀티스레드 정의!
    @Override
    public void run() { // 멀티스레드가 처리할 작업
        while (true) {
            System.out.println( LocalTime.now() );  // 현재시간
            try{ Thread.sleep(998); }catch(Exception e){ } // 1초 일시정지
        }
    }

}