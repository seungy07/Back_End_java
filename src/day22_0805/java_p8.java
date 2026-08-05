package day22_0805;

import java.util.Arrays;

//[문제 1] Book 클래스를 만드세요. (title, author, price 멤버 변수)
class Book{ // IDE(vscode) 소스 작업-> 자동 생성 기능 ( 자동생성자 ) constructor -> 멤버변수 체크 -> 확인
    String title; String author; int price;
    Book(String title, String author, int price){
        this.title = title; this.author = author; this.price = price;}}

// [문제 2] Rectangle 클래스를 만드세요. (width, height 멤버 변수) *멤버변수
class Rectangle{
    int width; int height;
    Rectangle(int width, int height){
        this.width=width; this.height=height;}}

// [문제 3] BankAccount 클래스를 만드세요. (accountNumber, ownerName, balance 멤버 변수) *멤버변수
class BankAccount{
    String acconutNumber; String ownerName; int balance;
    BankAccount(String acconutNumber, String ownerName, int balance){
        this.acconutNumber=acconutNumber; this.ownerName=ownerName; this.balance=balance;}
}
// [문제 4] Goods 클래스를 만드세요. (name, price 멤버 변수) *멤버변수
class Goods{
    String name; int price;
    Goods(){ price = 0;}
    Goods(String name, int price){
        this.name=name; this.price=price;
    }
}
// [문제 5] Member 클래스를 만드세요. (id, isLogin 멤버 변수) *멤버변수
class Member{
    String id; boolean isLogin;
    Member(){//id는 "guest", isLogin은 false로 초기화되도록
        id = "guest"; isLogin = false;
    }
}

public class java_p8 {
    public static void main(String[] args) {
    //[문제 1] Book 클래스를 만드세요. (title, author, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
        Book book1 = new Book("이것이 자바다.", "신용권", 3000);
        Book book2 = new Book("자바의 정석", "남궁성", 28000);
        System.out.printf("%s %s %d", book1.title, book1.author, book1.price);
        System.out.printf("\n%s %s %d", book2.title, book2.author, book2.price);

    // [문제 2] Rectangle 클래스를 만드세요. (width, height 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.printf("\n %d %d", rectangle.width, rectangle.height);
        

    // [문제 3] BankAccount 클래스 (다양한 데이터 타입을 가진 생성자
        BankAccount bankAccount = new BankAccount("111-222-3333", "유재석", 10000);
        System.out.printf("\n%s %s %d", bankAccount.acconutNumber,bankAccount.ownerName, bankAccount.balance);

    // [문제 4] Goods 클래스를 만드세요. (name, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
        Goods goods1 = new Goods(); Goods goods2 = new Goods("콜라",2000);
        System.out.printf("\n%s %d", goods1.name, goods1.price);
        System.out.printf("\n%s %d", goods2.name, goods2.price);

    // [문제 5] Member 클래스를 만드세요. (id, isLogin 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
        Member member = new Member(); System.out.printf("\n%s %b" , member.id,member.isLogin);
    }

}
