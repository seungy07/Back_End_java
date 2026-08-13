package day28_0813.종합예제_d28.view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import day28_0813.종합예제_d28.controller.BoardController;
import day28_0813.종합예제_d28.model.dto.BoardDto;

public class BoardView {
    private BoardView(){} 
    private static final BoardView instance = new BoardView(); 
    public static BoardView getInstance(){ return instance; } 
    

    private BoardController bc = BoardController.getInstance(); // *view에서 controller 싱글톤 호출

    // [*] 메인 입출력 메인 페이지
    public void index(){
        while(true){
            System.out.println("1. 쓰기 2.전체 조회: ");
            int ch = scan.nextInt();
            if(ch==1){ save(); }
            else if(ch==2){ findAll(); 
            }else{break;}
        }
    }



    // [1] 게시물 작성 입출력
    Scanner scan = new Scanner(System.in); // 모든 메소드에서 사용 가능한 입력 객체
    public void save( ){
        // 1. 입력
        System.out.print("내용: ");  String 내용 = scan.next();
        System.out.print("작성자: ");     String 작성자 = scan.next();
        // 2. 객체화
        BoardDto boardDto = new BoardDto( 내용, 작성자 );
        // 3. 컨트롤러에게 요청하고 응답받기
        boolean result = bc.save(boardDto);
        // 4. 처리
        if( result ) {System.out.println("등록성공");}
        else{System.out.println("등록실패");} 
    }

    // [2] 게시물 전체 출력
    public void findAll(){
        // 1. controller부터 모든 게시물 요청하고 받음
        ArrayList<BoardDto> result = bc.findAll();
        // 2. controller부터 받은 모든 게시물을 출력
        for(BoardDto board : result){
            System.out.println(board.getWriter()+ " : "+board.getContent());
        }
    }
    

}
