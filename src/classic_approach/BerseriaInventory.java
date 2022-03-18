package classic_approach;

import java.util.ArrayList;

public class BerseriaInventory {

    ArrayList<InventoryItem> inventoryItem;

    public BerseriaInventory() {

        this.inventoryItem = new ArrayList<InventoryItem>();

        InventoryItem item1 = new InventoryItem("Item A", "Lorem Ipsum Dolor", RarityLevel.COMMON, 64.0f, 12.2f);
        InventoryItem item2 = new InventoryItem("Item B", "Lorem Ipsum Dolor", RarityLevel.UNCOMMON, 44.0f, 42.2f);
        InventoryItem item3 = new InventoryItem("Item C", "Lorem Ipsum Dolor", RarityLevel.LEGENDARY, 114.0f, 22.2f);

        this.addItem(item1);
        this.addItem(item2);
        this.addItem(item3);

    }

    public void addItem(InventoryItem item) {
        this.inventoryItem.add(item);
    }

    public ArrayList<InventoryItem> getInventoryItem() {
        return this.inventoryItem;
    }

    @Override
    public String toString() {
        return "BerseriaInventory{" +
                "inventoryItem=" + inventoryItem +
                '}';
    }
}
