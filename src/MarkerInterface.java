interface Upper {
}

interface Lower {
}

interface Printable {
    String getContents();
}

class Report implements Printable, Upper {
    String cons;

    Report(String cons) {
        this.cons = cons;
    }

    public String getContents() {
        return cons;
    }
}

class Printer {
    public void printContents(Printable doc) {

        if (doc instanceof Upper) {
            System.out.println((doc.getContents()).toUpperCase());
        } else if (doc instanceof Lower) {
            System.out.println((doc.getContents()).toLowerCase());
        } else
            System.out.println(doc.getContents());
    }
}

public class MarkerInterface {
    public static void main(String[] args) {
        Printer prn = new Printer();
        Report doc = new Report("Simple Funny News~");
        prn.printContents(doc);
    }
}

// public abstract class House { // 추상 클래스

// public void methodOne() {
// System.out.println("method one");
// }

// public abstract void methodTwo(); // 추상 메소드