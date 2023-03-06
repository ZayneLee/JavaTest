import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);

        // Consumer<List<Integer>> c = l -> Collections.reverse(l);

        /*
         * 위 람다식을 다음과 같이 메소드 참조 형태로 만들 수 있다.
         */

        Consumer<List<Integer>> c = Collections::reverse;
        c.accept(ls);
        System.out.println(ls);
    }
}
