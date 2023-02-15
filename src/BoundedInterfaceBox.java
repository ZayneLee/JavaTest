interface Eatable {
    public String eat();
}

class Apple implements Eatable {
    public String toString() {
        return "I am an apple.";
    }

    @Override
    public String eat() {
        return "It tastes so good!";
    }
}

class Box<T extends Eatable> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    // 한입 먹고 반환하는 행위의 메소드로 수정
    public T get() {
        System.out.println(ob.eat()); // Eatable로 제한했기 때문에 호출 가능
        return ob;
    }
}

public class BoundedInterfaceBox {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.set(new Apple());

        Apple ap = box.get();
        System.out.println(ap);
    }
}