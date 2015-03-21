package com.shirrine.patterns.foobarmv.composite;

/**
 * Items that can be individual parts or assemblies of parts.
 *
 * @author Shirrine
 */
public abstract class Item {

    private String description;
    private int cost;

    /**
     * Creates an item with a description and cost.
     *
     * @param description the item description
     * @param cost the item cost
     */
    public Item(final String description, final int cost) {
        this.description = description;
        this.cost = cost;
    }

    /**
     * Gets the item description.
     *
     * @return the item description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the item cost.
     *
     * @return the item cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * Adds an item.
     *
     * @param item the item to be added
     */
    public abstract void addItem(Item item);

    /**
     * Removes an item.
     *
     * @param item the item to be removed
     */
    public abstract void removeItem(Item item);

    /**
     * Gets all associated items.
     *
     * @return the items
     */
    public abstract Item[] getItems();

    /**
     * Creates a string representation of the item that includes the
     * description and cost.
     *
     * @return the string representation of the item
     */
    public String toString() {
        return description + " (cost $" + getCost() + ")";
    }

}
