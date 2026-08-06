package day22_0805;

import java.util.Scanner; // Scanner 입력 import 부분


// 1. 화면에 대한 스케치(피그마 / 프로토타입)
// 2. 메모리/설계
// 3. 기능 설계

class Post { //post 클래스 
    String content;
    String writer;

    public Post() {} // 기본 생성자 생성
    public Post(String content, String writer) { // 매개 변수 활용 생성자 생성
        this.content = content;
        this.writer = writer;
    }
}

public class java_활동3 {
    public static void main(String[] args) { // 메인 실행 부분

    Post[] posts = new Post[100];  // 게시글 저장 부분

    Scanner scan = new Scanner(System.in); // 값 입력 부분

        for (;;) { // 무한루프 게시물쓰기 출력 반복
            System.out.println("============ My Community ============ ");
            System.out.println("1.게시물쓰기 2.게시물출력");
            System.out.println("====================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt(); // 1,2 번호 선택 값 저장

            if (ch == 1) { // 1.게시물쓰기를 고를떄  게시물 쓰기 부분
                scan.nextLine();
                System.out.print("내용 : ");
                String content = scan.nextLine(); // 모든 줄 문자열 입력
                System.out.print("작성자 : ");
                String writer = scan.nextLine(); // 모든 줄 문자열 입력

                Post post = new Post(content, writer);  // 내용과 작성자를 멤버변수의 적용 인스턴스 생성
                boolean result = false; // 

                for (int index = 0; index <= posts.length - 1; index++) { // posts 배열의 보기
                    if (posts[index] == null) { // 빈곳에 저장
                        posts[index] = post; // [ new post(), new post(),.. ] 이런식으로 만드는 것 각각을 객체로 만듬
                        result = true; // 저장성공 결과
                        break; // 배열 돌아보는 부분 탈출
                    }
                }

                if (result) { // 저장 성공인지 메세지 출력
                    System.out.println("[안내] 글쓰기 성공");
                } else {
                    System.out.println("[안내] 글쓰기 실패");
                }

            } else if (ch == 2) { // 게시물 보기 부분(출력)
                for (Post post : posts) { // 향상된 포문으로 배열 자료를 순서대로 하나씩 Post 클래스 객체 저장
                    if (post != null) { // 비어있지 않으면 출력
                        System.out.printf("작성자 : %s , 내용 : %s \n", post.writer, post.content);
                    }
                }
            }
            
        }
        
    }}


