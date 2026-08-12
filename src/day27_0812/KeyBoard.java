package day27_0812;

// 인터페이스는 방법의 규칙만
public interface KeyBoard {
    // 폴더 -> new java file -> interface 생성
    // 1. 상수, 초기값 필수
        public static final String info = "인텔";
        String date = "2026-08-12";
    // 2. 추상 메소드, { } 생략한 선언부만 작성;
        public abstract void aKey();
        int bKey( int x ); // public abstract 생략 가능 -> 기본값

}
