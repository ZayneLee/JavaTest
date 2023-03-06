interface SMaker {
    String make(char[] ar);
}

public class StringMaker {
    public static String chsToString(char[] a, SMaker m) {
        return m.make(a);
    }

    public static void main(String[] args) {
        // SMaker sm = (ar) -> {
        // return new String(ar);
        // };

        /*
         * 위 람다식을 다음의 메소드 참조로 대신할 수 있다.
         */

        SMaker sm = String::new;

        char[] src = { 'R', 'o', 'b', 'o', 't' };
        String str = chsToString(src, sm);
        System.out.println(str);
    }
}
