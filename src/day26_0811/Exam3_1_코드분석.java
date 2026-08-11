package day26_0811;

public class Exam3_1_코드분석 {    // 자동차 -> 타이어 -> 한국타이어     myCar
                                            //     ㄴ> 금호타이어

    public static void main(String[] args) {
        Car myCar = new Car();  // 자동차 인스턴스 -> 객체
        myCar.tire = new Tire();  // 타이어 -> 자동 차 -> 객체
        myCar.run(); // 자동차 메소드 -> 타이어 일반 실행  
        myCar.tire = new HankookTire();  // 한국타이어 -> 타이어 -> 자동차 -> 객체
        myCar.run();  // 자동차 메소드 -> 타이어 -> 한국타이어 메소드 (오버라이딩) 실행
        myCar.tire = new KumhoTire(); // 금호타이어 -> 타이어 -> 자동차 -> 객체
        myCar.run(); // 자동차 메소드 -> 타이어 -> 금호타이어 메소드(오버라이딩)
        System.out.println( myCar.tire instanceof Tire ); // true  
        System.out.println( myCar.tire instanceof KumhoTire ); // true
        System.out.println( myCar.tire instanceof HankookTire ); // false
    } // main
} // class end
class Car{ // 자동차
 Tire tire;
 void run() { this.tire.roll(); }
}
class Tire{ // 타이어
 void roll(){
 System.out.println("[일반] 타이어가 회전");
 }
}
class HankookTire extends Tire{
 void roll(){ System.out.println("[한국] 타이어가 회전(업그레이드)"); }
}
class KumhoTire extends Tire{ 
 void roll(){ System.out.println("[금호] 타이어가 회전(업그레이드)"); }
}
    
