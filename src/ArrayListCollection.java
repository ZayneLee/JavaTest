import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

public class ArrayListCollection {

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        list.sort(null);
    }

    // public static <T> int binarySearch(List<? extends Comparable<? super T>>
    // list, T key, Comparator<? super T> c)

    // public static <T> void copy(List<? super T> dest, List<? extends T> src)

    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();
        // Iterator<String> itr = list.iterator();
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);

        ListIterator<String> litr = list.listIterator();

        list.sort(null);

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        for (String s : list) {
            System.out.print(s + '\t');
        }

        for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + '\t');
        }

        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + '\t');
        // System.out.println();
        // }

        // list.remove(0);

        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + '\t');
        // System.out.println();
        // }

    }
}
