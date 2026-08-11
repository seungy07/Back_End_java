package day25_0810.활동.Controller;

import java.util.ArrayList;

import day25_0810.활동.Model.DAO.ListDao;
import day25_0810.활동.Model.DTO.ListDto;

public class ListController {
    private ListController(){}
    private static final ListController instance = new ListController();
    public static ListController getInstance(){return instance;}

    private ListDao ld = ListDao.getInstance();
    
    // 대기명단 등록 컨트롤러
    public boolean save(ListDto listDto){
        // 유효선 전화번호 인원수(정수형) 추후 추가
        boolean result = ld.save(listDto);
        return result;
    }
    // 명단전체 출력
    public ArrayList<ListDto> findAll(){
        ArrayList<ListDto> result = ld.findAll();
        return result;
    }

    // 선택부분 인덱스 및 수정된 인원수
    public boolean update(String 전화번호, int new_인원수){
        ArrayList<ListDto> result = findAll();
        for(int i=0; i<=result.size()-1; i++){
            if(result.get(i).getNumber().equals(전화번호)){
                boolean resultUpdate = ld.update(result.get(i),new_인원수);
                return resultUpdate;
            }
        }
        return false;
    }

    // 삭제
    public boolean delete(String 전화번호){
        ArrayList<ListDto> result = findAll();
        for(int i =0; i<=result.size()-1; i++){
            if(result.get(i).getNumber().equals(전화번호)){
                boolean resultDelete = ld.delete(result.get(i));
                return resultDelete;
            }
        }
        return false;
    }
    
}
