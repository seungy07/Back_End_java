package day27_0812;

public class exam2 {
    public static void main(String[] args) {
        // 1. 인터페이스: 키보드 규격(규칙) 만든다.
        // 2. 규격에 따른 구현<구현체> 만든다
        // 3. 키보드 타입 생성
        KeyBoard mKeyBoard;
        // 4. 스포츠게임 실행하면
        mKeyBoard = new SportsGame();
        // 5. a키
        mKeyBoard.aKey(); // 슛 출력
        // 6. 스포츠게임 종료하고 액션게임 실행하면
        mKeyBoard = new ActionGame(); // 업케스팅 (변수는 단 하나의 자료만 저장)
        mKeyBoard.aKey(); // 공격 출력

        // 즉] 다형석 표현: 1) 상속 extends   2) 인터페이스 implements
        
    }
}
class ActionGame implements KeyBoard{
    public void aKey(){System.out.println("공격"); }
    public int bKey(int x){System.out.println("방어"); return x;}
}
class SportsGame implements KeyBoard{
    @Override
    public void aKey() { System.out.println(" 슈ㅠㅅ");}
    @Override
    public int bKey(int x) {
        System.out.println("수비");
        return 0;}
}

interface Buy{
    // 1) 추상메소드: 구현부가 없는 메소드
    public abstract void method1();
    // 2) 디폴트메소드: 구현부가 있는 메소드
    public default void method2(){ };
    // 3) 정적메소드: static 이면 인스턴스(구현체) 없이 사용 메소드
    public static void method3(){ };
    // 4) 비공개(프라이빗)메소드: 하위타입 오버라이딩(구현) 불가능한 메소드
    private void method4(){};
 }
interface Sell{
    void method5(); // 생략시 기본 적용 public abstract
}

class Customer extends Object implements Buy, Sell{ // 여러개 인터페이스들을 구현 가능
    //  ** 추상메소드만 필수 오버라이딩
    @Override
    public void method1() {}
    @Override
    public void method5() {}
}
// ================================================
interface CustomerControl extends Buy,Sell{
    // 인터페이스는 다른 인터페이스로부터 상속 가능.
    void oreder(); // 추상
}
class Customer2 implements CustomerControl{
    // Buy, Sell 상속받은 CustomerControl 구현
    @Override
    public void oreder() {}
    @Override
    public void method1() {}  // Buy 인터페이스 추상 메소드
    @Override
    public void method5() {}  // Sell 인터페이스 추상 메소드
}
 
