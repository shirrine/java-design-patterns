package com.shirrine.patterns.foobarmv.builder;

import com.shirrine.patterns.foobarmv.AbstractVan;
import com.shirrine.patterns.foobarmv.Vehicle;
/**
 * A builder of van objects.
 *
 * @author Shirrine
 *
 */
public class VanBuilder extends VehicleBuilder {

    private AbstractVan vanInProgress;

    /**
     * Creates a builder from the abstract van.
     *
     * @param van
     *            the abstract van
     */
    public VanBuilder(final AbstractVan van) {
        this.vanInProgress = van;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.shirrine.patterns.foobarmv.builder.VehicleBuilder#buildBody()
     */
    @Override
    public VanBuilder buildBody() {
        System.out.println("Building van body...");
        return this;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.shirrine.patterns.foobarmv.builder.VehicleBuilder#buildChassis()
     */
    @Override
    public VanBuilder buildChassis() {
        System.out.println("Building van chassis...");
        return this;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.shirrine.patterns.foobarmv.builder.VehicleBuilder#
     * buildReinforcedStorageArea()
     */
    @Override
    public VanBuilder buildReinforcedStorageArea() {
        System.out.println("Building van storage area...");
        return this;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.shirrine.patterns.foobarmv.builder.VehicleBuilder#buildWindows()
     */
    @Override
    public VanBuilder buildWindows() {
        System.out.println("Building van windows...");
        return this;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.shirrine.patterns.foobarmv.builder.VehicleBuilder#getVehicle()
     */
    @Override
    public Vehicle getVehicle() {
        return vanInProgress;
    }

}
