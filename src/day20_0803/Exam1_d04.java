package day20_0803;

public class Exam1_d04 {
    public static void main(String[] args) {
        
        // 조건문: if(true / false){ 참인경우 } 
        int 온도 = 5; 
        if(온도 <= 10){System.out.println("외투를 입는다.");}

        // 조건문2 : if(true/false){ 실행문; 실행문; }
        if(온도 <= 10){System.out.println("외투");System.out.println("긴바지");}
        
        // 조건문3: if(true/ false){ true 실행문; }else{ false 실행문 }
        if( 온도 <= 19){System.out.println("외투를 입고");}else{System.out.println("외투를 입지 않는다");}

        // 조건문4 : if(true/false){실행문;} else if(t/f){실행문;} else if(t/f){실행문;}else{실행문;}
        if( 온도<=10 ){ }else if(온도<=15){ }else if(온도<=18){ }else{ }

        // 1. 조건문 중첩 : if( ){if( )}
        // 2. (다수 조건의 다수 실행문) if if if vs (다수 조건의 하나의 실행문)if else if else if else
        // 3. switch 문 : 값에 따른 흐름 제어 사용 
        
        // switch( 자료 ){ case 값1 : 실행문; case 값2 : 실행문; case 값3 : 실행문; default : 실행문; }
        // 자료에 동일한 값이 case 존재하면 실행문 실행, 단 *** 해당하는 case 부터 아래 case 모두실행(break 쓰지 않으면)
        char grade = 'A';
        switch (grade ) { 
            case 'A': System.out.println("A 등급입니다."); break;
            case 'B':System.out.println("B 등급"); break;
            case 'C': System.out.println("C"); break;
            default:System.out.println("재시험"); break;}

        switch (grade) {
            case 'A': System.out.println("한번에 합격");
            case 'B': System.out.println("합격");
            case 'C': System.out.println("2번에합격");
            default: System.out.println("탈락"); }

        // switch 중첩
        int adult = 0;
        switch (grade) { // 복잡한 조건보다는 단일 조건 값에 따른 흐름 제어
            case 'A':switch (adult) {case 1: System.out.println("어린이");break;  
                    default:break;} 
            default:break;}
        
        // 반복문

        
    }

}
