package day28_0813;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam1_d28 {
    public static void main(String[] args) {
        /*
            [예외]란? 에러발생 시 고치는게 아니라 흐름 제어 vs if  
            예외처리: try{ 예외발생코드 }catch( )
        */
        // [1] 일반예외 : 실행(컴파일)하기 전 예외가 발생할 수 있는 코드에 대해 미리 예외처리
        // 1. ClassNotFoundException : 클래스 찾을 수 없다
        try{
            Class.forName("java.lang.String" ); // Class.forName( "찾을 클래스" ) 동적으로 존재하는 클래스 로드(읽어오기)
        }catch( ClassNotFoundException e ){ // 패키기지명.클래스명을 쓰면 예외가 발생하지 않음. 클래스명만 썻을떄 예외
            System.out.println("존재하지 않는 클래스 입니다" + e);
        } // ** e : 변수이면서 예외정보 담는 객체
        
        // 2. InterruptedException : 스레드에 문제가 발생하면
        try{ 
        Thread.sleep(1000); // Thread.sleep(밀리초); 밀리초만큼 일시정지 , [쓰레드]란? 컴파일(번역)된 코드들을 읽어드리는 흐름
        }catch( InterruptedException e ){ // 예외 발생시 처리되는 코드, e : 변수이면서 예외정보 담는 객체
            System.out.println("인터럽트 문제 발생 " + e);
        }

        // [2] 실행예외: 실행( 컴파일 ) 후 예외 발생  **경험중요*  예측 or 유지보수 ( 로그 )
        // 3. NullPointerException: 참조가 없는데 참조하는 경우
        try{
            String str1 = null ;  // null 이란? 참조값이 없다 즉] 객체(인스턴스)가 없다.
            System.out.println( str1 );  // 코드 한줄에 로그 한줄로  오류 확인
            System.out.println( str1.length() );  // .(도트/접근)연산자는 참조할 대상의 멤버들 접근
        }catch(NullPointerException 변수){ // ㄴ 빨간줄은 안뜨는데 실행시 오류가 뜸
            System.out.println( 변수);}

        // 4. NumberFormatException: 정수타입으로 변환이 불가능한 경우
        try{
            String str2 = "100";  Integer.parseInt(str2); // Integer.parseInt( 문자 ); 문자 -> 정수 변환 함수
            String str3 = "100a"; Integer.parseInt(str3); // "100" -> 100 [가능], "100a" --> 100a [불가능]
        }catch( NumberFormatException e ){ System.out.println( e );} 
        
        // 5. ArrayIndexOutOfBoundsException: 배열내 인덱스 범위가 넘어갔다.
        try{
            int[ ] 배열 = {10,25};  // 2개 저장하는 배열
            System.out.println( 배열[0]); // 
            System.out.println(배열[5]);  // 없는 인덱스 호출/사용, 업데이트(개발)
        }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}

        // *여러 타입들의 예외들을 하나의 타입으로 Exception (상위)클래스 사용한다.  ArrayIndexOutOfBoundsException e -> Exception e

        // [3] 다중 catch : try에서 다양한 예외들을 다양하게 흐름 제어, catch 1번 또는 0 번 (먼저 발생한 것 부터 예외처리)
        // 6.  InputMismatchException : 정수가 아닌 문자로 입력 ( 입력 타입 예외 발생 )
        try{ 
            Scanner scanner = new Scanner(System.in);
            System.out.print("정수 입력: ");
            int ch = scanner.nextInt();  // 입력받은 자료들을 INT타입 반환 함수
            Integer.parseInt("ABC");
        }catch( InputMismatchException e ){System.out.println("정수만 입력" + e);} // 예외코드시 예외처리 코드 // 프로그램 종료가 안됨
        catch( NumberFormatException e){System.out.println("타입변환 오류" + e);}
        catch( Exception e ){ // 다중 catch에서 마지막에 Exception 사용하여 그외 처리한다
            System.out.println("마지막 예외");  // Exception  가장 최하위에 !!
        // [4] finally: 예외가 발생 여부 상관없이 무조건 실행되는 구역, 외부 프로그램과 연동을 종료하는 코드로 사용
        }finally{ System.out.println(" 무조건실행한다"); }

        




    }
    
}
