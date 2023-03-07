import java.util.Optional;

public class StringOptional1 {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of(new String("Toy1"));
        Optional<String> os2 = Optional.ofNullable(new String("Toy2"));

        if (os1.isPresent()) { // 내용물 존재하면 isPresent는 true 반환
            System.out.println(os1.get());
        }

        if (os2.isPresent()) {
            System.out.println(os2.get());
        }
        // 람다식 버전
        os1.ifPresent(s -> System.out.println(s));

        // 메소드 참조 버전
        os2.ifPresent(System.out::println);
    }
}
