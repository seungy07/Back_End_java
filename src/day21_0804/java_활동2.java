package day21_0804;
class Book {
  String title;
  // 생성자: 객체 생성 시 전달받은 도서 제목(title)으로 멤버변수(필드)를 초기화합니다.
  Book(String title) { this.title = title; } 
}
public class java_활동2 {
    public class Main {

  public static void main(String[] args) {
    Book b1 = new Book("Java Basics");  // 인스턴스 생성1
    Book b2 = new Book("OOP Concepts");  // 인스턴스 생성2
    Book[] library = new Book[3]; // 인스턴스 생성3 [] 배열로

    library[0] = b1;
    library[1] = new Book("Data Structure");  // 인스턴스 생성4 livrary[0,1] 에 1번째 인덱스에 생성

    Book b3 = library[1];  //인스턴스 생서4 livrary[0,1] 에 1번째 인덱스에 생성
    b2 = library[0]; // 값을 뒤집어 씀  b2가 b1을 
    Book[] archive = library; // library 배열을 참조하여 이름만 바뀐 배열 생성
    archive[2] = new Book("Algorithm"); // 인스턴스생성5 [0,1,2] 에 인덱스2의 생성

    library[0] = null; //  [null, ] 값으로 존재 
    b1 = null; // b1 삭제

    // ===== 프로그램 실행 종료 직전 (Final State) =====
    // 제시된 코드에서 총 인스턴스는 몇개 만들어졌고 main함수가 종료 되기 전 유효 한 인스턴스는 몇 개 이고 몇개가 사라졌을까?
    /* 인스턴스는 생성은 총5번 b1, b2 libray[], libray[1], archive[2]
    삭제는 b1 총1개 삭제 유효한 값은 5개
    
    */
  }

}

}
