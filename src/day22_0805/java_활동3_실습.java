package day22_0805;

import java.util.Scanner;

class Post{
    String content; String writer;
    Post(){}
    Post(String content, String writer){
        this.content = content; this.writer = writer;
    }
}

public class java_활동3_실습 {
    public static void main(String[] args) {
        Post[] posts = new Post[100];  // 객체들 저장ㅎㄹ 배열  
        Scanner scan = new Scanner(System.in);
        // 번호 선택  입력 or 출력 
        for(;;){
            System.out.println("=============================");
            System.out.println(" 1. 게시물쓰기  2.게시물보기 ");
            System.out.println("==========================");
            System.out.print("번호 선택>");
            int ch = scan.nextInt();
            // 1 쓰기 선택시
            if( ch==1 ){
                scan.nextLine();
                System.out.print("내용: ");
                String content = scan.nextLine(); // 줄 모두 입력 문자열
                System.out.print("작성자: ");
                String writer = scan.nextLine();

                boolean r = false;
                Post post = new Post(content, writer);
                // 배열의 빈곳의 찾고 저장
                for(int i=0; i <= posts.length-1; i++ ){
                    if(posts[i] == null){
                        posts[i] = post;
                        r = true;
                        break;
                    }
                }
                if(r){ // 저장 메세지
                    System.out.println("저장 성공");
                }else{System.out.println("저장 실패");}
            }

            // 2 보기 선택시
            if( ch==2){
                for(Post post: posts){
                    if(post != null){
                        System.out.printf("작성자: %s 내용: %s\n", post.writer, post.content);
                    }
                }
            }
            
            
        }


    }

}
