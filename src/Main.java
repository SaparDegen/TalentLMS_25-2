import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<City> treeSet = new TreeSet<>(Comparator.comparing(City::getCode));
        treeSet.add(new City(457864,"Sydney", "Australia", 4504469));
        treeSet.add(new City(585426,"Buenos Aires", "Argentina", 2891082));
        treeSet.add(new City(325782,"Prague", "Czech", 1257158));
        treeSet.add(new City(814267,"Warsaw", "Poland", 1720398));
        treeSet.add(new City(933575,"Kuala Lumpur", "Malaysia", 1809699));

        Iterator<City> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}