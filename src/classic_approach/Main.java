package classic_approach;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ZestiriaInventory zestiriaInventory = new ZestiriaInventory();
        InventoryItem[] zestiriaInventoryItems = zestiriaInventory.getInventoryItems();
        print(zestiriaInventoryItems, zestiriaInventory.getNumberOfItems());

        BerseriaInventory berseriaInventory = new BerseriaInventory();
        ArrayList<InventoryItem> berseriaInventoryItems = berseriaInventory.getInventoryItem();
        print(berseriaInventoryItems);
    }

    public static void print(InventoryItem[] inventoryItems, int numberOfItems) {
        for (int i = 0; i < numberOfItems; i++)
            System.out.println(inventoryItems[i]);
    }

    public static void print(ArrayList<InventoryItem> inventoryItems) {
        for (int i = 0; i < inventoryItems.size(); i++)
            System.out.println(inventoryItems.get(i));
    }
}
