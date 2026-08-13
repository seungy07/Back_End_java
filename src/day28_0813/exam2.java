package day28_0813;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class exam2 {
    public static void main(String[] args) {
        
        // JDBC : 자바와 데이터베이스 연동 제공하는 인터페이스
        // 1. .jar 파일 다운로드. 프로젝트내 lib 폴더에 저장  -> 설치[준비]
        // [연동] 
        
        try{
            // [1] MYSQL 회사에서 제공하는 Driver 구현테 (동적) 로드  *예외처리 필수*
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(" 연동 성공 ");

            // [2] 데이터베이스 서버연동  **예외 처리 필수
            // DriverManager.getConnection("jdbc:mysql://ip번호:3306/데이터베이스명", "계정명", "비밀번호") (127.0.0.1) 로컬 ip 주소(localhost)
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb0813", "root" , "1234");
            System.out.println("연동성공");

            // [3] 연동된 데이터베이스 내 DML(insert ,select, update, delete) 조작
            // 1. insert 하기 ,  insert into 테이블명(필드명) values(값0;)
            String sql = "insert into test(name) values('유재석') "; // 자바 문자열에 SQL 작성(자동완성 안댐)
            PreparedStatement ps = conn.prepareStatement( sql ); 
            // conn(연동된 인터페이스).prepareStatement( 기재할 SQL ); , 기재된 인터페이스 반환
            // PreparedStatement ( SQL 기재된 인터페이스 )
            int result = ps.executeUpdate(); // ps( 기재된 SQL 인터페이스 실행 ), ps.executeUpdate(); 반환타입이 INT 실행된 레코드수 반환
            System.out.println(result); // 성공: 1 나옴 한줄만 기재했기 떄문

            // 2. select 하기 , select 필드명 from 테이블명;
            String sql2 = "select * from test";
            PreparedStatement ps2 = conn.prepareStatement(sql2); // 작성한 sql 기재.
            ResultSet rsSet = ps2.executeQuery();  // 기재된 sql 실행 , 결과 reSet 인터페이스 대입  ResultSet 타입으로 조회결과 조작
            rsSet.next(); // 죄회 결과에서 다음 레코드로 이동
            System.err.println( rsSet.getInt("no") ); // rsSet.get타입("속성명");
            System.err.println( rsSet.getString("name") ); // rsSet.get타입("속성명");  
            System.out.println("레코드 조회 성공");

            // JDBC( 레거시 ) 기본 ---> 마이바티스 / JPA / SQL 매핑 나옴?



        }catch( ClassNotFoundException e){
            System.out.println("드라이브가 존재 x" + e); // 라이브러리 설치 안함
        }catch( SQLException e){ System.out.println("연동실패" + e);}


    }
    
}
