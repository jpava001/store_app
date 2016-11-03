package cen4270.clients;

import cen4270.models.Item;

public interface Inventory {
    public Item getItem(String itemID);
}
