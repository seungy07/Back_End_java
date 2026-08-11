package day25_0810.활동.VIEW;

import java.util.ArrayList;
import java.util.Scanner;

import day25_0810.종합예제.model.dto.BoardDto;
import day25_0810.활동.Controller.ListController;
import day25_0810.활동.Model.DTO.ListDto;

public class ListView {
    private ListView(){}
    private static final ListView instance = new ListView();
    public static ListView getIstance(){return instance;}

    private ListController lc = ListController.getInstance();
    

    // 메인 실행
    public void run(){
        while (true) {
            System.out.println("=================대기명단==============");
            System.out.println("1. 쓰기 | 2. 목록보기 | 3. 수정 | 4. 삭제");
            System.out.println("=====================================");
            System.out.print("선택 번호> ");
            int ch = scan.nextInt();
            if(ch==1){save();}
            else if(ch==2){findAll();}
            else if(ch==3){update();}
            else if(ch==4){delete();}
            else{System.out.println("잘못된 번호 입력으로 프로그램 중지");
                break;
            }
            
        }
    }

    // 등록
    Scanner scan = new Scanner(System.in);
    public void save(){
        System.out.print("전화번호: ");
        String number = scan.next();
        System.out.print("인원수: ");
        int 인원수 = scan.nextInt();

        ListDto  listDto = new ListDto(number,인원수);
        boolean result = lc.save(listDto);
        if(result){ System.out.println("대기명단 등록 성공");}
        else{System.out.println("등록 실패");}
    }

    // 출력
    public void findAll(){
        ArrayList<ListDto> result = lc.findAll();
        for(ListDto list : result){
            System.out.println("전화번호: "+list.getNumber() + " 인숸수: " +list.get인원수());
        }

    }
    

    // 수정
    public void update(){
        System.out.print("등록한 전화번호를 입력: ");
        String 전화번호 = scan.next();
        
        System.out.print("수정 인원수: ");
        int new_인원수 = scan.nextInt();

        boolean resultUpdate = lc.update(전화번호,new_인원수);

        if(resultUpdate){System.out.println("수정 성공");}
        else{System.out.println("수정 실패");}
        
    }
    

    // 삭제
    public void delete(){
        System.out.print("등록한 전화번호: ");
        String 전화번호 = scan.next();

        boolean resultDelete = lc.delete(전화번호);

        if(resultDelete){System.out.println("삭제 성공");}
        else{System.out.println("삭제 실패");}
        
        
    }



}
    
    

