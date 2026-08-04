package day21_0804;

import java.util.Arrays;
import java.util.Scanner;

// [문제1]
    class Book{ String title; String author; int price; }
// [문제 2]
    class Pet{ String name; String species; int age; }
// [문제 3]
    class Rectangle{ int width; int height; }
// [문제 4]
    class BankAccount{ String accountNumber; String ownerName; int balance; }
// [문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수)
    class Product{ String name; int price; }
// [문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean)
    class Member{ String id; boolean isLogin; }
// [문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수)
    class Television{ int channel; int volume; }
// [문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수)
    class Player{ String name; int Power; int speed; }
// [문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부)
    class MenuItem{ String name; int price; boolean isSignature;}
// [문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열)
    class UserProfile{ String name; int age; String mbti; }

public class java_p7 {
    public static void main(String[] args) {
// [문제 1] Book 클래스를 만드세요. 이 클래스는 title(문자열), author(문자열), price(정수) 멤버 변수를 가집니다.
        Book b1 = new Book(); Book b2 = new Book();
        b1.title = "이것이 자바다"; b1.author = "신용권"; b1.price = 30000;
        b2.title = "자바의 정석"; b2.author = "남궁성"; b2.price = 28000;
        System.out.println(b1.title);System.out.println(b1.price);System.out.println(b1.author);
        System.out.println(b2.title);System.out.println(b2.price);System.out.println(b2.author);

// [문제 2] Pet 클래스를 만드세요. name(문자열), species(문자열, 품종), age(정수) 멤버 변수를 가집니다.
        Pet p1 = new Pet(); Pet p2 = new Pet();
        p1.name = "초코"; p1.species = "푸들"; p1.age = 3;
        p2.name = "나비"; p2.species = "코리안숏헤어"; p2.age = 5;
        System.out.printf("이름: %s , 종류: %s , 나이: %d살", p1.name, p1.species, p1.age);
        System.out.printf("\n이름: %s , 종류: %s , 나이: %d살", p2.name, p2.species, p2.age);  

// [문제 3] Rectangle 클래스를 만드세요. width(정수)와 height(정수) 멤버 변수를 가집니다.
        Rectangle R1 = new Rectangle();
        R1.width = 10; R1.height = 5;
        System.out.printf("\n사각형의 넓이: %d ", R1.height*R1.width); 

// [문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = "111-222-3333"; bankAccount.ownerName = "유재석"; bankAccount.balance = 10000;
        bankAccount.balance += 5000; System.out.printf("\n입금 후 잔액: %d ", bankAccount.balance);
        bankAccount.balance -= 3000; System.out.printf("\n출금 후 잔액: %d\n",bankAccount.balance);
        
// [문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
        Product product1 = new Product(); product1.name="새우깡"; product1.price=1500;
        Product product2 = new Product(); product2.name="콜라"; product2.price=2000;
        if(product1.price < product2.price){System.out.println(product2.name);}else{System.out.println(product1.name);} 

// [문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
        Member member = new Member(); member.id = "admin"; member.isLogin = false;
        System.out.printf("로그인 전 상태: %b", member.isLogin);
        member.isLogin = true;
        System.out.printf("\n로그인 후 상태: %b", member.isLogin);

// [문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
        Television television = new Television(); television.channel = 7; television.volume = 20;
        television.channel=11; television.volume=2;
        System.out.printf("\n변경된 채널: %d, 변경된 볼륨: %d",television.channel, television.volume);
        
// [문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
        Player player1=new Player(); Player player2=new Player();
        player1.name="손흥민"; player1.Power=90; player1.speed=95;
        player2.name="이강인"; player2.Power=85; player2.speed=92;
        if((player1.Power+player1.speed) < (player2.Power+player2.speed) ){
            System.out.printf("\n파워+스피드가 높은 선수는 %s", player2.name);
        }else{System.out.printf("\n파워+스피드가 높은 선수는 %s", player1.name);}
        
// [문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집
        MenuItem menuItem1=new MenuItem(); MenuItem menuItem2=new MenuItem(); MenuItem menuItem3=new MenuItem();
        menuItem1.name="김치찌개"; menuItem1.price=8000; menuItem1.isSignature=true;
        menuItem2.name="된장찌개"; menuItem2.price=8000; menuItem2.isSignature=false;
        menuItem3.name="계란찜"; menuItem3.price=3000; menuItem3.isSignature=false;
        MenuItem[] meItems = {menuItem1,menuItem2,menuItem3};
        for(int i=0; i<=meItems.length-1; i++){
            if(meItems[i].isSignature == true){
                System.out.printf("\n%b %s : %d원\n", meItems[i].isSignature, meItems[i].name ,meItems[i].price);}}

// [문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
        UserProfile userProfile = new UserProfile();
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력: "); String 이름 = scanner.next();
        System.out.print("나이 입력: "); int 나이 = scanner.nextInt();
        System.out.print("MBTI 입력: "); String mbti = scanner.next(); 
        userProfile.name = 이름; userProfile.age = 나이; userProfile.mbti = mbti;
        System.out.printf("---프로필---"+"이름: %s , 나이: %d , MBTI: %s",userProfile.name,userProfile.age,userProfile.mbti);
        

    }
}
