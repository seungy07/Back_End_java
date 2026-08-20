package day32_0820;

public class java_p15 {
    public static void main(String[] args) {

    // [문제 1] 제네릭 Box<T> 기본 활용
    // 상황: 타입별 클래스(Box1, Box2)를 하나의 제네릭 클래스로 통합한다.

    // 요구사항(구현):
    // - Box<T> 클래스 생성 (public T content)
    // - Box<String> → "안녕하세요" 저장 후 출력
    // - Box<Integer> → 100 저장 후 출력

    // 출력 예시:
    // [문자] 안녕하세요
    // [숫자] 100

    // [문제 2] List 검색 + 삭제 (contains / indexOf / remove)
    // 상황: 명단 리스트에서 특정 이름이 존재하는지 확인하고, 위치를 찾아 삭제한 뒤 결과를 확인한다.
    // 요구사항(구현):
    // 1) List<String> list = new ArrayList<>();

    // 2) 아래 데이터를 순서대로 add 한다.
    // "유재석"  "강호동"  "서장훈"  "신동엽"  "유재석"

    // 3) "서장훈"에 대해 아래 작업 수행:
    // - contains("서장훈") 결과 출력
    // - indexOf("서장훈") 결과 출력

    // 4) remove( indexOf("서장훈") ) 를 사용하여 삭제

    // 5) 삭제 후 list 전체 출력
    // 출력 예시:
    // [contains] true
    // [index] 2
    // [삭제후] [유재석, 강호동, 신동엽, 유재석]

    // [문제 3] 추첨번호 생성: 중복 제거 Set (HashSet)
    // 상황: 1~10 사이 번호를 15번 뽑았더니 중복이 생겼다. 중복을 제거하고 최종 번호 목록을 확인해야 한다.
    // 고정 데이터: int[] draw = {1,3,3,7,9,9,2,10,10,8,4,4,6,6,5};

    // 요구사항(구현):
    // - Set<Integer> lottoSet = new HashSet<>();
    // - draw 배열을 Set에 add하여 중복 제거
    // - Set 전체 출력
    // - size() 출력
    // - contains(7) 출력
    // 출력 예시(순서는 달라도 됨):
    // [추첨결과] [1,2,3,4,5,6,7,8,9,10]
    // [개수] 10
    // [contains 7] true

    // [문제 4] 추첨번호 정렬 출력: TreeSet 활용
    // 상황: 추첨번호를 “중복 제거 + 자동 정렬”해서 보기 좋게 출력해야 한다.
    // 요구사항(구현):
    // - 문제3의 Set<Integer> lottoSet 을 그대로 사용
    // - TreeSet<Integer> treeSet에 add
    // - treeSet 전체 출력(내림차순 확인)
    // 출력 예시:
    // [정렬된 추첨번호] [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    // [문제 5] Map 점수 관리 CRUD (put/get/remove/size)
    // 상황: 학생 이름(key)과 점수(value)를 Map으로 관리한다.
    // 요구사항(구현):
    // - Map<String,Integer> map = new HashMap<>();
    // - put:
    // 유재석=95, 강호동=100, 신동엽=78, 유재석=67(키 중복 시 값 변경 확인), 서장훈=100
    // - get("유재석") 출력
    // - size() 출력
    // - remove("유재석") 후 map 전체 출력
    // 출력 예시(순서는 달라도 됨):
    // [get 유재석] 67
    // [size] 4
    // [remove 후 map] {서장훈=100, 강호동=100, 신동엽=78}

    // [문제 6] Map 검색 + 전체 출력 (containsKey/containsValue + keySet 반복)
    // 상황: Map에서 key 존재 여부를 확인하고, 전체 데이터를 출력해야 한다.
    // 요구사항(구현):
    // - 문제5 map을 그대로 사용
    // - containsKey("강호동") 결과 출력
    // - containsValue(65) 결과 출력
    // - keySet() 반복문으로 key=value 전체 출력

    // 출력 예시:
    // [containsKey 강호동] true
    // [containsValue 65] false
    // [all]
    // 서장훈=100
    // 강호동=100
    // 신동엽=78

    // [문제 7] JSON 문자열(단순) → Map 변환 + 조회/반복 출력
    // 상황: API에서 온 JSON 문자열을 파싱해서 Map으로 저장하고 사용해야 한다.
    // 입력 JSON (고정):
    // String json = "{\"name\":\"유재석\",\"age\":45,\"city\":\"서울\"}";

    // 요구사항(구현):
    // - Map<String, String> map = new HashMap<>();
    // - 파싱 규칙:
    // - { } 제거
    // - , 기준 split
    // - : 기준 split(2개로만)
    // - 큰따옴표 " 제거
    // - value도 전부 String으로 저장 (age도 "45")

    // - 저장 후
    // - map.get("name") 출력
    // - map.get("age") 출력
    // - keySet 반복문으로 key=value 전체 출력
    // 출력 예시(순서는 달라도 됨):
    // [name] 유재석
    // [age] 45
    // [all]
    // name=유재석
    // age=45
    // city=서울

    // [문제 8] ArrayList<StockDto> → ArrayList<Map<String,Object>> 구조로 구현
    // 상황: 기존에는 StockDto 클래스를 만들어 주식 데이터를 저장했지만, 이번에는 DTO 없이 Map 구조로 데이터를 관리한다.
    // 기존 DTO 개념 (참고):
    // class StockDto {
    //     String name;
    //     int price;
    //     int volume;
    // }

    // 변경 목표: ArrayList<Map<String,Object>> 구조로 동일 데이터 표현

    // 요구사항(구현):
    // 1) ArrayList<Map<String,Object>> stockList 생성
    // 2) 아래 3개의 주식 데이터를 Map으로 생성 후 stockList에 add
    // (1)
    // name = "삼성전자"
    // price = 72000
    // volume = 1500000

    // (2)
    // name = "카카오"
    // price = 52000
    // volume = 800000

    // (3)
    // name = "네이버"
    // price = 210000
    // volume = 300000
    
    // 3) 전체 리스트 출력
    // 4) 반복문을 사용하여 아래 형식으로 출력:
    // 종목명: 삼성전자 / 가격: 72000 / 거래량: 1500000
    // 종목명: 카카오 / 가격: 52000 / 거래량: 800000
    // 종목명: 네이버 / 가격: 210000 / 거래량: 300000
    // 출력 예시:
    // [stockList] [{...},{...},{...}]
    // 종목명: 삼성전자 / 가격: 72000 / 거래량: 1500000
    // 종목명: 카카오 / 가격: 52000 / 거래량: 800000
    // 종목명: 네이버 / 가격: 210000 / 거래량: 300000




    }
    
}
