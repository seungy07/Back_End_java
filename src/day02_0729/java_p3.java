package day02_0729;

import java.util.Scanner;

public class java_p3 {
    public static void main(String[] args) {
        // 연산자는 JS와 동일, !== === 강력비교 제외 JS 연사자 동일
    /*[문제 1] Scanner를 이용해 국어, 영어, 수학 점수를 각각 정수(int)로 입력받아, 총점과 평균을 계산하여 출력하시오. */
        Scanner scanner = new Scanner(System.in );
        System.out.print("국어 점수:"); int 국어 = scanner.nextInt();
        System.out.print("영어 점수:"); int 영어 = scanner.nextInt();
        System.out.print("수학 점수:"); int 수학 = scanner.nextInt();
        System.out.println("총점:" +(국어+영어+수학));
        System.out.println("평균:" +(국어+영어+수학)/3.0);

    /*[문제 2] Scanner를 이용해 원의 반지름(double)을 입력받아, 원의 넓이를 계산하여 출력하시오.*/
        System.out.print("반지름 입력:"); double 반지름 = scanner.nextDouble();
        System.out.println("원의 넓이:" +(반지름*반지름*3.14));

    /*[문제 3] Scanner를 이용해 두 개의 실수(double)를 입력받아, 첫 번째 실수가 두 번째 실수의 몇 퍼센트인지 계산하여 출력하시오.*/
        System.out.print("실수1:"); double 실수1 = scanner.nextDouble();
        System.out.print("실수2:"); double 실수2 = scanner.nextDouble();
        System.out.println("비율" +(실수1/실수2)*100+ "%"); // double + double 여서 100.0 할필요 없이 100

    /*[문제 4] Scanner를 이용해 정수 하나를 입력받아, 그 수가 홀수이면 true, 짝수이면 false를 출력하시오. */
        System.out.print("정수한개:"); int 정수1 = scanner.nextInt();
        System.out.println(정수1 % 2 == 1 ? true : false); 

    /*[문제 5] Scanner를 이용해 정수 하나를 입력받아, 그 수가 7의 배수이면 true, 아니면 false를 출력하시오.  */
        System.out.print("정수 입력:"); int 정수2 = scanner.nextInt();
        System.out.println(정수2 % 7 == 0 ? true:false);

    /*[문제 6] Scanner를 이용해 아이디와 비밀번호를 String으로 입력받아, 아이디가 "admin"이고 비밀번호가 "1234"와 모두 일치하면 true, 아니면 false를 출력하시오.
    요구 조건:문자열 비교는 .equals() 메소드를 사용해야 합니다.*/
    //  JS/py == 문자열 비교가능, JAVA/C == 문자열 비교 불가능  .equals()를 사용
        System.out.print("아이디:"); String id = scanner.next();
        System.out.print("비밀번호:"); String pw = scanner.next();
        System.out.println(id.equals("admin") && pw.equals("1234")); // .equals()

    /*[문제 7] Scanner를 이용해 정수 하나를 입력받아, 그 수가 홀수이면서 7의 배수이면 true, 아니면 false를 출력하시오.*/
        System.out.print("정수 하나를 입력:"); int 정수하나 = scanner.nextInt();
        System.out.println(정수하나 % 7 == 0 && 정수하나 % 2 == 1);

    /*[문제 8] Scanner를 이용해 1차 점수와 2차 점수를 각각 int로 입력받아, 두 점수의 총점이 150점 이상이면 "합격", 아니면 "불합격"을 출력하시오. */
        System.out.print("1차점수 입력:"); int 점수1 = scanner.nextInt();
        System.out.print("2차점수 입력:"); int 점수2 = scanner.nextInt();
        System.out.println((점수1 + 점수2) >= 150 ? "합격": "불합격");

    /*[문제 9]  Scanner를 이용해 이름을 String으로 입력받아, 만약 이름이 "유재석"과 일치하면 이름 뒤에 "(방장)"을 붙여서 출력하고, 아니면 입력받은 이름만 출력하시오.*/
        System.out.print("9번 문제 이름을 입력해:"); String 이름 = scanner.next();
        System.out.println((이름.equals("유재석") ? 이름+"(방장)" : 이름));

    /*[문제 10] Scanner를 이용해 삼각형의 밑변과 높이를 각각 double로 입력받아, 삼각형의 넓이를 계산하여 출력하시오.*/
        System.out.print("10번 삼각형의 밑변: "); double 밑변 = scanner.nextDouble();
        System.out.print("10번 삼각형의 높이: "); double 높이 = scanner.nextDouble();
        System.out.println("삼각형의 넓이:" +(밑변 * 높이)/2.0); 

    /*[문제 11] Scanner를 이용해 섭씨 온도를 double로 입력받아, 화씨 온도로 변환하여 출력하시오.*/
        System.out.print("11번 섭씨온도 : "); double 섭씨온도 = scanner.nextDouble();
        System.out.println("화씨 온도: " +((섭씨온도*9.0/5.0)+32));

    /*[문제 12] Scanner를 이용해 태어난 년도(int)를 입력받아, 2025년 기준 현재 나이를 계산하여 출력하시오.*/
        System.out.print("12번 태어난 년도 : "); int 탄생년도 = scanner.nextInt();
        System.out.println("2025년 기준 나이: "+(2025-탄생년도)+"세");

    /*[문제 13] Scanner를 이용해 키(cm)와 몸무게(kg)를 각각 double로 입력받아, BMI 지수를 계산하여 출력하시오.*/
        System.out.print("13번 키cm : "); double 키 = scanner.nextDouble();
        System.out.print("13번 몸무게kg : "); double 몸무게 = scanner.nextDouble();
        System.out.println("BMI 지수: " +(몸무게/(키/100.0 * 키/100.0)));
        
    /*[문제 14] Scanner를 이용해 아이디와 이메일을 String으로 입력받습니다. 
    아이디가 "admin"이거나 또는 이메일이 "admin@test.com"이면 "관리자", 그렇지 않으면 "일반 사용자"를 출력하시오.*/
        System.out.print("14번 Id : "); String 아이디 = scanner.next();
        System.out.print("14번 이메일 : "); String 이메일 = scanner.next();
        System.out.println(아이디.equals("admin") || 이메일.equals("admin@test.com") ? "관리자":"일반 사용자");

    /*[문제 15] Scanner를 이용해 100점 만점의 점수(int)를 입력받아, 점수에 따라 아래와 같이 등급을 부여하고 출력하시오.*/
        System.out.print("15번  점수3입력 100점 만점 : "); int 점수3  = scanner.nextInt();
        System.out.println(점수3 >= 90 && 점수3 <=100 ? 'A': 점수3 < 90 && 점수3 >= 80 ? 'B': 'C');

    /*[문제 16] Scanner를 이용해 나이(int)를 입력받아, 20대(20세 이상 29세 이하)에 해당하는 경우 "이벤트 대상입니다."를, 
    그렇지 않으면 "이벤트 대상이 아닙니다."를 출력하시오.*/
        System.out.print("16번 나이 입력 : "); int 나이  = scanner.nextInt();
        System.out.println(나이<=29 && 나이>=20 ? "이벤트 대상입니다.":"이벤트 대상이 아닙니다");

    }

}
