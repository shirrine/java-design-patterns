package com.shirrine.patterns.foobarmv.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * An assembly of parts.
 *
 * @author Shirrine
 */
public class Assembly extends Item {

    private List<Item> items;

    /**
     * Creates an assembly with a description and cost.
     *
     * @param description the item description
     */
    public Assembly(final String description) {
        super(description, 0);
        items = new ArrayList<Item>();

    }

    /**
     * Adds an item.
     *
     * @param item the item to be added
     */
    @Override
    public void addItem(final Item item) {

        items.add(item);
    }

    /**
     * Removes an item.
     *
     * @param item the item to be removed
     */
    public void removeItem(final Item item) {

        items.remove(item);
    }

    /**
     * Gets all associated items.
     *
     * @return an empty list
     */
    @Override
    public Item[] getItems() {

        return items.toArray(new Item[items.size()]);

    }

    /**
     * Gets the cost of all parts in the assembly.
     *
     * @return the assembly cost
     */
    @Override
    public int getCost() {

        int total = 0;
        for (Item item : items) {
            total += item.getCost();
        }
        return total;
    }

}
