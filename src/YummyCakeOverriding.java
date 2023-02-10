class Cake {
    public void yummy() {
        System.out.println("Yummy Cake");
    }
}

class CheeseCake extends Cake {
    @Override
    public void yummy() {
        super.yummy();
        System.out.println("Yummy Cheese Cake");
    }

    public void tasty() {
        super.yummy();
        System.out.println("Yummy Tasty Cake");
    }
}


public class YummyCakeOverriding {
    public static void main(String[] args) {
        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy();
        c2.yummy();
    }
}

class Something {
    public void func(int n) {}
}

class Simple extends Something {
    @Override
    public final void func(int n) { }
}