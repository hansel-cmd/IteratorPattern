package iterator_pattern_approach;

public class ZestiriaInventoryIterator implements Iterator {

    private InventoryItem[] inventoryItems;
    private int currentElement = 0;

    public ZestiriaInventoryIterator(InventoryItem[] inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    @Override
    public boolean hasNext() {
        return this.currentElement < this.inventoryItems.length && this.inventoryItems[this.currentElement] != null;
    }

    @Override
    public Object next() {
        return this.inventoryItems[this.currentElement++];
    }
}
