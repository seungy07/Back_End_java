package day25_0810.종합예제.view;

import java.util.Scanner;

import day25_0810.종합예제.controller.BoardController;
import day25_0810.종합예제.model.dto.BoardDto;

public class BoardView {
    private BoardView(){} // 1.
    private static final BoardView instance = new BoardView(); // 2.
    public static BoardView getInstance(){ return instance; } // 3.
    // @view 로 끝남  3줄이

    private BoardController bc = BoardController.getInstance(); // *view에서 controller 싱글톤 호출

    // [1] 게시물 작성 입출력
    Scanner scan = new Scanner(System.in); // 모든 메소드에서 사용 가능한 입력 객체
    public void save( ){
        // 1. 입력
        System.out.print("내용: ");  String 내용 = scan.next();
        System.out.print("작성자: ");     String 작성자 = scan.next();
        // 2. 객체화
        BoardDto boardDto = new BoardDto( 내용, 작성자 );
        // 3. 컨트롤러에게 요청하고 응답받기
        boolean bc.save(boardDto);
        // 4. 처리
        if( result ) {System.out.println("등록성공");}
        else{System.out.println("등록실패");} 


    }
    
}
