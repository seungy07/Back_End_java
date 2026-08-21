package day32_0820;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
        // - 활용처: Set ( JDBC ResultSet )

        Iterator<String> 순회자 = set1.iterator();  // 인덱스가 아닌 자료들을 순회하는 인터페이스 반환
        while( 순회자.hasNext()){   // 인터페이스 이용한 다음 자료 확인
            System.out.println( 순회자.next() ); // 다음자료 꺼내기 지원
         }  // hashNext(): 목록(컬렉션)에서 자료 하나씩 이동 꺼내기(꺼내는 자료가 저장된 순서)  < 순서보장없음 >
        // 즉] 위 코드 이용한 향상된 for문 / forEach / ResultSet 만들어졌다

        // 11.  TreeSet 이용한 자동 정렬 : 이진트리(자료구조)
        TreeSet< Integer > set2 = new TreeSet<>();
        set2.add(50); set2.add(70); set2.add(60);
        System.out.println( set2 );  // 자동 정렬 적용, 기본값 오름차순
        // descendingSet 메소드는 Set 인터페이스내 추상메소드 없다
        System.out.println( set2.descendingSet() );  // 내림차순으로 정렬 [70, 60, 50]

         // <?>는 "어떤 타입이든 다 들어올 수 있는 와일드카드(조커) 타입"
        List<InventorySlot<?>> inventory = new ArrayList<>();
        // ? 와일드 카드 타입 사용한경우 ( String/Double 등등 다양한 제네릭 타입 사용하기 위해서)
        InventorySlot<String> slot20 = new InventorySlot();
        InventorySlot<Double> slot222 = new InventorySlot();
        // ? 와일드 카드 타입인 경우 제네릭타입 받을수 있다
        inventory.add(slot20);
        inventory.add(slot222);


    }
    
}
