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