package com.shirrine.patterns.foobarmv.composite;

/**
 * A part with a description and cost. Parts can be used in an
 * <code>Assembly</code>.
 *
 * @author Shirrine
 */
public class Part extends Item {

    /**
     * Creates a part with a description and cost.
     *
     * @param description the item description
     * @param cost the item cost
     */
    public Part(final String description, final int cost) {
        super(description, cost);
    }

    /*
     * No-op
     */
    @Override
    public void addItem(final Item item) { }

    /*
     * No-op
     */
    @Override
    public void removeItem(final Item item) { }

    /**
     * Gets all associated items.
     *
     * @return an empty list of items
     */
    @Override
    public Item[] getItems() {

        return new Item[0];

    }

}
