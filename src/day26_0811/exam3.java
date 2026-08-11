package day26_0811;

public class exam3 {
    public static void main(String[] args) {
        
        /*
            오버로딩 : 생성자/메소드 명을 동일하게 여러개 선언
                조건: 매개변수 개수, 타입, 순서 다른 경우
            오버라이딩 : 물려받은 메소드를 재정의 
        */
        // 1. 상위객체
        상위클래스 obj1 =  new 상위클래스();
        obj1.show();

        // 2. 하위객체
        하위클래스 obj2 = new 하위클래스();
        obj2.show();

        // 3. *타입변환
        상위클래스 obj3 = obj2;
        obj3.show();   // 오버라이드 *우선
        System.out.println(  );

        
    }
    
}

class 상위클래스{
    int value1 = 10;
    int value2 = 20;
    상위클래스(){System.out.println("상위탄생");}
    void show(){System.out.println("상위 메소드 실행");}
}
class 하위클래스 extends 상위클래스{
    // 즉] 인스턴스 1개당 멤버면수 1세트씩 생성
    int value3 = 30; int value4 = 40;
    하위클래스(){System.out.println("하위 타생");}
    // 주의할점: 오버로딩 vs 오버라이딩
    void show( int a ){ } // 메소드명은 같지만 매개변수가 다르다. 


    @Override // 메소드 위  @Override 명시, 빈칸에 컨+스페이스  
    void show(){// 상위클래스의 메소드 선운부가 모두 동일 하면 (재정의)
        System.out.println("하위 메소드 재정의 실행");
    }  
    // 즉] 인스턴스1개당 메소드 공유
}

