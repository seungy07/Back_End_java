package day33_0821;

import java.awt.*; //java내 UI 제공 

public class exam3 {
    public static void main(String[] args) {
        /*
            프로그램: 실행 가능한 코드들의 집합
            프로세스: 실행중인 프로그램
            멀티 태스킹: 두 가지 이상의 작업을 동시에 처리
                - 멀티 프로세스: 운영체제가 여러개 프로세스를 동시에 실행하는 구조 
                - 멀티 스레드: 하나의 프로세스내 여러개 흐름 작업 실행하는 구조
        */
        // [1] 단일(싱글) 스레드 : (컴파일된) 코드들을 실행 흐름 단위 1개일 때
        // -> main 메소드가 main스레드 제공. (프로그램 당 1개 이상 존재)
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for( int i=1; i<=5; i++){
            toolkit.beep();  // '띵' 소리를 발생 함수
            // 현재 스레드(코드 실행하는 흐름단위)  일시정지(밀리초) *예외필수
            try{Thread.sleep(1000);}catch( Exception e){ }
        }
        // 2) 1초에 번씩 '띵' 출력 발생?
        for(int i =1; i<=5; i++){
            System.out.println("띵");
            try{Thread.sleep(1000);}catch( Exception e){ }
        }
        


    }
    
}
