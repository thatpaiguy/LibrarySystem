import java.util.*;

public class ItemDatabase {
    LinkedList<Item> itemList;
    public ItemDatabase() {
        itemList = new LinkedList<Item>();
    }
    public void addItem(Item item) {
        for(int i = 0; i < itemList.size();i++) {
            itemList.get(i).setNumCopies(itemList.get(i).getNumCopies()+1);
        }
        itemList.add(item);
    }

    public void removeUser(Item item) {
        if(itemList.contains(item)) {
            itemList.remove(item);
        }
        else {
            System.out.println("This item does not exist");
        }
    }
    public Item atIndex(int i) {
        if(i > itemList.size()) {
            System.out.println("This index is greater than the database size");
            return null;
        }
        return itemList.get(i);
    }
    public int size() {
        return itemList.size();
    }
}
