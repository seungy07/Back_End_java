package day25_0810.활동.Model.DAO;

import java.util.ArrayList;

import day25_0810.활동.Model.DTO.ListDto;

public class ListDao {

    private ListDao(){}
    private static final ListDao instance = new ListDao();
    public static ListDao getInstance(){return instance;}

    private ArrayList<ListDto> list = new ArrayList<>();

    // 대기명단 등록 저장
    public boolean save(ListDto listDto){
        list.add(listDto);
        return true;
    }
    
    // 명단 전체 조회
    public ArrayList<ListDto> findAll(){
        return list;
    }

    // controller 에서 있다는 정보 확인과 함꼐 넘오운 수정할 인원수 수정후 저장
    public boolean update(ListDto listDto, int new_인원수){
        listDto.set인원수(new_인원수);
        return true;
    }

    // 삭제
    public boolean delete(ListDto listDto){
        list.remove(listDto);
        return true;
        

    }

}
