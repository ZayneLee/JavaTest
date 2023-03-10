interface Printable {
    void print(String s); // 매개변수 하나, 반환형 void
}

public class OneParamNoReturn {
    public static void main(String[] args) {
        Printable p;

        // 줄임 없는 표현
        p = (String s) -> {
            System.out.println(s);
        };
        p.print("Lambda exp one.");

        // 중괄호 생략
        p = (String s) -> System.out.println(s);
        p.print("Lambda exp two.");

        // 매개변수형 생략
        p = (s) -> System.out.println(s);
        p.print("Lambda exp three.");

        // 매개변수 소괄호 생략
        p = s -> System.out.println(s);
        p.print("Lambda exp four.");
    }
}
