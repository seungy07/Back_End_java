package day28_0813;

public class java_p14 {
    public static void main(String[] args) {
    // [문제 1] ArithmeticException 처리
    // 1. 두 정수를 나누는 코드를 작성하세요.
    // 2. try-catch 문을 사용하여, 0으로 나눌 때 발생하는 ArithmeticException을 잡으세요.
    // 3. catch 블록에서는 "0으로 나눌 수 없습니다." 라는 메시지를 출력하세요.
    // 필요 코드:int result = 10 / 0; 


    // [문제 2] NullPointerException 처리
    // 1. try-catch 문을 사용하여, 아래 코드 실행 시 발생하는 NullPointerException을 처리하세요.
    // 2. catch 블록에서는 "객체가 초기화되지 않았습니다." 라는 메시지를 출력하세요.
    // 필요 코드:
    // String text = null;
    // System.out.println("글자 수: " + text.toUpperCase()); 


    // [문제 3] finally 블록으로 리소스 정리하기
    // 1. "데이터베이스 연결을 시작합니다."를 출력하는 코드를 try 블록에 작성하세요.
    // 2. finally 블록을 사용하여, 예외 발생 여부와 상관없이 항상 "데이터베이스 연결을 종료합니다."가 출력되도록 만드세요. 


    // [문제 4] 다중 catch 블록과 상위 예외 처리 
    // 1. try 블록 안에 예외가 발생할 수 있는 코드를 작성하세요. 
    // 2. catch 블록 3개를 사용하여 아래 순서대로 처리하세요. 
    // - NullPointerException 처리 ("NPE 발생") 
    // - ArithmeticException 처리 ("0으로 나눔 발생") 
    // - Exception 처리 ("그 외 알 수 없는 예외 발생") 
    // 3. [생각해보기] 왜 Exception catch 블록은 가장 맨 아래에 위치해야 할까요? 
    // 필요 코드: String text = null; text.length(); 


    // [문제 5] throws로 예외 떠넘기기
    // Thread.sleep(1000); 코드를 포함하는 static void pauseOneSecond() 메소드를 만드세요.
    // 이 메소드는 try-catch 대신 throws InterruptedException를 사용하여 예외를 떠넘기도록 선언하세요.
    // main 함수에서 pauseOneSecond() 메소드를 호출하고, try-catch를 사용하여 떠넘겨진 예외를 처리하세요.
    // 필요 코드
    // Thread.sleep(1000); // 1초간 프로그램 일시정지
    // DROP DATABASE IF EXISTS practice_db;
    // CREATE DATABASE practice_db;
    // USE practice_db;
    // CREATE TABLE practice (
    // pno INT AUTO_INCREMENT PRIMARY KEY,
    // pname VARCHAR(50) NOT NULL,
    // pdate DATETIME DEFAULT NOW());


    // [문제 6] practice 데이터베이스와 직접 연동하는 PracticeDao 구조 설계
    // 1.PracticeDao 클래스 내부에서 직접 데이터베이스 연동(Connection)을 처리하세요.
    // 2. 외부에서 객체를 직접 생성하지 못하도록 싱글톤 패턴(Singleton Pattern)을 적용하세요.
    // 3. getInstance() 메소드를 통해 단 하나의 PracticeDao 인스턴스를 반환하도록 구현하세요.
    // private Connection conn;
    // private static final PracticeDao instance = new PracticeDao();
    // private PracticeDao() { Connection 연동 로직 }
    // public static PracticeDao getInstance() { return instance; } 


    // [문제 7] 데이터 등록 (Create - insert)
    // 1. PracticeDto(pname) 객체를 매개변수로 받아 practice 테이블에 레코드를 추가하는 create() 메소드를 작성하세요.
    // 2. PreparedStatement를 사용하여 SQL의 '?' 위치에 DTO의 pname 값을 바인딩하세요.
    // 3. executeUpdate()를 실행하여 1개 이상의 행이 성공적으로 추가되면 true, 실패 시 false를 반환하세요.


    // [문제 8] 전체 목록 조회 (Read - select 전체조회)
    // 1. practice 테이블의 모든 레코드를 조회하여 List<PracticeDto> 형태로 반환하는 readAll() 메소드를 작성하세요.
    // 2. executeQuery()를 실행하고 while(rs.next()) 루프를 통해 각 행의 데이터(pno, pname, pdate)를 PracticeDto 객체에 담으세요.
    // 3. 생성된 PracticeDto 객체들을 ArrayList에 추가하여 최종 리스트를 반환하세요.


    // [문제 9] 개별 데이터 조회 (Read - select 개별조회)
    // 1. 식별자 pno(번호)를 매개변수로 받아 해당 레코드 하나만 조회하는 readOne(int pno) 메소드를 작성하세요.
    // 2. WHERE pno = ? 조건절에 매개변수 pno를 바인딩하고 executeQuery()를 실행하세요.
    // 3. 조회 결과가 존재하면(if(rs.next())) 데이터를 PracticeDto 객체에 담아 반환하고, 없으면 null을 반환하세요. 


    // [문제 10] 데이터 수정 (Update - update)
    // 1. 수정할 정보(pno, pname)가 담긴 PracticeDto 객체를 매개변수로 받는 update() 메소드를 작성하세요.
    // 2. UPDATE 문을 사용하여 지정한 pno의 pname 값을 수정하도록 PreparedStatement를 설정하세요.
    // 3. executeUpdate() 실행 결과 변경된 행의 수가 1 이상이면 true, 실패 시 false를 반환하세요.


    // [문제 11] 데이터 삭제 (Delete - delete)
    // 1. 삭제할 레코드의 식별자 pno를 매개변수로 받는 delete(int pno) 메소드를 작성하세요.
    // 2. DELETE 문을 사용하여 지정한 pno 레코드를 테이블에서 제거하도록 PreparedStatement를 설정하세요.
    // 3. executeUpdate() 실행 결과 삭제된 행의 수가 1 이상이면 true, 실패 시 false를 반환하세요. 

    
    }
    
}
