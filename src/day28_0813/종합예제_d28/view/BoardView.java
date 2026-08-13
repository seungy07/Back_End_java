package day28_0813.종합예제_d28.view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day28_0813.종합예제_d28.controller.BoardController;
import day28_0813.종합예제_d28.model.dto.BoardDto;

public class BoardView {
    private BoardView(){} 
    private static final BoardView instance = new BoardView(); 
    public static BoardView getInstance(){ return instance; } 
    
    private BoardController bc = BoardController.getInstance(); // *view에서 controller 싱글톤 호출

    private Scanner scan = new Scanner(System.in);

    // 최조 루프/화면
    public void run(){
        while (true) {
            try{ 
                System.out.print("1. 등록  2.전체조회  3.개별수정  4.개별삭제 선택: ");
                int ch = scan.nextInt();
                if(ch ==1){ save(); }
                else if(ch ==2){findAll();}
                else if(ch ==3){updete();}
                else if(ch ==4){delete();}
            }catch( InputMismatchException e){
                scan = new Scanner(System.in ); // 입력은 (성공)했지만 타입에서 예외 이므로 입력객체 초기화 
                System.out.println("정수만 입력" + e); // 위에 초기화를 안하면 계속 예외가 반복된다
            }

        }
    }
    // [1] 등록 View
    public void save(){  // 1.1 저장할 자료 입력
        System.out.print("내용: ");  String 내용 = scan.next();
        System.out.print("작성자: "); String 작성자 = scan.next();
        BoardDto boardDto = new BoardDto(0,내용,작성자); // 1.2 자료 객체화
        
        // 1.3 컨트롤에게 전달하여 응답을 받기
        boolean result = bc.save( boardDto );
        // 1.4 응답받은 결과로 출력
        if(result){System.out.println("등록성공");} else { System.out.println("등록실패");}
    }

    // [2] 전체조회 view
    public void findAll(){
        // 1. 컨트롤러에게모든 게시물 정보 요청하고 받는다.
        ArrayList<BoardDto> result = bc.findAll(); // 컨트롤러에서 게시물 정보들을 받는다.
        for(BoardDto dto : result){ // 반복문을 이용한 출력
            System.out.println( "번호: "+dto.getNo()+ "\n작성자: " +dto.getWriter()+ "\n내용: " +dto.getContent() );
        }
    }

    // [3] 특정 게시물 수정(내용만)
    public void updete(){
        System.out.print("수정할 게시물 번호 입력:"); int no = scan.nextInt();
        System.out.print("수정할 내용: "); String new_content = scan.next();
        BoardDto boardDto = new BoardDto(no, new_content, null); // writer 사용한함 null

        boolean result = bc.update( boardDto );
        if(result){System.out.println("수정 성공");}
        else{System.out.println("수정 실패");}

    }

    // [4] 특정 게시물 삭제(게시물 번호로 삭제)
    public void delete(){
        System.out.print("삭제할 번호: "); int 삭제번호 = scan.nextInt();
        // 매개변수가 한개이므로 dto 없이 (객체)
        boolean result = bc.delete( 삭제번호 );
        if(result){System.out.println("삭제성공"); }
        else{System.out.println("삭제 실패(없는 번호)" );
        }
    }

    


    

}
