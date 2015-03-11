package com.shirrine.patterns.foobarmv.prototype;

import com.shirrine.patterns.foobarmv.Pickup;
import com.shirrine.patterns.foobarmv.Vehicle;
import com.shirrine.patterns.foobarmv.BoxVan;
import com.shirrine.patterns.foobarmv.Saloon;
import com.shirrine.patterns.foobarmv.Coupe;
import com.shirrine.patterns.foobarmv.Sport;
import com.shirrine.patterns.foobarmv.flyweight.Engine;
import com.shirrine.patterns.foobarmv.flyweight.EngineFlyweightFactory;

/**
 * A manager that creates vehicles.
 *
 * @author Shirrine
 */
public class VehicleManager {

    private Vehicle saloon, coupe, sport, boxVan, pickup;

    /**
     * Creates a vehicle manager for creating vehicles.
     */
    public VehicleManager() {

    }

    /**
     * Creates a saloon vehicle.
     *
     * @return the saloon vehicle
     */
    public Vehicle createSaloon() {

        // Lazy initialization. Only create an object if it doesn't
        // already exist
        if (saloon == null) {
            saloon = new Saloon(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            Engine.ENGINE_SIZE_1300));
        }

        return (Vehicle) saloon.clone();
    }

    /**
     * Creates a coupe vehicle.
     *
     * @return the coupe vehicle
     */
    public Vehicle createCoupe() {

        // Lazy initialization. Only create an object if it doesn't
        // already exist
        if (coupe == null) {
            coupe = new Coupe(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            Engine.ENGINE_SIZE_1600));
        }

        return (Vehicle) coupe.clone();

    }

    /**
     * Creates a sport vehicle.
     *
     * @return the sport vehicle
     */
    public Vehicle createSport() {

        // Lazy initialization. Only create an object if it doesn't
        // already exist
        if (sport == null) {
            sport = new Sport(
                    EngineFlyweightFactory.INSTANCE.getTurboEngine(
                            Engine.ENGINE_SIZE_2000));
        }

        return (Vehicle) sport.clone();

    }

    /**
     * Creates a box van vehicle.
     *
     * @return the box van vehicle
     */
    public Vehicle createBoxVan() {

        // Lazy initialization. Only create an object if it doesn't
        // already exist
        if (boxVan == null) {
            boxVan = new BoxVan(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            Engine.ENGINE_SIZE_2200));
        }

        return (Vehicle) boxVan.clone();

    }

    /**
     * Creates a pickup truck vehicle.
     *
     * @return the pickup truck vehicle
     */
    public Vehicle createPickup() {

        // Lazy initialization. Only create an object if it doesn't
        // already exist
        if (pickup == null) {
            pickup = new Pickup(
                    EngineFlyweightFactory.INSTANCE.getStandardEngine(
                            Engine.ENGINE_SIZE_2500));
        }

        return (Vehicle) pickup.clone();

    }

}
