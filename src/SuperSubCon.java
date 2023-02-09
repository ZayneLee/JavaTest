class SuperCLS {
    public SuperCLS() {
        System.out.println("Con:SuperCLS()");
    }

    public SuperCLS(int i) {
        System.out.println("Con:SuperCLS(int i)");
    }

    public SuperCLS(int i, int j) {
        System.out.println("Con:SuperCLS(int i,int j)");
    }
}

class SubCLS extends SuperCLS {
    public SubCLS (){
        System.out.println("Con:SubCLS()");
    }

    public SubCLS(int i) {
        super(i);
        System.out.println("Con:SubCLS(int i)");
    }

    public SubCLS(int i, int j) {
        super(i, j);
        System.out.println("Con:SubCLS(int i, int j)");
    }
}

public class SuperSubCon {
    public static void main(String[] args) {
        new SubCLS(1,2);
    }
}
