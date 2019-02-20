package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    public int compare(Item o1, Item o2) {
        int comp = o1.getId().compareTo(o2.getId());
          
        return comp;
    }
}
