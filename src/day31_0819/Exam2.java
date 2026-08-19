package day31_0819;

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
        

    }
    
}
