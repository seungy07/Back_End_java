package day19_0730;

import java.util.Scanner;

public class java_p4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*[문제 1] Scanner를 이용해 두 개의 점수(int)를 입력받아 총점을 계산하세요.
총점이 90점 이상이면 '성공'을, 그렇지 않으면 '실패'를 출력하는 프로그램을 작성하시오.*/
        System.out.print("1번 점수1를 입력: "); int 점수1 = scan.nextInt();
        System.out.print("2번 점수2를 입력: "); int 점수2 = scan.nextInt();
        if( 점수1+점수2 >= 90 ){ 
            System.out.println("성공");
        }else{System.out.println("실패");} 

/*[문제 2] Scanner를 이용해 서로 다른 두 개의 정수를 입력받아, 더 큰 수를 출력하는 프로그램을 작성하시오.*/
        System.out.print("2번 정수1를 입력: "); int 정수1 = scan.nextInt();
        System.out.print("2번 정수2를 입력: "); int 정수2 = scan.nextInt();
        if(정수1 > 정수2){
            System.out.println(정수1);
        }else{System.out.println(정수2);}

/*[문제 3] Scanner를 이용해 아이디와 비밀번호를 String으로 입력받습니다.
아이디가 'admin'이고 비밀번호가 '1234'와 모두 일치하면 '로그인 성공'을, 하나라도 다르다면 '로그인 실패'를 출력하는 프로그램을 작성하시오.*/
        System.out.print("3번 아이디를 입력: "); String 아이디 = scan.next();
        System.out.print("3번 비밀번호를 입력: "); String 비밀번호 = scan.next();
        if(아이디.equals("admin") && 비밀번호.equals("1234")){
            System.out.println("로그인 성공");
        }else{System.out.println("로그인 실패");}

/*[문제 4] Scanner를 이용해 비밀번호를 문자열로 입력받아, 길이에 따라 보안 등급을 출력하는 프로그램을 작성하시오.
요구 조건: 비밀번호의 길이는 .length() 메소드로 구할 수 있습니다. */
        System.out.print("4번 pw를 입력: "); String password = scan.next();
        if(password.length() >= 12){
            System.out.println("보안등급: 강함");
        }else if(password.length() < 8){
            System.out.println("보안 등급: 약함 (8자 이상으로 설정해)");
        }else{System.out.println("보안 등급: 보통");}

/*[문제 5] Scanner를 이용해 주민등록번호 13자리(-포함)를 문자열로 입력받습니다. 
성별을 나타내는 8번째 숫자가 '1' 또는 '3'이면 '남자'를, '2' 또는 '4'이면 '여자'를 출력하는 프로그램을 작성하시오.
요구 조건: 8번째 문자는 .charAt(7)으로 가져올 수 있습니다.*/
        System.out.print("5번 주민등록번호(- 포함)를 입력: "); String 주민등록번호 = scan.next();
        if(주민등록번호.charAt(8) == '1' || 주민등록번호.charAt(8) == '3'){
            System.out.println("남자");
        }if(주민등록번호.charAt(8) == '2' || 주민등록번호.charAt(8) == '4'){
            System.out.println("여자");
        }

/*[문제 6] Scanner를 이용해 게임 점수를 정수로 입력받아, 아래 기준에 따라 지급될 상품을 출력하는 프로그램을 작성하시오.*/
         System.out.print("6번 게임점수를 입력: "); int 게임점수 = scan.nextInt();
        if(게임점수 >= 900){System.out.println("A급 경품");}
        else if(게임점수 >= 700 && 게임점수 < 900){System.out.println("B급 경품");}
        else if(게임점수 >= 500 && 게임점수 <700){
            System.out.println("C급 경품");
        }else{System.out.println("참가상");}
      
/*[문제 7] Scanner를 이용해 사용자 역할(role)을 문자열로 입력받습니다. 역할에 따라 다른 접근 권한 메시지를 출력하는 프로그램을 작성하시오. */
        System.out.print("7번 역할를 입력: "); String 역할 = scan.next();
        if(역할.equals("admin")){
            System.out.println("모든 기능에 접근 가능");
        }else if(역할.equals("editor")){
            System.out.println("콘텐츠 수정 및 생성 기능만 접근 가능");
        }else if(역할.equals("viewer")){
            System.out.println("콘텐츠 조회만 ㄱㅏ능");
        }else{System.out.println("정의되지 않은 역할");}
        


/*[문제 8] Scanner를 이용해 사용자의 나이를 정수로 입력받아, 아래 기준에 따라 입장료를 출력하는 프로그램을 작성하시오. */
        System.out.print("8번 나이를 입력: "); int 나이 = scan.nextInt();
        if(나이 >= 65){
            System.out.println("3,000원");
        }else if(나이 >=20 && 나이 <65){
            System.out.println("10,000원");
        }else if(나이>=8 && 나이 <=19){
            System.out.println("5,000원");
        }else{System.out.println("무료");}

/*[문제 9] Scanner를 이용해 하나의 점수를 입력받아 다음 조건에 따라 등급을 출력하는 프로그램을 작성하시오.*/
        System.out.print("9번 하나의 점수를 입력: "); int 점수하나 = scan.nextInt();
        if(점수하나 >= 90){
            System.out.println("A등급");
        }else if(점수하나 >=80 && 점수하나 <90){
            System.out.println("B등급");
        }else if(점수하나>=70 && 점수하나 <80){
            System.out.println("C등급");
        }else{System.out.println("재시험");}

/*[문제 10] Scanner를 이용해 총 구매 금액을 입력받습니다. 구매 금액에 따라 할인율을 적용하여 최종 결제 금액을 출력하는 프로그램을 작성하시오.*/
        System.out.print("10번 구매금액를 입력: "); int 구매금액 = scan.nextInt();
        if(구매금액 >= 50000){
            System.out.println("최종 결제 금액" +구매금액*0.9 +"원");
        }else if(구매금액 >=30000 && 구매금액 <50000 ){
            System.out.println("최종 결제 금액" +구매금액*0.95 +"원");
        }else if(구매금액>=10000 && 구매금액<30000){
            System.out.println("최종 결제 금액" +구매금액*0.99 +"원");
        }else{System.out.println("할인 없음");}


/*[문제 11] 1부터 12 사이의 월(Month)을 숫자로 입력받아, 
해당하는 계절을 출력하는 프로그램을 작성하시오. 만약 1~12 이외의 숫자를 입력하면 '잘못된 월입니다.'를 출력하세요.*/
        System.out.print("11번 1~12월을 입력: "); int 월 = scan.nextInt();
        if(월>=3 && 월 <=5){
            System.out.println("봄");
        }else if(월 >=6 && 월 <=8) {
            System.out.println("여름");
        }else if(월>=9 && 월 <= 11){
            System.out.println("가을");
        }else if(월==12 || 월==1 || 월==2){
            System.out.println("겨울");
        }else{System.out.println("잘못된 월입니다");}


/*[문제 12] Scanner를 이용해 서로 다른 세 개의 정수를 입력받아, 가장 큰 수를 출력하는 프로그램을 작성하시오.*/
        System.out.print("12번 정수1를 입력: "); int 수1 = scan.nextInt();
        System.out.print("12번 정수2를 입력: "); int 수2 = scan.nextInt();
        System.out.print("12번 정수3를 입력: "); int 수3 = scan.nextInt();
        if( 수1 > 수2 && 수1 > 수3){
            System.out.println("가장 큰 수:" +수1);
        }else if(수2 > 수1 && 수2 > 수3){
            System.out.println("가장 큰 수:" +수2);
        }else if(수3 > 수1 && 수3 > 수2){
            System.out.println("가장 큰 수:" +수3);
        }

/*[문제 13] Scanner를 이용해 연도(year)를 입력받아 해당 연도가 윤년인지 평년인지 판별하는 프로그램을 작성하시오. */
        System.out.print("13번 연도를 입력: "); int year = scan.nextInt();
        if((year % 4 ==0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year+ "년은 윤년입니다");
        }else{System.out.println(year+"년은 평년입니다.");}

/*[문제 14] Scanner를 이용해 서로 다른 세 개의 정수를 입력받아, 오름차순(작은 수부터 큰 수 순서)으로 정렬하여 출력하는 프로그램을 작성하시오.*/
        System.out.print("14번 서로 다른 정수1를 입력: "); int num1 = scan.nextInt();
        System.out.print("14번 서로 다른 정수2를 입력: "); int num2 = scan.nextInt();
        System.out.print("14번 서로 다른 정수3를 입력: "); int num3 = scan.nextInt();
        if(num1 < num2 && num2 < num3){
            System.out.printf("%d, %d, %d" , num1, num2, num3);
        }if(num1 < num3 && num3 < num2){
            System.out.printf("%d, %d, %d" , num1, num3, num2);
        }if(num2 < num1 && num1 < num3){
            System.out.printf("%d, %d, %d" , num2, num1, num3);
        }if(num2 < num3 && num3 < num1){
            System.out.printf("%d, %d, %d" , num2, num3, num1);
        }if(num3 < num1 && num1 < num2){
            System.out.printf("%d, %d, %d" , num3, num1, num2);
        }if(num3 < num2 && num2 < num1){
            System.out.printf("%d, %d, %d" , num3, num2, num1);
        }

/*[문제 15] 가위바위보 게임*/
        System.out.print("15번 플레이어1 (0:가위, 1:바위, 2:보): "); int p1 = scan.nextInt();
        System.out.print("15번 플레이어2 (0:가위, 1:바위, 2:보): "); int p2 = scan.nextInt();
        if(p1 == p2){
            System.out.println("무승부");
        }else if(p1 == 0 && p2 ==2){
            System.out.println("플레이어1 승리");
        }else if(p1 == 1 && p2 ==0){
            System.out.println("플레이어1 승리");
        }else if(p1 == 2 && p2 ==1){
            System.out.println("플레이어1 승리");
        }else{System.out.println("플레이어2 승리");}

    }
}
