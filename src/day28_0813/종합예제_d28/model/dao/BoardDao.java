package day28_0813.종합예제_d28.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import day28_0813.종합예제_d28.model.dto.BoardDto;

public class BoardDao extends BaseDao{ // BaseDao 상속
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){return instance;}

    // [1] 등록 DAO
   public boolean save(BoardDto boardDto){
        // 1.1 등록 SQL 작성 , 값에 와일드 카드 (?)를 이용한 매개변수 대입
        String sql = "insert into board(content,writer) values( ? , ? )";
        // 1.2 연동된 데이터베이스에 SQL 기재
        try{   
            PreparedStatement ps = conn.prepareStatement(sql);
            // 1.3 기재된 SQL문법내 ?(와일드카드) 매개변수 값 대입, ps.set타입(?번호, 값);
            ps.setString(1, boardDto.getContent() ); // 1(첫번째 ?)에 dto content 대입
            ps.setString(2, boardDto.getWriter() );// 2(두번쨰 ?)에 dto writer 대입

            // 1.4 기재된 SQL 실행, executeUpdate() insert/updete/delete에서 사용 
            int result = ps.executeUpdate(); // 실행 후 처리된 레코드 수 반환

            // 1.5  SQL  결과
            if(result ==1) return true;

        }catch( SQLException e){ System.out.println(e); }

        return false;
    }

    

    
}
