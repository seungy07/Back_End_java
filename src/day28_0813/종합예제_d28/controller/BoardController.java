package day28_0813.종합예제_d28.controller;

import java.util.ArrayList;

import day28_0813.종합예제_d28.model.dao.BoardDao;
import day28_0813.종합예제_d28.model.dto.BoardDto;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance;}

    private BoardDao bd = BoardDao.getInstance(); // *controller 에서 dao 싱글톤 호출
   
    // [1] 등록 controller
    public boolean save( BoardDto boardDto ){
        boolean result = bd.save(boardDto);  // view 전달받은 매개변수를 DAO에게 전달 
        return result;  // DAO에게 받은 결과를 view 반환
    }

    // [2] 전체출력 controller
    public ArrayList<BoardDto> findAll(){
        ArrayList<BoardDto> result = bd.findAll();
        return result; 
    }
// 이번엔 중개 역할만 함, 전체적인 흐름을 보기위해
    // [3] 개별수정 controller
    public boolean update(BoardDto boardDto){
        return bd.update( boardDto );
    }

    // [4] 삭제
    public boolean delete(int no){
        return bd.delete(no);
    }
   

    
}
