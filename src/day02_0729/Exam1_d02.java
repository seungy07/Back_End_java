package day02_0729;

public class Exam1_d02 {
    public static void main(String[] args) {

        // === 다형성(상속/인터페이스) : 하나의 자료가 다양한 형태/모양 가진다. ===
        // [1] 자동(묵시적) 타입 변환 : byte -> short -> int -> long -> float -> double, 작은거 -> 큰것
        byte bytevalue = 100;  // byte 타입에 bytevalue 변수명으로 100리터럴 대입
        short shortvalue = bytevalue; // [가능] byte -> short [*자료유지, 타입변경]
        int intvalue = shortvalue; // [가능] short -> int [*자료유지, 타입변경]
        long longvalue = intvalue; // [가능] int -> long [*자료유지, 타입변경]
        float floatvalue = longvalue; // [가능] long -> float [*자료유지, 타입변경]
        double doublevalue = floatvalue; //[가능] float -> double [*자료유지, 타입변경]

        // * 연산(계산) 중에 자동 타입변환, byte/short 연산결과는 항상 => int ,  두 항 중에 더 큰 타입으로 결과 반환
        byte b1 = 10; byte b2 = 20; int r1 = b1 + b2 ; // byte + byte => int
        short s1 = 30; int i1 = 40; int r2 = b2 + s1; // byte + short => int
        int r3 = i1 + i1; //int +int => int
        long l1 = 50L;  long r4 = i1 + l1; // int + long => long (더 큰 타입으로 결과 반환)
        float f1 = 60.1f; float r5 = i1 +f1; // int + float => float
        double d1 =70.2; double r6 = i1 + d1; // int + double => double

        // [2] 강제(명시적) 타입 변환 : byte <- short <- int <- long <- float <- double, 큰거 -> 작은거, *자료 손실 발생*
        double dvalue = 3.14;
        float fvalue = (float)dvalue; // [불가능], 자료앞에 (변환할타입) <-강제 타입변환 
        long lvalue = (long)fvalue;  // 3.14 -> 3 *자료 손실
        int ivalue = (int)lvalue;
        short svalue = (short)ivalue;
        byte bvalue = (byte)svalue; 
        

        
    }

}
