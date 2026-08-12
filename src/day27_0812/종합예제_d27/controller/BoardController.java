package day27_0812.종합예제_d27.controller;

import java.util.ArrayList;

import day27_0812.종합예제_d27.model.dao.BoardDao;
import day27_0812.종합예제_d27.model.dao.IBaseDao;
import day27_0812.종합예제_d27.model.dto.BoardDto;

public class BoardController {
    private BoardController() {}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance() { return instance; }

    private IBaseDao ib = BoardDao.getInstance();

    public boolean save(BoardDto boardDto) {
        // TODO 1: boardDto 전달받아 DAO의 save()를 호출하고 결과 반환
         boolean result = ib.save(boardDto);
         return result;
    }

    public ArrayList<BoardDto> findAll() {
        // TODO 2: DAO의 findAll() 호출하여 결과 반환
        ArrayList<Object> result = ib.findAll();
        ArrayList<BoardDto> boardDtos = new ArrayList<>();

        for(Object obj : result){
            boardDtos.add( (BoardDto)obj );
        }

        

        return  boardDtos;
    } 
}