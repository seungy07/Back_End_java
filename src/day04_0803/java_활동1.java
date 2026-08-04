package day04_0803;

import java.util.Arrays;
import java.util.Scanner;

public class java_활동1 {
    public static void main(String[] args) {
        int[] array = new int[0];  // for 안에들어가면 계속 초기화 됨
        for(int i=0; ; i++){
            Scanner scan = new Scanner(System.in);

            System.out.printf("\n현재배열 [크기: %d]:" + Arrays.toString(array)+ "\n", i);
            System.out.print("[1. 요소 추가 | 2. 인덱스로 삭제 | 0. 종료]메뉴를 선택하세요:"); int 메뉴번호 = scan.nextInt();
            // 배열 복사? 

            // 기존 배열내 요소들의 값들을 새로운 배열에 복사
            if(메뉴번호 == 1){
                System.out.print("추가할 정수 값을 입력하세요"); int 추가정수 = scan.nextInt(); 
                int[] array1 = new int[i+1];
                for(int index=0; index<=array.length-1; index++){
                    array1[index] = array[index];  // 배열값 복사
                }
                array1[array1.length-1]= 추가정수; // 끝에 추가 부분
                // System.out.println(Arrays.toString(array1)); 새로운 배열의 정상적으로 추가,, 기존 배열의 길이가 짧음
                array = array1; 

            }else if(메뉴번호 == 2){
                System.out.printf("삭제할 인덱스 번호(0~%d)를 입력하세요: ",array.length-1); int 삭제인덱스 = scan.nextInt();
                //인덱스 위치의 값 삭제 0~삭제인데스-1   삭제인덱스+1~ 길이만큼 각각 배열값을 합쳐서 하나의 배열로 // 삭제는 -1 
                //for(int array : array[삭제인덱스-1]){}
                int[] array2 = new int[삭제인덱스];
                int[] array3 = new int[array.length-1-삭제인덱스];
                for(int j=0; j<= array2.length-1; j++){
                    array2[j] = array[j];}
                for(int k=0; k<=array3.length-1; k++){
                    array3[k] = array[k];
                }
                
                int[] array4 = new int[삭제인덱스 +(array.length-1-삭제인덱스)];
                
                

            }else if(메뉴번호 == 0){
                System.out.println("프로그램을 종료 합니다."); break;
            }else{System.out.println("번호 다시 입력");}
        }
    }

}
