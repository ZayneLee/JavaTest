// class Box<T> {
// protected T ob;

// public void set(T o) {
// ob = o;
// }

// public T get() {
// return ob;
// }

// public static void peekBox(Box<?> box) {
// System.out.println(box);
// }

// public static void inBox(Box<Toy> box, Toy n) {
// box.set(n);
// Toy myToy = box.get();
// }
// }

// class SteelBox<T> extends Box<T> {
// public SteelBox(T o) {
// ob = o;
// }
// }

// public class GenericInheritance {
// public static void main(String[] args) {
// Box<Integer> iBox = new SteelBox<>(1234);
// Box<String> sBox = new SteelBox<>("Hello");

// System.out.println(iBox.get());
// System.out.println(sBox.get());
// }
// }
