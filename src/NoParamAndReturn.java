import java.util.Random;

interface Generator {
    int rand(); // 매개변수 없는 메소드
}

public class NoParamAndReturn {
    public static void main(String[] args) {
        Generator gen = () -> {
            Random rnad = new Random();
            return rand.nextInt(50);
        };

        System.out.println(gen.rand());
    }
}
