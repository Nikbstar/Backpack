import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Book", 1, 600));
        items.add(new Item("Binoculars", 2, 5000));
        items.add(new Item("First-aid kid", 4, 1500));
        items.add(new Item("Notebook", 2, 40000));
        items.add(new Item("Cauldron", 1, 500));

        Backpack backpack = new Backpack(8);
        backpack.makeAllSets(items);
        System.out.println(items);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(backpack.getBestItems());
    }

}
