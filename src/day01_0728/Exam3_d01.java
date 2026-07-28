package day01_0728;

import java.util.Scanner;

public class Exam3_d01 {
    public static void main(String[] args) {
        // [1] 출력함수
        // 컴퓨터 . 출력객체 . 출력함수(print)
        // 1. System.out.println(); 출력 후 자동 줄바꿈 
        System.out.println("자동줄바꿈");
        // 2. System.out.print(); 출력만
        System.out.print("출력만");
        
        // [2] 이스케이프/제어 문자 : \ 이용한 특수기능
        // \n줄바꿈,  \t들여쓰기 \', \" 따옴표출력 , \\ \출력
        System.out.println("\n줄바꿈\t들여쓰기\'\"\\ "); 

        // 3. System.out.printf( "형식", "자료" ); 
        // %s : 문자열이 들어갈 자리 , %c : 문자가 들어갈 자리
        // %d : 정수가 들어갈 자리, %f : 실수가 들어갈 자리
            // %자릿수d : 자릿수 만큼 자리 차지, 비어있으면 공백, 오른쪽정렬   ** 문자도 자릿수 가능, 영문기준
            // %-자릿수d : 자릿수 만큼 자리 차지, 만일 비어있으면 공백, 왼쪽 정렬
            // $0자릿수d : 자릿수 빈칸 0채움 
        System.out.printf("저는 %s 이고 나이는 %d 입니다","유재석", 30);
        System.out.printf("\n 저는 %s이고 나이는 %6d 입니다\n", "유재석", 40); 
        System.out.printf("\n저는 %s이고 나이는 %-6d 입니다\n", "유재석", 40);
        System.out.printf("\n저는 %s이고 나이는 %06d 입니다\n", "유재석", 40);
            // %전체자릿수.소수자릿수f :
        System.out.printf("\n저는 %-6s이고 점수는 %5.2f 입니다\n", "유재석", 123.123456); // 전체자릿수5개 소수점2개

        // [3] 입력객체 / 함수
        // 1. Scanner : 입력관련 클래스  , 코드파일 상단에 import java.util.Scanner; 자동추가 확인 
        // 2. scanner : 카멜표기법, 관례적으로 변수명은 클래스명의 소문자 
        // 3. new : 인스턴스화, 해당 클래스로 객체 만든다
        // 4. Scanner( Sysem.in ) : 생성자(클래스명동일) 안에 시스템입력(Sytem.in)객체
        // * 클래스 수업 전까지는 해당 하는 한줄의 코드 복붙
        Scanner scanner  = new Scanner( System.in );  // 입력 객체


        // [입력함수], scanner.nextXXX() 주로 입력(받은)함수 결과는 변수에 저장한다.  ** 엔터기준으로 입력단위 구성
        // 5. 입력함수: scanner.next(); : 터미널에서 입력받은 자료(문자열) 반환
        System.out.print("문자열입력:");
        String str2 = scanner.next(); // 터미널 창에서 아무거나 입력후 엔터 기준으로 입력 마침
        System.out.printf("1)문자열 입력 값: %s \n", str2 ); // 보통 무엇을 입력할지 가이드를 만듦
        // ** 문자열타입 변수명 = 문자열반환, 과일상자==과일타입, 과자타입==과자상자

        // 6. scanner.nextInt() : 터미널에서 입력받은 자료 (정수) 반환 *정수변환이 불가능한 입력시 오류발생
        System.out.print("정수입력:");
        int i = scanner.nextInt();
        System.out.printf("2)정수 입력 %d \n", i);
        
        




    }
}
