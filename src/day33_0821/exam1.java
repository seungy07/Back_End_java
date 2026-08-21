package day33_0821;

import java.util.HashMap;
import java.util.Map;

public class exam1 {
    public static void main(String[] args) {
        
        /*
            제네릭 타입 : 클래스 만들때 타입 정하지 않고 클래스 사용할때 타입 정한다.
                List<BoardDto> list = new ArrayList<>();
                - List 인터페이스 만들때 (정의)타입을 정하지 않고 List 인터페이스 사용할 때 BoardDto 타입 정함.
                - 정의/만들기 class 클래스명{}, 사용/호출: 클래스명 변수명;

            [ 컬렉션프레임워크 ]
                List 인터페이스 : 중복허용, 인덱스(순서) 보장  ArrayList, LinkedList, Vector 등
                Set 인터페이스  : 중복불가, 인덱스(순서) 없다., HashSet, TreeSet 등
                Map 인터페이스  : KEY 중복불가 / VALUE 중복허용 , 인덱스 없음, HashMap, TableMap, TreeMap 등
        */

        // [1] Map : key, value 한쌍(엔트리)으로 여러개 쌍(엔트리) 저장하는 구조 = JSON { } 
        Map< String, Integer >  map = new HashMap<>();
        // [2] 사용법(메소드)
        // 1) .put( key, value ): key/value 한쌍 엔트리 추가
        map.put("유재석", 95);  // "유재석"이라는 키로 95값 저장
        map.put("강호동", 100);
        map.put("신동엽", 78);  
        map.put("유재석", 80);  // 주의할점: 기존에 존재하면 Key 있으면 value 수정
        System.out.println( map );  // {유재석=80, 강호동=100, 신동ㅇㅂ=78}

        // 2)  .get( key ): key에 해다아는 value 반환
        System.out.println( map.get("강호동")); // 100
        // 3) .size( )
        System.out.println( map.size() ); // 3 , 총 엔트리 개수
        // 4)  .containsKey( 찾을key ) : 찾을 key 존재하면 true /false
        //      .containsValue( 찾을value ) : 찾을 value 존재하면 true /false
        System.out.println( map.containsKey("강호동") );
        System.out.println( map.containsValue(100) );
        // 5) .keySet() : 모든 key 반환, .values() : 모든 value만 반환
        System.out.println( map.keySet() );
        System.out.println( map.values() );
        // 6) .remove( key ): 해당하는 key의 엔트리(key:value) 삭제
        map.remove("강호동");  
        // 7) .entrySet() : 모든 엔트리 반환
        System.out.println( map.entrySet() );
        // 8) .clear( ) : 모든 엔트리 삭제
        // map.clear(); System.out.println(map);
        // 9) .isEmpty( ) : 엔트리가 1개도 없으면 true / false 
        System.out.println( map.isEmpty() );
        // * 활용처: 1] JSON <-- --> DTO/MAP(JAVA)  2] 자료구조(암호화) 등

        // 반복문 관계
        // (1) 일반 for문 불가, 인덱스 x
        // (2) 향상된 for문, KEY
        for( String key : map.keySet() ){ // 모든 키들을 꺼내서 반복문 이용하여 키 순회
            System.out.println( key + ":" + map.get(key) );} // 키 아용한 값 호출
        // (3) .forEach( (반복변수명) -> { } );
        map.keySet().forEach( (key)-> {System.out.println(key+ ":"+ map.get(key));} );


    }
}
