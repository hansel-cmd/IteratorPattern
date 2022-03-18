package iterator_pattern_approach;



public class Main {

    public static void main(String[] args) {
	// write your code here

        ZestiriaInventory zestiriaInventory = new ZestiriaInventory();
        Iterator zestiriaInventoryIterator = zestiriaInventory.getIterator();

        BerseriaInventory berseriaInventory = new BerseriaInventory();
        Iterator berseriaInventoryIterator = berseriaInventory.getIterator();

        print(zestiriaInventoryIterator);
        print(berseriaInventoryIterator);

    }

    public static void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
