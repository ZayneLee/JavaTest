import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQuese {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();

        // 데이터 저장
        que.offer("Box");
        que.offer("Toy");
        que.offer("Robot");

        // 다음에 무엇이 나올지 확인
        System.out.println("next : " + que.peek());

        // 첫번째, 두번째 인스턴스 꺼내기
        System.out.println(que.poll());
        System.out.println(que.poll());

        // 다음에 무엇이 나올지 확인
        System.out.println("next : " + que.peek());

        // 마지막 인스턴스 꺼내기
        System.out.println(que.poll());
    }
}
