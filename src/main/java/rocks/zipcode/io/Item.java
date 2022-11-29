package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
//MAKE NEW CLASSES SUCH AS IDCOMPARATOR IMPLEMENTS COMPARATOR, NAME ETC...
public class Item implements Comparator<Item>{
    Long id;
    String name;
    Double price;
    public Item() {
        name = "";
        id = 0l;
        price = 0.01;
    }

    public Item(Long id, String name, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {this.price = price;
    }

    public int compare(Item o1, Item o2) {
        if(o1.getId() == o2.getId()){
            return 0;
        } else if (o1.getId() > o2.getId()){
            return 1;
        } else {
            return -1;
        }
    }
}
