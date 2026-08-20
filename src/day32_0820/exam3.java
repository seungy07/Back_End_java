package day32_0820;

import java.util.HashSet;
import java.util.Set;

public class exam3 {
    public static void main(String[] args) {
        
        // Set 인터페이스 : 여러개 자료들을 저장하는 컬렉션, 단 *중복제거, 인덱스(순서) 없다.
        // 1. Set 구현
        Set< String > set1 = new HashSet<>();
        // 2. Set  .add( 추가할 값 );
        set1.add("유재석");  set1.add("강호동");
        set1.add("유재석"); // List중복허용, Set 중복허용안함
        set1.add( new String("유재석") );  // 중복방지한다.
        System.out.println( set1 );  // [유재석, 강호동]
        // 3. .get(인덱스);  지원불가, 인덱스 존재x
        // set1.get(1);

        // 4.  .size( ); : 항목 개수 반환
        System.out.println( set1.size() );
        // 5. .remove(자료);  인덱스가 아닌 자료로 삭제
        set1.remove("강호동");
        // 6.  .indexOf(인덱스);  지원불가
        // 7.   .contains(찾을값);  지원 true/false
        set1.contains("유재석"); 
        // 8.  .clear()  : 항목전체 삭제
        set1.clear(); 
        // 9. .isEmpty() : 항목이 하나도 없으면 true/false
        set1.isEmpty();

        // 10. Set 컬렉션과 반복문 관계
        // 1. 일반for문, 불가능( 인덱스 없음 )
        // 2. 향상된 for문 지원
        for(String str : set1){System.out.println(str);}
        // 3. forEach문 지원  , 컬렉션객체.forEacj( (반복변수명)-> { } );
        set1.forEach( (str) -> {} );
    }
    
}
