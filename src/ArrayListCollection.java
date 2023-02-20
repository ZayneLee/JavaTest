import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayListCollection {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();
        // Iterator<String> itr = list.iterator();
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);

        ListIterator<String> litr = list.listIterator();

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
