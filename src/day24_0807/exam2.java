package day24_0807;

public class exam2 {
    public static void main(String[] args) {
        // [1] setter, getter 이용한 간접접근 (직접접근 차단)
        User u1 = new User(); // 객체만들기 )인스턴스 생성
        // u1.name = "유재석"; // 접근 불가능
        u1.setName("유재석"); // 메소드를 이용한 간접접근
        // System.out.println(u1.name); // 불가능
        System.out.println(u1.getName()); // 가능
        // 간접접근으로 사이에 조건을 일부분만 접근

        // [2] 객체 출력하면 객체주소값 반환
        // toString메소드가 존재하는 객체는 주소값 대신에
        System.out.println(u1);
    }
}

class User{ // 클래스란? 객체 설계도/종이
    // 1. 멤버변수 = 상태 = private 사용
    private String name;
    private int age;

    // 2. 생성자 = 초기화
    public User(){}
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // 3. 메소드 = 행위 ,  자동 생성기능 있음
    // -private 메소드에 대한 간접접근 메소드
    // setter 저장시 , getter 호출시] set멤버변수, get멤버변수
    // getter 존재하면 V(value)O(object) 읽기모드 (setter 없음)
    // setter/getter 존재하면 D(data)T(transfer)O(object) 읽기/쓰기모드
    public void setName( String name){ // 메소드
        if( name.length() < 1){return;} 
        // 유효성검사를 이용하여 원하는 데이터만 저장
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    // 4. toStering : 객체 호출시 주소값 대신의 문자열 변환
    // -> 소스 작업 toString
    @Override 
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    } // password 등 개인정보에 위배되는 것들은 확인 후 지우고 출력.

    // DTO: 데이터베이스에 있는 자료 -> 이동DTO/VO -> 프론트엔드
    //      1. 관례적으로 멤버변수 모두 private
    //      2. setter/getter 제공한다
    //      3. toString 제공 
    //      4. 생성자에 기본생성자 , 전체 매개변수 생성자 =>2개 (샘플 어제코드)
    //        -> 관례적으로 기본생성자까지 생성하고(기본세팅) -> 추후 수정으로 조정
    
    // MVC패턴: 소규모가 아니 체계적인(약속) 규모 필요할 때 클래스 역할 나누기

    /* V : VIEW 입출력 담당                     HTML/CSS/JS/REACT/FLUTTER/(JAVA)
       C : Controller 제어(백/프) 중계          JAVA/PYTHON/NODE.JS
       M : model 데이터 담당                    DTO, VO(CONTROLLER-외부DB/클라우드)

        1인 식당 운영: 사장이 서빙-요리-재료관리
        n인 식당 운영: 각 담당자 서빙담당-요리담당-재료담당

        백엔드 --> 웹개발 HTML,CSS,JS
              --> 앱 FLUTTER/REACT NATIVE 
              --> 소프트웨어 C# C

        데이터분석 / AI (PYTHON) -- 연구분야
    */
}