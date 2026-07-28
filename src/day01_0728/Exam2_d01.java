package day01_0728;
public class Exam2_d01 {
    // [1] m + 엔터 : main 작성
    public static void main(String[] args) { // 메인함수 시작
        // [2] 리터럴 : 상수, 미리 상수로 구성한 자료들
        // 3 , 'a' , true
        System.out.println(3); // so 엔터
        System.out.println(3.14);
        System.out.println('문'); //  '' 문자 처리 "" 문자열 처리 `` 존재 x
        System.out.println("문자열"); 
        System.out.println(true);

        // [3] 자료타입 / 자료형 : 자료(데이터) 효율적으로 분류하는 방법
        // * 효율이란? 자료크기에 따라 적당한 타입(크기) 선정하여 빈공간(여백) 줄이기
        // C/JAVA 정적(수동,직접)타입 vs Py/JS 동적(자동)타입

        // 1) boolean : true 또는 false 저장하는 타입, 1byte(1bit -> 8bit -> 1byte)
        boolean bool1 = true; // let/const --> boolean
        System.out.println( bool1 );

        // 2) char : ' ' 작은따옴표로 감싼 문자 1개, 유니코드
        char ch1 = 'A'; // 문자 하나
        System.out.println( ch1 );

        // 3) String : " "  큰따옴표로 감싼 문자 N개 저장하는 타입, N *2 byte, 객체(문자열)
        String str1 = "ABC" ;
        System.out.println(str1);

        // === 정수 =====
        // 4) byte : -128 ~ 0 ~ 127 저장하는 타입, 1byte
        byte b1 = 100; System.out.println(b1);

        // 5) short : +-30000 , 2byte 
        short sh1 = 30000; System.out.println(sh1);

        // 6) int : +-21억정도, 4byte, ****(정수) 리터럴 타입**
        int i1 = 2100000000; System.out.println(i1);

        // 7) long : +- 21억 이상, 뒤에 L을 붙여야함  ,8byte
        long l1 = 20000000000L; System.out.println(l1); // 21억 이상 넣으면 오류가 발생한다 (2백억은 int로 들어가서)




    }

}
