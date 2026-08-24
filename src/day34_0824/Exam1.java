package day34_0824;

public class Exam1 {
    public static void main(String[] args) {
        /*
            스레드: 코드 실행 흐름 단위,
            멀티스레드: 여러 사용자들이 하나의 웹서버(톰캣)에 요청함으로 웹서버는 멀티스레드로 관리
            예] 카카오톡 사용자 약4,800만 명 --> 멀티스레드로 관리(서버)
            장점: 여러 요청들을 다중처리 , 단점: 관리(동기화/과부하)
            1. 동기화 vs 비동기화
                동기화 : Lock(대기)상태 이용하여 단하나의 스레드가 메소드 점유
                    - 무결성 보장,  순서대로 처리해야 되는 경우~
                비동기화 : 여러 스레드가 하나의 메소드 같이 점유
                    - 무결성 보장없음, 순서가 없는 경우! (요청 후 다른 작업 필요한 경우)
        */

        // 1. 계산기 1개 만들기
        계산기 calculator = new 계산기();
        // 2. 작업스레드1
        스레드1 thread1 = new 스레드1();
        thread1.calculator = calculator;
        // 3. 작업스레드2
        스레드2 thread2 = new 스레드2();
        thread2.calculator = calculator;
        // * 서로 다른 스레드가 동일한 객체 참조중
        // 스레드실행
        thread1.start(); thread2.start(); // 200  200 출력


        
    }
}
class 스레드1 extends Thread{
    public 계산기 calculator;
    @Override
    public void run() {
        calculator.setMemory(100); // 계산기 메소드에 100 대입
    }
}

class 스레드2 extends Thread{
    public 계산기 calculator;
    @Override
    public void run() {
        calculator.setMemory(200); // 계산기 메소드에 200 대입
    }
}

class 계산기{ // 클래스란? 인스턴스 설계도(종이/ 실체x)
    // 멤버변수란? 인스턴의 상태/변수/값저장소/필드/속성/key, 인스턴스마다 각각
    public int memory;

    // 메소드란? 인스턴스의 행위/이벤트, 여러 인스턴스 공유/같이
    // [1] 비동기화(기본값)     : 200 200 출력 ( 100 들어오고 출력되기 전 200들어오고 출력)
    // public void setMemory(int memory){

    // [2] 동기화 (synchronized) : 100 200 출력
    public synchronized void setMemory(int memory){
        this.memory = memory; // this란? (주체)현재 메소드를 호출한 인스턴스를 가리킴, 매개변수명 구분용
        // super란? 부모의 메소드/멤버변수 

        try{ Thread.sleep(2000);}catch(Exception e){ } // 2~3초 대기상태 

        System.out.println("현재 계산기의 값: " + this.memory );
    }
}