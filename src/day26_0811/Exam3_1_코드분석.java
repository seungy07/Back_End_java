package day26_0811;

public class Exam3_1_코드분석 {    // 자동차 ,  타이어 -> 한국타이어     myCar
                                            //     ㄴ> 금호타이어

    public static void main(String[] args) {
        Car myCar = new Car();  // 자동차 인스턴스 -> 객체
        System.out.println( myCar );  // Car@372f7a8d
        Car yourCar = new Car();  // 동일한 클래스 서로 다른 인스턴스 생성
        System.out.println(yourCar); //Car@2f92e0f4

        myCar.tire = new Tire();  
        myCar.run(); // 자동차 메소드 -> 타이어 일반 실행
        yourCar.tire = new Tire();
        yourCar.run();
        //  myCar <-> yourCar 다른 타이어를 가짐  

        myCar.tire = new HankookTire();  // 한국타이어 -> 타이어 ->  객체
        myCar.run();  // 자동차 메소드 -> 타이어 -> 한국타이어 메소드 (오버라이딩) 실행
        myCar.tire = new KumhoTire(); // 금호타이어 -> 타이어 ->  객체
        myCar.run(); // 자동차 메소드 -> 타이어 -> 금호타이어 메소드(오버라이딩)
        System.out.println( myCar.tire instanceof Tire ); // true  
        System.out.println( myCar.tire instanceof KumhoTire ); // true
        System.out.println( myCar.tire instanceof HankookTire ); // false

        // 즉] 인스턴스 1개당 멤버변수( tire ) 각 생성  (상태) '아이디' 상태는 회원마다 제공할 필요 O
        // 즉] 인스턴스 여러개는 하나의 메소드 공유.     (행위) '로그인' 기능은 회원마다 제공할 필요 x
        // 상속의 다형성이란? 호환성.!    ->  클래스간의 중복되는 코드
        // 클래스 생성할 떄 코드가 중복되면 부모클래스 만들기
        // 일반 코드가 중복되면 함수 만들기
        // 특정 패턴이 있는 코드가 중복되면 반복문 만들기
        // 일반 코드가 흐름/분기 조건문 만들기


    } // main
} // class end

class Car{ // 클래스(설계도)는 인스턴스 만들기 위한 설계도.
 Tire tire; // 멤버변수, 초기(처음) 값이 없ㄷ
 void run() { this.tire.roll(); }
}
class Tire{ // 타이어
 void roll(){   
 System.out.println("[일반] 타이어가 회전");
 }
}
class HankookTire extends Tire{ // 오버라이딩
    @Override
 void roll(){ System.out.println("[한국] 타이어가 회전(업그레이드)"); }
}
class KumhoTire extends Tire{ 
    @Override
 void roll(){ System.out.println("[금호] 타이어가 회전(업그레이드)"); }
}
    
