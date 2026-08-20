package day31_0819;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class java_p14 {
    
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227";
        try{
            while (true) {
                String[] carParkingData = carParkingList.split("[,\n]"); //  , \n 동시 분리  ,, [3, 211가6231, 202608190930, 8, 452하1234, 202608171227]

                System.out.print("1.위치찾기 2.입차 3.출차 선택:");
                int ch = scan.nextInt();
                if( ch == 1 ){ findCarLocation( carParkingData ); } // 위치찾기 구현 
                if( ch == 2 ){  carParkingList = carParkingList.concat(inputCar( carParkingData )); } // 입차 구현 
                if( ch == 3 ){carParkingList = delete_car(carParkingList); } // 출차 구현
            }
        }catch( InputMismatchException e){ scan = new Scanner(System.in); System.out.println("정수만 입력." + e);}

    }    
// 3. 구현 요구사항
// 다음 세 기능 구현하세요. 
// ① 차량 위치 찾기 (findCarLocation)
// 기능: 차량 번호를 입력받아 현재 주차된 위치 번호를 반환합니다.
// 입력: carNumber (찾을 차량번호)
// 출력/반환:
// 차량이 존재할 경우: 주차 위치 번호 (예: "3")
// 차량이 없을 경우: "미등록 차량" 또는 -1 반환
    public static void findCarLocation( String[] carParkingData ){
        System.out.print("차량번호 입력: ");  String carNumber = scan.next();
        boolean find = false;
        for(int i=1; i<=carParkingData.length-1; i+=3){  // [ 위치, 번호, 날짜, 위치, 번호, 날짜 ]
            if (carParkingData[i].equals(carNumber)) {
                System.out.println("차량이 주자된 위치는 " +carParkingData[i-1]+ "입니다."); find =true; break;
            }
        }
        if(find == false){System.out.println("미등록 차량");}
    }

// ② 입차 처리
// 기능: 새로운 차량의 주차 정보를 기존 데이터에 추가합니다.
// 조건:
// 이미 주차되어 있는 위치 번호에는 중복 주차할 수 없습니다
// 입력: location (위치번호), carNumber (차량번호), dateTime (입차일시)
// 출력/반환:
// 차량이 입차한 경우 : 주차 위치 번호 (예: "3")
// 차량이 입차가 없을 경우: 위치 번호에는 중복 주차할 수 없습니다. (위치 중복 시 입차 불가 메시지 출력)
    public static String inputCar(String[] carParkingData){
        while (true) {
            boolean 중복 = false;

            System.out.print("차량번호 입력: "); String carNumber = scan.next();
            for(int i = 1; i < carParkingData.length; i += 3){
                if(carParkingData[i].equals(carNumber)){중복 = true;break;}}
            if(중복){ System.out.println("이미 주차된 차량입니다.");continue;}

            System.out.print("주차할 위치 번호: ");String location = scan.next();
            for(int i = 0; i < carParkingData.length; i += 3){
                if(carParkingData[i].equals(location)){중복 = true;break;}}
            if(중복){System.out.println("차량이 이미 주차된 곳입니다.");continue;}

            System.out.print("입차일시 년월일시간분초(공백없이): ");String dateTime = scan.next();

            String new_Car = "\n" + location + "," + carNumber + "," + dateTime;

            return new_Car;
            }
        }
        



// ③ 출차 처리
// 기능: 출차할 차량 번호를 입력받아 해당 차량의 행을 carParkingList에서 삭제합니다.
// 입력: carNumber (출차할 차량번호)
// 반환: 해당 차량이 제거되고 줄바꿈이 올바르게 정리된 갱신된 carParkingList 문자열
// 기본 정책: 최초 30분 무료추가 요금: 30분 초과 시, 10분당 1,000원 (10분 단위 절상/올림 계산)
// 예: 31분 ~ 40분 주차 -> 1,000원   
// 예: 41분 ~ 50분 주차 -> 2,000원
// 일일 최대 요금: 24시간(1일)당 최대 20,000원여러 날에 걸쳐 주차한 경우, 
// 각 일자 단위로 계산 후 합산하거나 총 일수×20,000원 + 잔여시간 요금(최대 20,000원)을 적용합니다.
    public static String delete_car(String carParkingList){
        System.out.print("출차할 차량 번호입력: "); String carNumber = scan.next();
        String[] carList = carParkingList.split("\n");
        boolean find = false;

        for(String car : carList){
            String[] ary = car.split(",");
            if(ary[1].equals(carNumber)){
                find = true;
                int year = Integer.parseInt(ary[2].substring(0, 4));
                int month = Integer.parseInt(ary[2].substring(4, 6));
                int day = Integer.parseInt(ary[2].substring(6, 8));
                int hour = Integer.parseInt(ary[2].substring(8, 10));
                int minute = Integer.parseInt(ary[2].substring(10, 12));
                
                LocalDateTime inTime = LocalDateTime.of(year, month, day, hour, minute);
                LocalDateTime outTime = LocalDateTime.now();

                long totalMinutes = Duration.between(inTime, outTime).toMinutes();

                // 주차요금
                long totalFee = 0;
                if(totalMinutes > 30){
                    // 하루 미만
                    if(totalMinutes < 1440){
                        totalFee = ((totalMinutes - 30 + 9) / 10) * 1000;
                        if(totalFee > 20000){totalFee = 20000;}
                    }else{ // 하루 이상
                        long days = totalMinutes / 1440;
                        long remainMinutes = totalMinutes % 1440;
                        // 하루당 20,000원
                        totalFee = days * 20000;

                        // 남은 시간 계산
                        if(remainMinutes > 30){
                            long remainFee = ((remainMinutes - 30 + 9) / 10) * 1000;
                            if(remainFee > 20000){ remainFee = 20000;}
                            totalFee += remainFee; }
                    }
                }else{ totalFee = 0; }
                // =========================
                // 출차 정보 출력
                // =========================

                System.out.println("===== 출차 안내 =====");
                System.out.println("주차 위치 : " + ary[0]);
                System.out.println("차량 번호 : " + ary[1]);
                System.out.println("입차 시간 : " + inTime);
                System.out.println("출차 시간 : " + outTime);
                System.out.println("주차 시간 : " + totalMinutes + "분");
                System.out.println("주차 요금 : " + totalFee + "원");


                // =========================
                // 차량 정보 삭제
                // 첫 번째 차량인 경우
                if(carParkingList.startsWith(car)){
                    carParkingList = carParkingList.replace(car + "\n", "");
                }else{
                    // 두 번째 이후 차량인 경우
                    carParkingList =carParkingList.replace("\n" + car, "");}
                System.out.println("출차 완료");
                break;
            }
        }
        // 차량이 존재하지 않는 경우
        if(find == false){System.out.println("미등록 차량입니다.");}

        // 변경된 주차목록 반환
        return carParkingList;
    }
                                
        



}



