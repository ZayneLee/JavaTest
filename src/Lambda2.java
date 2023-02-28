interface Printable {
    void print(String s);
}

public class Lambda2 {
    public static void main(String[] args) {
        Printable prn = new Printable() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        prn.print("What is Lambda?");
    }
}
