package day23_0806;

class 계산기{
    // 1. 멤버변수 (객체 내 포함o)
    // 2. 생성자 (객체 내 포함x)
    // 3. 메소드/함수(전역, 객체 내 포함x)
        // 1) 매개변수 x 반환값 o
    double getPI(){
        return 3.14;
    }
        // 2) 매개변수x 반환값x
    void powerOn(){ // 반환값이 없다 
        System.out.println("ON");
        return; //리턴값 생략
    }
        // 3) 매개변수o 반환값x
    void printSum( int x, int y){
        System.out.println(x * y); 
    }
        // 4) 매개변수o 반환값0
    int add( int x, int y){
        printSum(x, y);  // 동일한 클래스 내 다른 메소드호출
        return x+y;
    }
}

public class exam1_d23 {
    public static void main(String[] args) {
        /*
            - 함수란? 기능을 수행하는 코드집합
            - 메소드? 자바에서는 함수를 메소드라고 부름
            [ 메소드 ]
                1) 클래스 내부 선언
                2) 목적 : 재사용, 인수에 따른 서로 다른 결과물/반환
                3) 선언:
                    반환타입 메소드명( 타입 매개변수 ){ 
                        return 반환값
                    }
                    - 반환타입: 반환값의 타입/자료형 일치
                    - 메소드명: 소문자 시작하는 카멜표기법
                    - 타입 매개변수 : 함수를 호출하는 곳으로 부터 전달받는 값 타입 일치
                    - { } : 함수호출시 실행할 코드
                    - return : 함수종료시 반환되는 값
                4) 호출 : 다양한 기준
                    1. 서로 다른 클래스에서 메소드 호출
                        주체(누가 호출하냐) : this ( 특정 메소드/생성자 호출할 객체 ) - 인스턴스 필요
                        객체변수명.메소드명();
                    2. 동일한 클래스내 메소드 호출에서는 객체(인스턴스)가 필요없다.
                **) 매개변수는 지역변수 이다
                    : 특정 함수 if/for/함수 {}에서 선언된 변수는 종료시 사라진다. { } 밖에서 호출 불가
        */
       // 1)
       계산기 나만의계산기 = new 계산기();
       double pi = 나만의계산기.getPI();
       // 2)
       나만의계산기.powerOn();
       // 3)
       나만의계산기.printSum(10, 5);
       // 4)
       int result = 나만의계산기.add(20, 20);
       System.out.println(result);
       
       // ** 주의할점 : this(주체) 인스턴스 식별!
       // 1. 강호동, 유재석 탄생
       사람타입 p1 = new 사람타입("강호동");
       사람타입 p2 = new 사람타입("유재석");
       // 2. 취업성공
       p1.취업성공("개발자");
       // 3. 확인
       System.out.println(p1.job);
       System.out.println(p2.job);
       
       // ** 객체지향 ---> 인공지능(뉴런/세포)
        
    }}
class 사람타입{
    String name; int age; String job; // 사람이 가져야할 상태 설계 = 멤버변수
    
    // 사람이 태어날때 초기로 가져야할 설계 = 생성자
    사람타입(String name){  // 생성자는 초기에 들어가는 
        this.name = name; age = 1;
    }

    // 취업(행위) -> 상태가 변경
    void 취업성공(String 취업한직업){ 
        this.job = 취업한직업;
    }
}