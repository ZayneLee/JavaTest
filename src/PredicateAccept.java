import java.util.function.Consumer;
import java.util.function.Function;

public class PredicateAccept {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello");

        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Hello"));
    }
}
