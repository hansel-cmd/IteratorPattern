package iterator_pattern_approach;

public class ZestiriaInventory implements Inventory {

    private static final int MAX_ITEMS = 10;
    private InventoryItem[] inventoryItems;
    private int numberOfItems = 0;

    public ZestiriaInventory() {
        this.inventoryItems = new InventoryItem[this.MAX_ITEMS];

        InventoryItem item1 = new InventoryItem("Item 1", "Lorem Ipsum Dolor", RarityLevel.COMMON, 64.0f, 12.2f);
        InventoryItem item2 = new InventoryItem("Item 2", "Lorem Ipsum Dolor", RarityLevel.UNCOMMON, 44.0f, 42.2f);
        InventoryItem item3 = new InventoryItem("Item 3", "Lorem Ipsum Dolor", RarityLevel.LEGENDARY, 114.0f, 22.2f);
        InventoryItem item4 = new InventoryItem("Item 4", "Lorem Ipsum Dolor", RarityLevel.RARE, 24.0f, 29.2f);
        InventoryItem item5 = new InventoryItem("Item 5", "Lorem Ipsum Dolor", RarityLevel.LEGENDARY, 114.0f, 32.2f);

        this.addItem(item1);
        this.addItem(item2);
        this.addItem(item3);
        this.addItem(item4);
        this.addItem(item5);
    }

    public void addItem(InventoryItem item) {
        if (this.numberOfItems >= this.MAX_ITEMS)
            System.out.println("Hello world");
        else
            this.inventoryItems[this.numberOfItems++] = item;
    }


    @Override
    public Iterator getIterator() {
        return new ZestiriaInventoryIterator(this.inventoryItems);
    }
}