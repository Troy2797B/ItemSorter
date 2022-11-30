package rocks.zipcode.io;

import java.util.*;

/**
 * @author leon on 30/01/2019.
 */
//TROY: To use Collections sort(List,Comparator) , you need to create a class that
// implements Comparator Interface, and code for the compare() in it,
// through Comparator Interface
//    You can do something like this:
//
//class StudentComparator implements Comparator
//{
//    public int compare (Student s1 Student s2)
//    {
//        // code to compare 2 students
//    }
//}
//To sort do this:
//
// Collections.sort(List,new StudentComparator())

public class ItemSorter implements Comparator<Item>{
    Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        ArrayList<Item> sorted = new ArrayList<Item>(Arrays.asList(items));
        Collections.sort(sorted, comparator);
        return sorted.toArray(sorted.toArray(new Item[0]));


//        ArrayList<Item> sorted = new ArrayList<Item>(Arrays.asList(items));
//        for(Item n : sorted){
//            comparator.compare(n, );
//
//        }

//        Item[] sorted = new Item[3];
//        int result = comparator.compare(items[1], items[2]);
//        if (result == -1)
//
//        return items;
    }
    public int compare(Item o1, Item o2) {
        return 0;
    }
}
