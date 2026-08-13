package day28_0813.종합예제_d28.model.dao;

import java.util.ArrayList;

import day28_0813.종합예제_d28.model.dto.BoardDto;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){return instance;}

    // 추후 MYSQL 서버와 연동
    // *데이터베이스 대신 ArrayList 사용 , 표/데이터 역할 
    private ArrayList<BoardDto> boardList = new ArrayList<>(); // dto 저장하는 리스트 작성

    // [1] 게시물 작성 로직 (저장)
    public boolean save( BoardDto boardDto ){
        // 1. controller으로 부터 저장할 정보 객체 받는다
        // *추후 insert 이용한 db에 저장
        // 2. 리스트 저장(오늘만)
        boardList.add(boardDto);
        return true;
    }

    // [2] 게시물 전체 조회 로직
    public ArrayList<BoardDto> findAll(){
        // 1. controller에게 매개변수 받는다. 현재는 없음
        // * select 이용한 DB 조회
        // 2. 리스트 전체 반환
        return boardList;
    }
    
}
