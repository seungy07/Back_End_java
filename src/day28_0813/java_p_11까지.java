package day28_0813;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class java_p_11까지 {
    
// [문제 6] practice 데이터베이스와 직접 연동하는 PracticeDao 구조 설계
        // 1.PracticeDao 클래스 내부에서 직접 데이터베이스 연동(Connection)을 처리하세요.
        // 2. 외부에서 객체를 직접 생성하지 못하도록 싱글톤 패턴(Singleton Pattern)을 적용하세요.
        // 3. getInstance() 메소드를 통해 단 하나의 PracticeDao 인스턴스를 반환하도록 구현하세요.

    private Connection conn;
    private static final java_p_11까지 instance = new java_p_11까지();
    private java_p_11까지() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/mydb0813";
            String user = "root";
            String password = "1234";

            conn = DriverManager.getConnection(url, user,password);
        }catch(ClassNotFoundException e){System.out.println(e);    
        }catch(SQLException e){System.out.println(e);}
    

        // [문제 7] 데이터 등록 (Create - insert)  // practice 테이블
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