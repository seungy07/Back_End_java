package day25_0810.활동.Model.DTO;

public class ListDto {
    private String number; // 전호번호
    private int 인원수;

    public ListDto(){}
    public ListDto(String number, int 인원수){
        this.number = number;
        this.인원수 = 인원수 ;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public int get인원수() {
        return 인원수;
    }
    public void set인원수(int 인원수) {
        this.인원수 = 인원수;
    }
    @Override
    public String toString() {
        return "ListDto [number=" + number + ", 인원수=" + 인원수 + "]";
    }

    
    
}
