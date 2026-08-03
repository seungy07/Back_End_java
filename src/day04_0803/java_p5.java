package day04_0803;

import java.util.Scanner;

public class java_p5 {
    public static void main(String[] args){
 
    // [문제 1] for문을 사용하여 1부터 10까지의 숫자를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
        for(int i=1; i<=10; i++){System.out.println(i);}

    // [문제 2] for문을 사용하여 10부터 1까지의 숫자를 역순으로 출력하는 프로그램을 작성하시오.
        for(int i=10; i<=1; i--){System.out.println(i);}
        int 문제2 = 10; while(문제2<=1){ System.out.ptintln(문제2); 문제2--; }

    // [문제 3] for문을 사용하여 1부터 50까지 모든 정수의 합계를 구하여 최종 결과를 출력하시오., 출력 예시: 1부터 50까지의 합계: 1275
        int 합계=0;
        for(int i=1; i<=50; i++){  합계 += i; System.out.println(합계);}

    // [문제 4] for문과 if문을 사용하여, 1부터 20까지의 숫자 중 짝수만 출력하는 프로그램을 작성하시오.
        for(int i=1; i<=20; i++){
            if( i % 2 ==0 ){System.out.println(i);}}

    // [문제 5] 1부터 30까지의 숫자 중, 3의 배수는 건너뛰고 나머지 숫자만 출력하는 프로그램을 작성하시오, 요구 조건: continue 문을 반드시 사용하시오.
        for(int i=1; i<=30; i++){
            if(i % 3 == 0){continue;} else{System.out.println(i);}}

    // [문제 6] 1부터 순서대로 숫자를 더해나갈 때, 합계가 처음으로 100을 초과하는 시점의 숫자와 그때까지의 합계를 출력하고 반복문을 즉시 종료하시오.
        int 합계2 = 0;
        for(int i=1;  ; i++){
            합계 += i;
            if(합계2 > 100){System.out.printf("숫자: %d 총합: %d", i,합계); break;}}

    // [문제 7] 중첩 for문을 사용하여 아래와 같이 별(*)로 이루어진 직각삼각형을 출력하시오.
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            
    // [문제 8] 중첩 for문을 사용하여 아래와 같이 별(*)로 이루어진 역직각삼각형을 출력하시오.
        for(int i=0; i<=4; i++){
            for(int j=1; j <= 5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    // [문제 9] Scanner와 무한루프를 사용하여, 사용자가 "end"를 입력할 때까지 계속해서 문자열을 입력받는 프로그램을 작성하시오. "end"가 입력되면,
    // 그 전까지 입력된 문자열의 총 횟수를 계산하여 아래 출력 예시와 같이 출력한 뒤 프로그램을 종료하시오.
        Scanner scan = new Scanner(System.in);
        int 입력횟수 = 0;
        while (true) {
            입력횟수++;
            System.out.printf("%d회 입력: ", 입력횟수); String 문자 = scan.next();
            if( 문자.equals("end")){System.out.printf("[안내] 프로그램을 종료 합니다.[총 %d회 입력]", 입력횟수); break;}}

    // [문제 10] 아래 선언된 4개의 변수는 7월 각 주차별 매출액입니다. 각 매출액을 '만원' 단위로 변환하고, 
    // 백만원 단위마다 '■' 문자로 시각화하여 아래 출력 예시와 같이 보고서를 출력하시오. 10/3 --> java 3, js 3,333
        int july1 = 3532100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;
        int[] week = {july1,july2,july3,july4};
        for(int i=0; i<=week.length-1; i++ ){
            System.out.printf("%d주차: ", i+1);
            for(int 출력=1; 출력<= week[i]/1000000; 출력++){
                System.out.print("■");
            }
            System.out.printf("%d만원", week[i]/1000);
            System.out.println();
        }
      
    // [문제 11] Scanner와 for(;;) 무한루프를 사용하여 간단한 ATM 기기를 만드시오.
        Scanner scan1 = new Scanner(System.in);
        int 잔고 = 0;
        for( ; ; ){
            System.out.print("1:입금 | 2:출금 | 3:잔고 | 4:종료 번호 입력: "); int 번호 = scan1.nextInt();
            if( 번호 == 1){System.out.print("입금액: "); int 입금액 = scan1.nextInt(); 잔고 += 입금액;}
            else if( 번호 == 2){
                System.out.print("출금액: "); int 출금액 = scan1.nextInt(); 
                if( 잔고 < 출금액){System.out.println("잔고 보다 큰 출금액은 출금 불가"); continue;
                }else{잔고 -= 출금액;}}
            else if( 번호 == 3){System.out.printf("잔고> %d \n", 잔고); }
            else if( 번호 == 4){System.out.println("프로그램을 종료합니다. "); break;}
        }


    }

}
