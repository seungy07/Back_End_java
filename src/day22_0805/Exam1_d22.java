package day22_0805;

class Phone{
    // *** 클래스 가족(멤버들) ***
    // 1. 멤버변수
    String model;   String color;   int price;

    // 2. 생성자
    // * 생성자명은 중복이 완된다. 중복되게 해주는 -> *오버로딩 : 매개변수 계수/타입/순서)  다르면 중복가능 
    Phone( ){ }; // 기본생성자: 매개변수가 없는 

    Phone( String model, String color){ // 오버로딩, 동일한 이름으로 생성자 두개
        this.model = model;
        this.color = color;
    }
    // this ? 매개변수와 멤버변수 식별 용도. 멤버변수명 = 매개변수명으면  멤버변수명 앞에 this로 식별, 즉 멤버변수 식별용
    Phone( String model, String color, int 가격){ 
        this.model = model;
        this.color = color;
        price = 가격;  // 멤버변수명, 매개변수명이 다르므로 this를 사용하지 않아도 됨
    }
    // * 생성자가 1개도 없으면 자동으로 기본생성자 생성

    // 3. 메소드/함수
}

public class Exam1_d22 {
    public static void main(String[] args) {
        /*
            생성자 : 인스턴스(객체) 생성할 때 초기화 사용되는 키워드
            선언하는 방법
                1) 클래스 내부 
                2) 클래스명과 동일,  **만일 다르면 메소드취급
                3) 오버로딩 지원: 동일한 이름으로 여러개 선언, 조건
            목적 : 1) 빠른 초기화 2) 객체생성 규칙/유효성검사
            종류 : 1) 기본생성자(매개변수없는)   2) 정의생성자(매개변수가있는)
        */

        // [1] 기본생성자로 객체생성,  new 생성자명( )
        Phone phone = new Phone();   phone.model = "갤럭시";

        // [2] 정의생성자로 객체 생성, new 생성자명( 값1, 값2 )
        Phone phone2 = new Phone( "아이폰",  "파랑"); // 가이드 라인 구별

        // [3] 정의생성자로 객체 생성
        Phone phone3 = new Phone("갤럭시탭", "블랙", 3000);
        


    }

}
