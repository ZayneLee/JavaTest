import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort {
    public void sort(List<?> lst) {
        Collections.reverse(lst);
    }
}

public class ArrangeList3 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);
        JustSort js = new JustSort();

        // Consumer<List<Integer>> c = e -> js.sort(e);

        /*
         * 위 람다식은 다음의 메소드 참조로 대신할 수 있다.
         */

        Consumer<List<Integer>> c = js::sort;
        c.accept(ls);
        System.out.println(ls);
    }
}
