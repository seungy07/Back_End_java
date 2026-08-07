package day24_0807;

// [문제 1] Member 클래스를 만드세요.
class Member{
    private String id;

    public String getId() {
        return id;}
    public void setId(String id) {
        this.id = id;}
}
// [문제 2] Score 클래스를 만드세요.
class Score{
    private int score;

    public void setScore(int score){
        if( score >=0 && score <= 100){
            this.score = score;
        }else{System.out.println("유효하지 않은 점수 입니다.");}
    }
    public int getScore(){
        return this.score;
    }}
// [문제 3] BankAccount 클래스를 만드세요.
class BankAccount{
    private String accountNumber;
    BankAccount(){}
    public String getAccountNumber(){
        return this.accountNumber;
    }
}
 // [문제 4] CircleCalculator 클래스를 만드세요.
class CircleCalculator{
    private final double PI = 3.14159;
    public double printCircleArea(int r){
        return r * r * this.PI ; 
    }
}

public class java_p10 {
    public static void main(String[] args) {

    // [문제 1] Member 클래스를 만드세요.
        Member member = new Member(); member.setId("admin");
        System.out.println(member.getId());

    // [문제 2] Score 클래스를 만드세요.
        Score score = new Score(); 
        score.setScore(85); System.out.println(score.getScore());
        score.setScore(120); System.out.println(score.getScore());


    // [문제 3] BankAccount 클래스를 만드세요.
    // 4. main 함수에서 "123-456"을 계좌번호로 가진 객체를 생성하고, getAccountNumber()로 계좌번호를 출력하여 확
        BankAccount bankAccount = new BankAccount();  // bankAccount.accountNumber = "123-456"; // 오류 발생
        System.out.println(bankAccount.getAccountNumber()); // null

    // [문제 4] CircleCalculator 클래스를 만드세요.
        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println(circleCalculator.printCircleArea(5));

    // [문제 5] TicketMachine 클래스를 만드세요.
    // 1. 이 클래스 안에, 발권된 총 티켓 수를 저장할 static int totalTickets = 0; 정적 변수를 선언하세요.
    // 2. 티켓을 한 장 발권하는 issueTicket() 인스턴스 메소드를 만드세요. 이 메소드는 호출될 때마다 totalTickets를 1씩
    // 증가시키고, "티켓 1장을 발권했습니다."라고 출력합니다.
    // 3. 현재까지 발권된 총 티켓 수를 출력하는 static void printTotalTickets() 정적 메소드를 만드세요.
    // 4. main 함수에서 TicketMachine 객체 3개(machine1, machine2, machine3)를 생성하세요.
    // 5. machine1으로 티켓 2장, machine2로 티켓 1장을 발권한 뒤, TicketMachine.printTotalTickets()를 호출하여
    // 총 발권 수가 올바르게 나오는지 확인하세요.


    // [문제 6] 게임의 고정 설정 값을 관리하는 GameConfig 클래스를 만드세요.
    // 1. 이 클래스 안에, 어디서든 접근 가능하며 절대 변하지 않는 다음 상수들을 public static final로 선언하세요.
    // 최대 레벨 MAX_LEVEL = 99
    // 최대 HP MAX_HP = 10000
    // 게임 이름 GAME_TITLE = "My RPG"
    // 2. main 함수에서 객체를 생성하지 않고, GameConfig.GAME_TITLE과 같이 클래스 이름으로 직접 접근하여 모든 설
    // 정 값을 출력하세요.


    }
    
}
