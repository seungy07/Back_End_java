package day25_0810;

import java.util.ArrayList;
import java.util.Scanner;


public class java_p11 {
    public static void main(String[] args) {
    
    // [문제 1] String 타입의 요소를 저장할 수 있는 ArrayList를 nameList 라는 이름으로 생성하세요.
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("유재석"); nameList.add("강호동"); nameList.add("신동엽");
        System.out.println(nameList);

    // [문제 2] 다음과 같이 초기화된 ArrayList가 있습니다.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
        for(int i=0; i<= fruits.size()-1 ; i++){ System.out.printf( "인덱스 %d: %s\n" , i ,fruits.get(i) );}

    // [문제 3] 문제 3의 fruits 리스트를 사용합니다.
        for(String str : fruits){System.out.println(str);}

    // [문제 4] "A", "B", "C", "D", "E"를 요소로 가지는 ArrayList를 생성하세요.
        ArrayList<String> cha = new ArrayList<>();
        cha.add("A"); cha.add("B"); cha.add("C"); cha.add("D"); cha.add("E");
        cha.remove(2); System.out.println(cha);
    
    // [문제 5] "자바", "파이썬", "C++"를 요소로 가지는 ArrayList를 생성하세요.
        ArrayList<String> 문제5 = new ArrayList<>();
        문제5.add("자바"); 문제5.add("파이썬"); 문제5.add("C++");
        문제5.add(1,"자바스크립트");
        System.out.println(문제5);

    // [문제 6] title(문자열)과 author(문자열) 멤버 변수를 가진 Book 클래스를 만드세요.
        Book book1 = new Book("자바", "몰라1"); Book book2 = new Book("파이썬", "몰라2"); Book book3 = new Book("C++", "몰라3");
        ArrayList<Book> library = new ArrayList<>();
        library.add(book1); library.add(book2); library.add(book3);  
        for(Book book : library){System.out.println("제목: " + book.title + " 작가: "+ book.author);}

    // [문제 7] Scanner를 사용하여 사용자로부터 문자열을 계속해서 입력받습니다.
        Scanner scan = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        for(;;){
            System.out.print("문자열 입력: "); String str = scan.next();
            if( str.equals("종료") ){
                System.out.println(arrayList);
                break;
            }else{ arrayList.add(str); }
        }

    // [문제 8] "국어", "수학", "사회", "과학"을 요소로 가지는 ArrayList를 생성하세요.
        ArrayList<String> aList = new ArrayList<>();
        aList.add("국어"); aList.add("수학"); aList.add("사회"); aList.add("과학");
        aList.set(1,"영어");
        System.out.println(aList);


    }
    
}
// [문제 6] title(문자열)과 author(문자열) 멤버 변수를 가진 Book 클래스를 만드세요.
class Book{
    String title;  String author;
    // private 시 getter 이용도 가능
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}