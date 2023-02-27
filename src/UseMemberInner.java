interface Printable {
    void print();
}

class Papers {
    private String con;

    public Papers(String s) {
        con = s;
    }

    public Printable getPrinter() {
        class Printer implements Printable {
            public void print() {
                System.out.println(con);
            }
        }
        return new Printer();
    }

    private class Printer implements Printable {
        public void print() {
            System.out.println(con);
        }
    }
}

public class UseMemberInner {
    public static void main(String[] args) {
        Papers p = new Papers("Content : I'm Happy");
        Printable prn = p.getPrinter();
        prn.print();
    }
}
