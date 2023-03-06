import java.util.function.ToIntBiFunction;

class IBox {
    private int n;

    public IBox(int i) {
        n = 1;
    }

    public int larger(IBox b) {
        if (n > b.n) {
            return n;
        } else {
            return b.n;
        }
    }
}

public class NoObjectMethodRef {
    public static void main(String[] args) {
        IBox ib1 = new IBox(5);
        IBox ib2 = new IBox(7);

        // 두 상자에 저장된 값 비교하여 더 큰값 반환
        // ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(ib2);

        /*
         * 위 람다식은 다음의 메소드 참조로 대신할 수 있다.
         */

        ToIntBiFunction<IBox, IBox> bf = IBox::larger;
        int bigNum = bf.applyAsInt(ib1, ib2);
        System.out.println(bigNum);
    }
}
