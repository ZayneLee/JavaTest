public class ExceptionMessage {
    public static int md1(int n) {
        return md2(n,0);
    }
    public static int md2(int n1, int n2) {
        int r = n1/n2;
        return r;
    }
    public static void main(String[] args) {
        System.out.println(md1(3));
    }
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at ExceptionMessage.md2(ExceptionMessage.java:6)
    at ExceptionMessage.md1(ExceptionMessage.java:3)
    at ExceptionMessage.main(ExceptionMessage.java:10)

위 소스코드를 실행 했을 때의 실행 결과 화면이다.
ArithmeticException이 발생했다는 것을 확인할 수 있고,
ExceptionMessage 클래스의 md2 메소드(line: 6)에서 시작 되었고
md1 → main으로 예외가 넘어간 것을 볼 수 있다.
 */