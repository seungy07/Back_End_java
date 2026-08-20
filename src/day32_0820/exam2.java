package day32_0820;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exam2 {
    public static void main(String[] args) {
        
        // 제네릭: 클래스내 타입들을 인스턴스 생성시 정한다.
        /*
            컬렉션(수집)프레임(틀)워크(일)
                - 정의: 데이터 수집(목록)하는 자료 구조(방법) 미리 만들어둔 인터페이스/클래스들
                - 목적 : 복잡한 자료들을 편리하게 제공받아 사용
                - 종류
                    List 인터페이스: 구현체: ArrayList, Vector, LinkdeList, Stack 등
                    Set 인터페이스:  구현체: HashSet, TreeSet 등
                    Map 인터페이스:  구현체: HashMap, HashTable, TreeMap 등
                * 인터페이스란? 서로 다른 클래스들을 하나의 타입으로 조작
                * 구현체란? 인터페이스내 추상메소드 구현한 클래스들을 
                * 다형성? (캐스팅) 하나의 자료가 서로 다른 타입으로 변환
        */
        // [1] List 인터페이스
        ArrayList<String> list1 = new ArrayList<>();
        // list1 = new LinkedList(); // 불가능  , 형제끼리 타입 변환 불가능

        List<String> list2 = new ArrayList<>();
        list2 = new LinkedList<>(); // 다형성, 부모와 자식관계로 가능

        // [2] List 인터페이스 타입으로 구현체 메소드 사용가능 < day09 exam1 >, 구현체들이 오버라이딩하여 가능
        list2.add(null);  // 가능
        System.out.println( list2.get(0) ); // 가능
        list2.add("강호동");

        // [3] 리스트/배열과 반복문 관계 // 리스트(목록)내 항목(값)들을 한번에 꺼내기 없다, 하나씩(순회/반복) 꺼내기
        // 1. 일반 for문, 인덱스 필요시
        for(int i=0; i<=list2.size()-1; i++){
            // i가 0분터 마지막인덱스까지 인덱스 1씩 증가
            String str = list2.get(i); // 하나씩 순회하면서 꺼냄
        }
        // 2. 향상된 for 문
        for( String str : list2 ){ }
        // 3. forEach문, 반복메소드, 리스트객체.forEach( (반복변수) -> { } );
        list2.forEach( (str) -> {} );




    }
    
}
