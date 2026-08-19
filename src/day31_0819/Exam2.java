package day31_0819;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 래퍼 클래스: 기본타입 --> 참조타입 표현, 참조타입은 상태/기능 갖는다.
        int value1 = 100;  // System.out.println( value1.toString() ); 오류
        Integer value2 = 100;  System.out.println( value2.toString() );
        // 즉] 기본타입은 기능이 없으니 참조타입으로 반환해서 기능 사용.

        // 1. 언박싱, 오토박싱
        int value3 = value2;  // Integer(참조) --> int(기본) 변환 <언박싱>
        Integer value4 =  value1; // int(기본) --> Integer(참조) 변환 <오토박싱>
        
        // 2. 자바에서 외부자료들을 주고받을 때,  타입변환( css, excel, api, python, json 등등 )
        // XXXX.parseXXX( 문자열 ) ,  유사(JDBC): rs.getXXX( )
        int value5 = Integer.parseInt("100"); // "100" --> 100 , 스프링자동
        double value6 = Double.parseDouble("3.14");  // "3.14" --> 3.14
        boolean value7 = Boolean.parseBoolean("true"); // "true" -> true 
        // 기본타입 --> 문자열 변환, String.valueOf( 리터럴 )
        String s1 = 100+"";  //  공백없이 문자열 더하기, 100 -> "100"
        String s2 = String.valueOf(100); // 100 -> "100"
        
        // [2] 날짜/시간 클래스
        // 1. 현재 날짜 가져오기
        LocalDate localDate = LocalDate.now(); 
        System.out.println(localDate); // 2026-08-19 현재날짜 가져옴
        // 2. 현재 시간 가져오기
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 11:07:36.351242300
        // 3. 현재 날짜/시간 가져오기
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // 2026-08-19T11:08:34.256609500
        // 4. 정해진 날짜/시간 객체 생성    LocalDateTime.of(연도,월,일,시,분,초 ): 오버로딩(매개변수 개수에 따른 메소드 여러개)
        LocalDateTime localDateTime2 = LocalDateTime.of(2026,8,19,11,11,30);
        // 5. 정해진 형식으로 날짜/시간 표현,    DateTimeFormatter.ofPattern( 패턴 );
        // 패턴: y연도  M월 d일 h시 m분 s초,  날짜/시간객체.format( 패턴객체 )
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y년 MM월 d일 hh시 m분 s초" );  // 자릿수는 2개싞  hh 
        System.out.println( localDateTime2.format(formatter) );
        // 6. 날짜 계산, 날짜/시간객체.plusXXX( 수 ), 날짜/시간객체.minusXXX( 수 )  
        LocalDateTime rTime = localDateTime2.plusDays(20);
        System.out.println(rTime);
        LocalDateTime rTime2 = localDateTime2.minusDays(20); 
        System.out.println(rTime2); 
        // 7. 특정한 날짜/시간 반환,  .getXXX( ) 
        System.out.println( localDateTime2.getYear() );
        System.out.println( localDateTime2.getMonth() ); // AUGUST 
        System.out.println( localDateTime2.getMonthValue() );  // 8
        System.out.println( localDateTime2.getDayOfMonth() );    // 19(일) 
        System.out.println( localDateTime2.getSecond() ); // 30(초)


    }
    
}
