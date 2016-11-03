package cen4270.fakes;

import cen4270.clients.Inventory;
import cen4270.models.Item;

public class InventoryFake implements Inventory {
    private Item item;

    public InventoryFake(Item item) {
        this.item = item;
    }

    public Item getItem(String itemID) {
        return item;
    }
}
