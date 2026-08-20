package day28_0813;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class java_p_5번까지 {
    // [문제 5] throws로 예외 떠넘기기
        // Thread.sleep(1000); 코드를 포함하는 static void pauseOneSecond() 메소드를 만드세요.
    static void pauseOneSecond() throws InterruptedException{
        Thread.sleep(1000);
    }

    public static void main(String[] args) {
        // [문제 1] ArithmeticException 처리
        // 1. 두 정수를 나누는 코드를 작성하세요.
        // 2. try-catch 문을 사용하여, 0으로 나눌 때 발생하는 ArithmeticException을 잡으세요.
        // 3. catch 블록에서는 "0으로 나눌 수 없습니다." 라는 메시지를 출력하세요.
        try{
            int result = 10 / 0; 
        }catch(ArithmeticException e){System.out.println("0으로 나눌수 없습니다." +e);}
        

        // [문제 2] NullPointerException 처리
        // 1. try-catch 문을 사용하여, 아래 코드 실행 시 발생하는 NullPointerException을 처리하세요.
        // 2. catch 블록에서는 "객체가 초기화되지 않았습니다." 라는 메시지를 출력하세요.
        try{
            String text = null;
            System.out.println("글자 수: " + text.toUpperCase()); 
        }catch(NullPointerException e){System.out.println("객체가 초기화되지 않았습니다." +e);}

        // [문제 3] finally 블록으로 리소스 정리하기
        // 1. "데이터베이스 연결을 시작합니다."를 출력하는 코드를 try 블록에 작성하세요.
        // 2. finally 블록을 사용하여, 예외 발생 여부와 상관없이 항상 "데이터베이스 연결을 종료합니다."가 출력되도록 만드세요. 
        try{
            
        }catch(Exception e){System.out.println("데이터베이스 연결을 시작합니다"+e);
        }finally{ System.out.println("데이터베이스 연결을 종료합니다");}
        

        // [문제 4] 다중 catch 블록과 상위 예외 처리 
        // 1. try 블록 안에 예외가 발생할 수 있는 코드를 작성하세요. 
        // 2. catch 블록 3개를 사용하여 아래 순서대로 처리하세요. 
        // - NullPointerException 처리 ("NPE 발생") 
        // - ArithmeticException 처리 ("0으로 나눔 발생") 
        // - Exception 처리 ("그 외 알 수 없는 예외 발생") 
        // 3. [생각해보기] 왜 Exception catch 블록은 가장 맨 아래에 위치해야 할까요? 
        try{
            String text = null; text.length(); 
        }catch(NullPointerException e){System.out.println("NPE 발생" + e);
        }catch(ArithmeticException e){System.out.println("0으로 나눔 발생" + e);
        }catch(Exception e){System.out.println("그 외 알 수 없는 예외 발생" + e);}
        // 예외 클래스들 중 최상위 클래스가 EXception 떄문(슈퍼클래스), 다수 catch문은 예외 오류에 해당하는 문을 하나씩 실행하기떄문.
        // Exception이 맨 위에 위치하면 예외가 생길떄 마다 코드 실행이 아래로 내려가지 않고 Exception에서 멈춘다 


        // [문제 5] throws로 예외 떠넘기기
        // Thread.sleep(1000); 코드를 포함하는 static void pauseOneSecond() 메소드를 만드세요.
        // 이 메소드는 try-catch 대신 throws InterruptedException를 사용하여 예외를 떠넘기도록 선언하세요.
        // main 함수에서 pauseOneSecond() 메소드를 호출하고, try-catch를 사용하여 떠넘겨진 예외를 처리하세요.
        // 필요 코드
        // Thread.sleep(1000); // 1초간 프로그램 일시정지
        try{
            pauseOneSecond();
        }catch(Exception e){System.out.println("문제5 예외 발생"+e);}

    
    }}