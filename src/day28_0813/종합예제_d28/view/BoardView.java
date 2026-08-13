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
                System.out.println("1. 등록  2.전체조회  3.개별수정  4.개별삭제 선택: ");
                int ch = scan.nextInt();
                if(ch ==1){ save(); }
                else if(ch ==2){}
                else if(ch ==3){}
                else if(ch ==4){}
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

    


    

}
