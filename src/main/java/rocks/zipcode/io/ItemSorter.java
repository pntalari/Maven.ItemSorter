package rocks.zipcode.io;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] item = new Item[0];
    Item obj;

    public ItemSorter(Item[] items) {
        this.item = items;

    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(this.item,comparator);
        return item;
    }

//    @Override
//    public int compare(Item o1, Item o2) {
//        return (int)(o1.getId()-o2.getId());
//    }
}
