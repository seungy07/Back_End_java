package day33_0821;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class exam2 {
    public static void main(String[] args) {
        
        /*
            스택(stack): 후입선출( LIFO: 가장 마지막에 삽입된 자료가 가장 먼저 삭제된다. )
            - 예] 브라우저(뒤로가기), CTRL+Z(실행취소)
            - Stack 클래스 이용한 구현, .push삽입 , pop출력
        */
       Stack<String> stack = new Stack<>();  // 스택 메모리 만든다.
       stack.push("naver page");
       stack.push("news page");
       stack.push("blog");  // input: naver page -> news -> blog 
       while ( !stack.isEmpty() ) { // ! :부정문, !변수명.isEmpty( ), 비어있으면 반복문종료
            System.out.println( stack.pop() );
       }

        /*
            큐(Queue): 선입선출( FIFO: 가장 먼저 삽입된 자료가 가장먼저 삭제)
            예] 번호표(웨이팅), 프린트
            - LinkedList 클래스 이용한 구현, offer입력, poll()출력
        */
       Queue<String> queue= new LinkedList<>();
       queue.offer("1번 손"); queue.offer("2번 손"); queue.offer("3번 손");
       while ( !queue.isEmpty() ) { 
            System.out.println( queue.poll() );
       }


    }
    
}
