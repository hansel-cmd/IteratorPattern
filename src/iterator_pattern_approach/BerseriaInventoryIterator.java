package iterator_pattern_approach;

import java.util.ArrayList;

public class BerseriaInventoryIterator implements Iterator {

    ArrayList<InventoryItem> inventoryItems;
    private int currentElement = 0;

    public BerseriaInventoryIterator(ArrayList<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    @Override
    public boolean hasNext() {
        return this.currentElement < this.inventoryItems.size();
    }

    @Override
    public Object next() {
        return this.inventoryItems.get(this.currentElement++);
    }
}
