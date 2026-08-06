package day22_0805;

// [문제 1] Printer
class Printer{
    void printMessage(){
        System.out.println("안녕하세요, 메소드입니다");}}
// [문제 2] Greeter 클래스를 만드세요.
class Greeter{
    void greet(String name){
        System.out.printf("안녀하세요 %s님\n",name);
    }}
// [문제 3] SimpleCalculator 클래스를 만드세요.
class SimpleCalculator{
    int add( int x, int y){
        return x+y;
    }}
// [문제 4] Checker 클래스를 만드세요.
class Checker{
    boolean isEven(int x){
        if( x % 2 == 0){
            return true;
        }else{ return false;}
    }}
// [문제 5] Lamp 클래스를 만드세요. isOn (boolean) 멤버 변수를 가집니다.
class Lamp{
    boolean isOn; // 1. turnOn 메소드를 호출하면 isOn이 true가 되고, turnOff 메소드를 호출하면 false가 되도록 두 메소드를 정
    void turnOn(){
        this.isOn = true;
    }
    void turnOff(){
        this.isOn = false;
    }}
// [문제 6] Product 클래스를 만드세요. name(문자열)과 stock(정수) 멤버 변수를 가집니다.
class Product{
    String name; int stock;
    // 1. Product 클래스 안에, 구매 수량을 매개변수로 받아 재고를 차감하는 sell 메소드를 정의하세요. 이 메소드는 재고
    // 가 충분하면 재고를 줄이고 true를, 부족하면 "재고 부족" 메시지를 출력하고 false를 반환합니다.
    boolean sell(int 구매수량){
        if( 구매수량 <= this.stock ){
            this.stock -= 구매수량 ;
            System.out.println("구매 성공");
            return true;
        }else{System.out.println("재고부족"); return false;}
    }}
// [문제 7] Visualizer 클래스를 만드세요.
class Visualizer{
    String geStars(int x){
        if( x != 0){
            String geStar = "";
            for(int i=1; i<= x; i++){
                geStar += "★ ";
            }return geStar;
        }else{ return null; }
    }
}
// [문제 8] ParkingLot 클래스를 만드세요.
class ParkingLot{
    int calculateFee(int 주차시간){
        int 주차요금;
        if(주차시간 <= 30){
            주차요금 = 1000;
            return 주차요금;
        }else{
            주차요금 = 1000 + (주차시간 - 30)/10 * 500;
            if(주차요금 > 20000){
                주차요금 = 20000;
            }
            return 주차요금;
        }
    }
}



public class java_p9 {
    public static void main(String[] args) {
    // [문제 1] Printer 클래스를 만드세요.
        Printer printer = new Printer();  printer.printMessage();

    // [문제 2] Greeter 클래스를 만드세요.
        Greeter greeter = new Greeter();
        greeter.greet("나야");

    // [문제 3] SimpleCalculator 클래스를 만드세요.
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.add(20, 5); System.out.println(result);

    // [문제 4] Checker 클래스를 만드세요.
        Checker checker = new Checker(); 
        boolean result1 = checker.isEven(11);
        if(result1){
            System.out.println("짝수입니다");
        }else{System.out.println("홀수입니다");}
    
    // [문제 5] Lamp 클래스를 만드세요. isOn (boolean) 멤버 변수를 가집니다.
        Lamp lamp = new Lamp(); lamp.turnOn(); System.out.println(lamp.isOn);
        lamp.turnOff(); System.out.println(lamp.isOn);

    // [문제 6] Product 클래스를 만드세요. name(문자열)과 stock(정수) 멤버 변수를 가집니다.
        Product product = new Product(); product.stock =10;
        product.sell(5);

    // [문제 7] Visualizer 클래스를 만드세요.
        System.out.println(new Visualizer().geStars(5)); 

    // [문제 8] ParkingLot 클래스를 만드세요.
    // 1. 주차 시간(분)을 매개변수로 받아, 요금 규정에 따라 계산된 최종 주차 요금을 반환하는 calculateFee 메소드를 정
    // 의하세요.
    // 2. 요금 규정:
    // 기본 요금: 최초 30분까지 1,000원
    // 추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
    // 일일 최대 요금: 20,000원
    // 3. main 함수에서 calculateFee 메소드에 65, 140을 각각 인자로 전달하여 반환된 요금을 출력하세요.
        System.out.println(new ParkingLot().calculateFee(65));
        System.out.println(new ParkingLot().calculateFee(140));
    }

}
