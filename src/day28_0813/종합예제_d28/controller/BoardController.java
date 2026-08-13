package day28_0813.종합예제_d28.controller;

import java.util.ArrayList;

import day28_0813.종합예제_d28.model.dao.BoardDao;
import day28_0813.종합예제_d28.model.dto.BoardDto;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance;}

    private BoardDao bd = BoardDao.getInstance(); // *controller 에서 dao 싱글톤 호출
    // 역으로 view 에서 부르는 것음 금지*

    // [1] 게시물 작성 컨트롤러
    public boolean save( BoardDto boardDto){
        // 1. view로 부터 저장할 정보를 객체로 받는다
        // *유효성검사 / 타입 변환 등등
        // 2. dao 에게 요청하고 응답받기
        boolean result = bd.save( boardDto );
        // 3. dao에게 받은 결과를 view에게 응답하기
        return result;
    }

    // [2] 게시물 전체 조회 컨트롤러
    public ArrayList<BoardDto> findAll(){
        // 1. view에게 매개변수 받는다. 현재는 없음
        // 2. 세션/쿠키 관리  * 지금은 할게 없다
        // 2. dao 에게 요청 하고 응답을 받느다
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }
    
}
