package day31_0819;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.Arrays;

public class Exam3 {
    public static void main(String[] args) {
        
        // String 클래스 
        // 1. 문자열은 배열.
        char str1 = '유';  // char 타입(' ')은1글자만 가능
        char[ ] str2 = { '유', '재', '석' };  // char 타입의 배열
        String str3 = "유재석"; // String 클래스는 배열의 멤버변수 가짐
        // 2. 문자 변환,     아스키코드(일부특수문자 + 영문) + 유니코드(여러개언어지원)
        char str4 = 65; System.out.println(str4); // A 
        char[ ] str5 = {74, 65, 86, 65 }; System.out.println(str5); // JAVA 
        char str6 = '유'; System.out.println((int)str6);
        // 정수-char(규칙) -> 문자 ->배열-> 문자열
        // 3. 문자열 비교, 문자열A.equals(문자열B)
        System.out.println( new String("유재석") == "유재석" ); // false
        System.out.println( new String("유재석").equals("유재석" ) ); 
        // 4.  문자열A.concat(문자열B), 문자열 연결, 연결된 새로운 문자열 반환( 주소값 생성 )
        String str7 = "자바";  String str8 = "프로그래밍";
        System.out.println( str7.concat(str8) ); // 자바프로그래밍
        System.out.println( str7 + str8 );
        // 5. StringBuilder ,  append( ),  문자열(리터럴)는 불변(수정x),  빌더주소값 1개 지정하여 새로운 문자열 연결( 주소값 생성 x )
        StringBuilder builder = new StringBuilder();
        builder.append( str7 ); builder.append( str8 );
        System.out.println(builder);  // 자바프로그래밍
        // 6. .chatAt(인덱스)
        String str9 = "자바프로그래밍";
        System.out.println( str9.charAt(3) ); // 로
        // 7. .length() : 문자열 내 문자 개수 반환
        System.out.println( str9.length() );
        // 8. .replace( 기존문자, 새로운문자 ) : 만일 기존문자가 존재하면 새로운문자로 치환하여 반환
        System.out.println( str9.replace("자바", "JAVA") );  // JAVA프로그래밍
        // 9.  .substring( 시작인덱스, 끝인덱스 ) :  시작인덱스 ~ 끝인덱스 전까지 분자열 추출
        String str10 = "012544-3255155";
        System.out.println( str10.substring( 6) );  // -3255155
        System.out.println( str10.substring( 0,6)); // 012544, 0 부터 6 전까지
        // 10. .split( 기준문자 ), 기준문자 기준으로 문자열 분해하여 배열로 반환
        System.out.println( str10.split("-") ); // [Ljava.lang.String;@3f99bd52
        String[ ] strAry = str10.split("-");  // [0] 012544  , [1] 3255155
        System.out.println( strAry[0] );  // 012544
        System.out.println( strAry[1] );  // 3255155
        // 11. .indexOf( 찾을문자 ), 만일 찾을문자가 존재하면 인덱스, 없으면 -1
        //      .contains( 찾을문자 ), 만일 찾을 문자가 존재하면 true, 없으면 false
        System.out.println( "자바 프로그래밍 언어".indexOf("프로") ); // 3
        System.out.println( "자바 프로그래밍 언어".contains("프로") ); // true
        // 12.  .getBytes() : 문자열내 문자들을 바이트 배열 반환  *파일처리/네트워크* 외부 통신에서 사용
        byte[ ] strAry2 = "ABC".getBytes();  
        System.out.println( Arrays.toString(strAry2));  // "ABC" -> [65, 66, 67] 
        System.out.println( new String(strAry2) );  // [65, 66, 67]  -> "ABC"

        



    }
    
}
