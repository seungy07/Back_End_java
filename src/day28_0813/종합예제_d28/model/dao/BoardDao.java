package day28_0813.종합예제_d28.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import day28_0813.종합예제_d28.model.dto.BoardDto;

public class BoardDao extends BaseDao{ // BaseDao 상속
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){return instance;}

    // [1] 등록 DAO
   public boolean save(BoardDto boardDto){
        
        // 1.2 연동된 데이터베이스에 SQL 기재
        try{   
            // 1.1 등록 SQL 작성 , 값에 와일드 카드 (?)를 이용한 매개변수 대입
            String sql = "insert into board(content,writer) values( ? , ? )";
            // 1.2 sql 기재
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

    // [2] 전체 조회 DAO
    public ArrayList<BoardDto> findAll(){
        ArrayList<BoardDto> list = new ArrayList<>(); // 2.7 변환한 DTO들을 담을 리스트(레코드를 담을)
        try{
            String sql = "select * from board" ; // 2.1 SQL 작성
            PreparedStatement ps = conn.prepareStatement(sql); //2.2 SQL 기재

            // 2.3  ?매개변수 대입 ,<생략>.
            // 2.4  기재된 SQL 실행
            ResultSet rs = ps.executeQuery(); // select 문 사용
            // 2.5 SQL결과 (select 결과는 항상 테이블로 반환) 즉] 레코드 하나씩 타입변환
            while ( rs.next() ) { // rs.next() : 다음 레코드(행) 이동, 마지막 레코드까지 하나씩 이동을 반복 // 레코드 수 만큼 반복
                // 2.6 현재 레코드의 필드값 들을 --> DTO 변환
                BoardDto boardDto = new BoardDto();
                boardDto.setNo( rs.getInt("no") ); // setter이용한
                boardDto.setContent( rs.getString("content"));
                boardDto.setWriter( rs.getString("writer"));

                // 2.7 변환한 DTO --> 리스트에 담기
                list.add( boardDto );
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        // 2.8 list 반환
          return list;
    }
    // [3] 개별수정 DAO
    public boolean update(BoardDto boardDto){  // 등록함수 1.1~5 까지 똑같 (기재 할떄 예외 처리**)
        try{
            String sql = "update board set content= ? where no = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            // ? 순서 구별 잘하기
            ps.setString(1, boardDto.getContent());
            ps.setInt(2, boardDto.getNo());

            int result = ps.executeUpdate();
            if(result == 1){return true;}
        }catch(SQLException e){System.out.println(e);}
        return false;
    }

    // [4] 개별삭제 DAO
    public boolean delete(int no){
        try{
            String sql = "delete from board where no = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, no);
            int result = ps.executeUpdate();
            if(result == 1){return true;}

        }catch(SQLException e){System.out.println(e);}
        return false;
    }
    

    
}
