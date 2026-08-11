package day26_0811;

public class exam1 {
    public static void main(String[] args) {
        // 1. 동물객체 생성
        동물 animal1 = new 동물();    // 생성자 실행
        animal1.name = "강아지";     // 멤버변수 접근
        animal1.show();             // 메소드 실행

        // 2. 조류객체 생성
        조류 bird1 = new 조류();    // 조류생성자 + 동물생성자  실행 
        bird1.name = "비둘기";
        bird1.show();
        // 즉] 하위/자식 클래스의 객체는 상위/부모 클래스의 멤버(변수/메소드) 사용할 수 있다

        // 3. 참새객체 생성
        참새 sparrow = new 참새();  // 참새 + 조류 + 동물
        sparrow.name = "짹";
        sparrow.show();
        // 4. 닭 객체 생성
        닭 chicken1 = new 닭();  // 닭생성자 + 조류생성자 + 동물생성자 실행
        chicken1.name = "양념";  
        chicken1.show();
        // 즉] 상위 클래스의 객체가 먼저 생성되고 하위클래스 객체가 생성댐~ (자식이 태어나기 위해 부모가 먼저 태어남)

        // **[ 다형성 ]
        // 하나의 자료가 다양한 형(형식/모양/형태/구분/타입) 성질
        
        // 1. 참새가 조류 타입 변환 될까?
        // 가능한 이유: 1) 상속관게(논리)  2) 참새 인스턴스가 생성될때+조류+동물 인스턴스 생성 (물리)
        조류 bird2 = sparrow;  // 자동 타입변환  / 업캐스팅(자동상위 타입으로 변환)
        // 2. 참새 타입에서 동물 타입으로 될까?
        동물 animal2 = sparrow;  // 업캐스팅

        

    }
}
class 동물{ // 부모 클래스
    String name; // 1. 멤버변수
    동물(){ //생성자
        System.out.println("동물 탄생");        
    }
    void show(){ // 3. 메소드
        System.out.println("동물입니다.");
    }
}

class 조류 extends 동물{ } // 하위클래스명 extends 상위클래스명{ }
class 참새 extends 조류{ }
class 닭 extends 조류{ }

/*  <가계부>
    동물 -> 조류 -> 참새
              ㄴ> 닭
    
*/


