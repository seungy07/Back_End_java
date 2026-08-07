package day24_0807;

public class exam3_d25 {
    int a;
    void b(){};
    public static void main(String[] args) {
        // main 함수에 static 포함 이유: 프로그램 실행시 main함수에 메모리 할당 해야 실행 ( 우선 할당 )
        // [* 주의할점]
        // System.out.println(a);
        // b();
        // static 가 아닌 얘들은 인스턴스를 할당하여 접근
        // static 가 할당이 되면 접근 가능
        exam3_d25 exam = new exam3_d25();
        System.out.println(exam.a);
        exam.b();

        D 변수=new D();
        // [1] final
        // 변수.고정변수=100; // 오류  final 
        
        // [2] static : 클래스명.(공유/클래스마다) 정적변수
        D.정적변수 = 20; 
        // vs 멤버변수: 객체명.(인스턴스마다) 멤버변수
        변수.멤버변수 = 29;
        D 변수2 = new D();
        변수2.멤버변수 = 39;  
        D.정적변수 = 39;

        // [3] 상수 : 클래스명.상수명
        System.out.println(D.상수);
    }
    
}
class D{
    // - final 키워드; : 초기값(필수) 이후 수정 불가능 * 초기값 필수
    public final int 고정변수 = 10; 
    
    // - static 키워드 : (정적) 인스턴스 없이 우선(프로그램 실행시) 할당 변수
    public static int 정적변수 = 100;  // 클래스/정적 변수
    public int 멤버변수 = 10;
    // * 무분별한 사용은 메모리 효율성 떨어진다.
    // *static 프로그램 시작시 할당되고 프로그램 종료시 사라진다
    // - public static final : 상수 
    public static final int 상수 = 30 ;
    // --- 중의할점: static 우선할당 이므로 static 아닌 변수는 접근이 불가능
    // -> 해결방안은 인스턴스/객체 통해 멤버변수/메소드 사용

}
