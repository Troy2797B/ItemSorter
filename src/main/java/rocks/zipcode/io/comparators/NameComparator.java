package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
//        if(o1.getName() == o2.getName()){
//            return 0;
//        } else if (o1.getName() > o2.getName()){
//            return 1;
//        } else {
//            return -1;
//        }
    }

}
