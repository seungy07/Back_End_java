package day27_0812;

public class exam3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        // 1.
        // myCar.run();  // 오류 발생
        // 2.
        // myCar.tire = new Tire(); // [오류] 인터페이스로 객체생성불가능
        // 3.
        myCar.tire = new HackokTire();
        myCar.run();  // 한국 타이어 회전
        // 4.
        myCar.tire = new KumhoTire();
        myCar.run();

        System.out.println( myCar.tire instanceof Tire);
        System.out.println( myCar.tire instanceof KumhoTire);
        System.out.println( myCar.tire instanceof HackokTire); // false , 변수에  한국타이어를 밀어내고 금호타이어 저장
        
        // [*] 일회성 사용하는 인터페이스 구현체  = 익명(클래스 없이) 구현체
        // 자체적으로 추상메소드 오버라이딩
        // new 인터페이스명(){ 오버라이딩 }
        myCar.tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("일반 타이어가 굴러갑" );
            }};
            myCar.run();   //  한번만 사용하는 경우에만 !
        
    }
}

class Car{
    Tire tire;
    void run(){ this.tire.roll(); }
}
interface Tire{
    void roll(); // { } 없는 추상메소드
}
// 구현체
class HackokTire implements Tire{
    // 추상메소드의 { } 구현(재정의)
    @Override
    public void roll() {
        System.out.println(" 한국 타이어 회전");    
    }
}
class KumhoTire implements Tire{
    @Override
    public void roll() {
        System.out.println("금호 타이어 회전");
    }
}

