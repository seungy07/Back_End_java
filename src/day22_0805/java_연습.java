package day22_0805;

import java.util.Scanner;

class Post{
    String content; String writer;
    Post(){}
    Post(String content, String writer){
        this.content=content; this.writer=writer;
    }
}

public class java_연습 {
    public static void main(String[] args) {
        Post[] posts = new Post[100];

        Scanner scan = new Scanner(System.in);

        for(;;){
            System.out.println("============================");
            System.out.println("1. 게시물쓰기 , 2. 게시물 보기");
            System.out.println("============================");
            System.out.print("번호 선택>");
            int ch = scan.nextInt();

            if(ch == 1){
                scan.nextLine();
                System.out.print("내용: ");
                String content = scan.nextLine();
                System.out.print("작성자: ");
                String writer = scan.nextLine();
                
                boolean r = false;
                Post post = new Post(content, writer); 

                for(int i=0; i<=posts.length-1;i++){
                    if(posts[i] == null){ // 빈곳을 찾고 빈곳에 저장
                        posts[i] = post;
                        r = true;
                        break; 
                    }  
                }
                if(r == true){
                    System.out.println("저장 성공");
                }else{System.out.println("저장실패");}

            }else if(ch==2){
                for( Post post : posts){
                    if(post != null)
                     System.out.printf("내용: %s 작성자: %s\n", post.content, post.writer);}
            }

            
            
        }
        
    }

}
