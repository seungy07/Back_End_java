package day34_0824;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Exam2 {
    public static void main(String[] args) {
        /*
            스레드 풀: 매번 새로운 스레드 생성하지 않고 미리 일정한 스레드를 풀(pool)에서 생성
            목적: 과부하 방지 
            구조: 선입선출(Queue) 방식으로 먼저 요청이 들어온 순서대로 *대기중인* 스레드가 처리함
                *) 만일 대기중인 스레드가 없으면 요청은 wait(대기상태)이면 스레드가 작업이 끝나고 대기중인 요청 처리

            활용처: 웹서버(톰캣), JDBC, 안전한 서버(돈) 구축 등등
        */
       // [1]  스레드풀 구축( 미리 스레드 수 생성 ), 
       // ThreadPoolExecutor
       ThreadPoolExecutor poolExecutor =  (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
       // [2] 임의의 요청 스레드 생성(구현체), 인터페이스명 변수명 = new 인터페이스명( ){ };
       Runnable runnable = new Runnable() {
            @Override
            public void run() { // 임의의 요청을 20번 생성(CallTask)
                for( int i=1; i<=20 ; i++){
                    try{ Thread.sleep(3000);} // 3초에 한번씩 총 20번 요청
                    catch(Exception e) { }
                    // [3] 스레드풀에 해당 구현체 배정
                    CallTask task = new CallTask(i); // i 번째 요청 스레드 생성
                    poolExecutor.submit(task);   // 요청스레드를 스레드풀에 배정

                    // [6] 현재 스레드 상태
                    int 작업중인스레드수 = poolExecutor.getActiveCount();
                    int 대기중인스레드수 = poolExecutor.getCorePoolSize() - 작업중인스레드수; // 전체스레드수 - 작업중인스레드수
                    int 대기중인요청수 = poolExecutor.getQueue().size();
                    System.out.println("작업중인스레드수: " +작업중인스레드수);
                    System.out.println("대기중인스레드수: " +대기중인스레드수);
                    System.out.println("대기중인요청수: " +대기중인요청수);
                }   
                // [4] 20개 배정후 스레드풀 종료 예약( 모든 작업이 끝나면 )
                poolExecutor.shutdown(); 
            }
        };
        // [5] 구현체 start
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
// [2] 작업(요청) 스레드
class CallTask implements Runnable{
    private Random random = new Random();
    private int id; // 스레드 식별용
    public CallTask(int id){ this.id = id;}
    @Override
    public void run() { // 멀티스레드
        String threadName = Thread.currentThread().getName(); // 현재 작업스레드명 호출(식별용)
        System.out.println( threadName + "상담원 고객동화 시작됨: "+id);
        try{ Thread.sleep( 6000+ random.nextInt(6000));}catch(Exception e){ } // 6 ~ 12초 (상담 시간)
        System.out.println( threadName+"상담원이 고객동화 종료.");
    }
}



