package day24_0807;
/*
    OverallController : 입력 Scanner/출력Print 담당 하는 클래스 용도(MVC패턴-VIEW)
    OveralRepository : 자료들의 저장소 및 관리 (MVC패턴 - model) / 데이터베이스
    Post : 자료들의 모델 / 타입  
*/
import java.util.Scanner;
public class OverallController {
    public static void main(String[] args) {
        OverallRepository repository = new OverallRepository(); // 중복되는 코드 밖으로 뺌 if 문 안에서
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("============ My Community ============ ");
            System.out.println("1.게시물쓰기 2.게시물출력");
            System.out.println("====================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt();

            if (ch == 1) {
                scan.nextLine();
                System.out.print("내용 : ");     String content = scan.nextLine();
                System.out.print("작성자 : ");   String writer = scan.nextLine();

                Post post = new Post(content, writer);
                boolean result = repository.save(post);

                if (result) { System.out.println("[안내] 글쓰기 성공");} 
                else { System.out.println("[안내] 글쓰기 실패"); }

            } else if (ch == 2) {
                Post[] posts = repository.findAll();
                for (Post post : posts) {
                    if (post != null) {
                        System.out.printf("작성자 : %s , 내용 : %s \n", post.writer, post.content);
                    }
                }
            }
        }
    }
}
// 데이터 저장 및 반환(조회) 비즈니스 로직 전담 클래스
class OverallRepository {  // DB 대신 사용
    // DB 대신에 배열 이용한 여러개 자료 저자 용도
    Post[] posts = new Post[100]; 

    // 1. 게시물 저장
    boolean save(Post post) { // 저장
        for (int index = 0; index < posts.length; index++) {
            if (posts[index] == null) {
                posts[index] = post;
                return true;
            }
        }
        return false;
    }
    // 게시물 전체 목록 반환 // 2. 전체 출력
    Post[] findAll() {  // 게시물 전체 반환
        return posts;
    }
}
class Post {
    String content;
    String writer;
    Post() {}   // 관례적 넣는 법
    Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}


