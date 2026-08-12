package day27_0812;
// [문제 1] 기본 인터페이스와 구현
interface Soundable{ void makeSound();} // 1. "소리를 냅니다."라는 추상 메소드 makeSound()를 가진 Soundable 인터페이스를 정의하세요.
class Cat implements Soundable{
    @Override
    public void makeSound() {System.out.println("야옹");}}
class Dog implements Soundable{ // 2. Soundable 인터페이스를 구현(implements)하는 Cat 클래스와 Dog 클래스를 만드세요.
    @Override
    public void makeSound() { // 3. 각 클래스에서 makeSound() 메소드를 오버라이딩하여, 각각 "야옹", "멍멍"을 출력하도록 구현하세요.
        System.out.println("멍멍");}}

// [문제 2] 인터페이스 상수
interface RemoteControl{ // 2. 이 인터페이스 안에, public static final로 최대 볼륨 MAX_VOLUME = 10과 최소 볼륨 MIN_VOLUME = 0 상수를 정의
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;
}

// [문제 3] 다형성을 활용한 매개변수
    // 2. Attackable을 구현하는 Sword 클래스와 Gun 클래스를 만드세요.
    // 3. Attackable 타입의 객체를 매개변수로 받아, 해당 객체의 attack() 메소드를 호출하는 Character 클래스와
    // useWeapon(Attackable weapon) 메소드를 만드세요.
interface Attackable{ // 1. "공격!"이라는 추상 메소드 attack()을 가진 Attackable 인터페이스를 정의하세요.
    void attack();}
class Sword implements Attackable{
    @Override
    public void attack() {System.out.println("검 공격");}}
class Gun implements Attackable{
    @Override
    public void attack() {System.out.println(" 총 공격 ");}
}
class Character{
    void useWeapon(Attackable attackable){
        attackable.attack();
    }}

// [문제 4] 다중 인터페이스 구현
    // 1. "하늘을 납니다."를 출력하는 fly() 추상 메소드를 가진 Flyable 인터페이스를 만드세요.
    // 2. "물에서 헤엄칩니다."를 출력하는 swim() 추상 메소드를 가진 Swimmable 인터페이스를 만드세요.
    // 3. Duck 클래스가 Flyable과 Swimmable 두 인터페이스를 모두 구현하도록 작성하세요.
interface Flyable{ void fly();}
interface Swimmable { void swim();}
class Duck implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("하늘을 날던가");
    }
    @Override
    public void swim() {
        System.out.println("수영을 하던가");
    }
}
// [문제 6] 인터페이스를 이용한 객체 교체
    // 1. "데이터를 저장합니다."라는 추상 메소드 save()를 가진 DataAccessObject 인터페이스를 만드세요.
    // 2. DataAccessObject를 구현하여 각각 "Oracle DB에 저장", "MySQL DB에 저장"을 출력하는 OracleDao, MySqlDao 클
    // 래스를 만드세요.
interface DataAccessObject{ void save();}
class OracleDao implements DataAccessObject{
    @Override
    public void save() {
        System.out.println("Oracle DB 저장");
    }
}
class MysqlDao implements DataAccessObject{
    public void save() {
        System.out.println("MYSQl DB 저장");
    };
}
// [문제 7] 익명 구현 객체
    // 1. "환영합니다."를 출력하는 welcome() 추상 메소드를 가진 Greeting 인터페이스를 만드세요.
       


public class java_p13 {
    public static void main(String[] args) {
    // [문제 1] 기본 인터페이스와 구현
    // 4. main 함수에서 Cat 객체와 Dog 객체를 생성하고, 각 객체의 makeSound() 메소드를 호출하여 결과를 확인하세요.
        Cat cat = new Cat(); Dog dog = new Dog();
        cat.makeSound(); dog.makeSound();

    // [문제 2] 인터페이스 상수
    // 3. main 함수에서 객체를 생성하지 않고, RemoteControl.MAX_VOLUME과 같이 인터페이스 이름으로 직접 접근하여 두 상수
        System.out.println((RemoteControl.MAX_VOLUME));
        System.out.println((RemoteControl.MIN_VOLUME));

    // [문제 3] 다형성을 활용한 매개변수
    // 4. main 함수에서 Sword 객체와 Gun 객체를 생성한 뒤, 이 객체들을 Character의 useWeapon() 메소드에 인자로 전달하여
        Sword sword = new Sword(); Gun gun = new Gun();  Character character = new Character();
        character.useWeapon(gun); character.useWeapon(sword);
        
    // [문제 4] 다중 인터페이스 구현
    // 4. main 함수에서 Duck 객체를 생성하고, fly()와 swim() 메소드를 모두 호출하여 결과를 확인하세요.
        Duck duck = new Duck();  duck.fly(); duck.swim();


    //[문제 5] instanceof와 인터페이스
    // 1. 문제 5에서 만든 Flyable, Swimmable 인터페이스와 Duck 클래스를 활용합니다.
    // 2. main 함수에서 Duck 객체를 생성하고, Object 타입의 변수에 저장하세요.
    // 3. if문과 instanceof 연산자를 사용하여, 해당 객체가 Flyable 타입인지, Swimmable 타입인지 각각 확인하고, 맞다면 해당 인
    // 터페이스 타입으로 강제 형변환하여 메소드를 호출하세요.
        Object duck2 = new Duck();  
        System.out.println(duck2 instanceof Flyable); System.out.println(duck2 instanceof Swimmable); // 둘다 true
        if( duck2 instanceof Flyable ){ Flyable flyable= (Flyable)duck2; flyable.fly();}  
        if( duck2 instanceof Swimmable ){ Swimmable swimmable = (Swimmable)duck2; swimmable.swim();} 

    // [문제 6] 인터페이스를 이용한 객체 교체
    // 1. "데이터를 저장합니다."라는 추상 메소드 save()를 가진 DataAccessObject 인터페이스를 만드세요.
    // 2. DataAccessObject를 구현하여 각각 "Oracle DB에 저장", "MySQL DB에 저장"을 출력하는 OracleDao, MySqlDao 클래스 만드세요.
    // 3. main 함수에서 DataAccessObject 타입의 변수 dao를 선언하세요.
    // 4. dao에 new OracleDao()를 대입하여 save()를 호출하고, 그 다음 new MySqlDao()를 대입하여 save()를 호출하여 DB가
    // 쉽게 교체되는 것을 확인하세요.
        DataAccessObject dao;
        dao = new OracleDao(); dao.save();
        dao = new MysqlDao(); dao.save();


    // [문제 7] 익명 구현 객체
    // 1. "환영합니다."를 출력하는 welcome() 추상 메소드를 가진 Greeting 인터페이스를 만드세요.
    // 2. main 함수에서, 별도의 클래스 파일을 만들지 않고, Greeting 인터페이스 타입의 변수를 선언하면서 익명 구현 객체를 생성하여
    // welcome() 메소드를 즉석에서 구현하고 호출하세요.
    // 예] Greeting g = new Greeting() { ... }; 


    // [문제 8] 디폴트 메소드 (Default Method)
    // 1.Device 인터페이스에, turnOn(), turnOff() 추상 메소드와 함께, public default void setMute(boolean mute) 디폴트
    // 메소드를 추가하세요. 디폴트 메소드는 "무음 처리합니다."를 출력하도록 구현합니다.
    // 2.Television 클래스가 Device를 구현하도록 하되, turnOn(), turnOff()만 오버라이딩하세요.
    // 3.main 함수에서 Television 객체를 생성하고, turnOn(), turnOff()와 함께 디폴트 메소드인 setMute()도 호출되는 것을 확
    // 인하세요 


    // [문제 9] 정적 메소드 (Static Method)
    // 1. Calculator 인터페이스를 만들고, 두 정수의 합을 반환하는 plus(int x, int y) 정적 메소드를 정의하세요.
    // 2. main 함수에서 Calculator 인터페이스를 구현하는 클래스나 객체를 만들지 않고, Calculator.plus(10, 20)과 같이 인터페이
    // 스 이름으로 직접 정적 메소드를 호출하여 결과를 출력하세요. 
    
}}
