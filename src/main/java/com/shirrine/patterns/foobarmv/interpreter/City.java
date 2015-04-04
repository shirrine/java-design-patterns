package com.shirrine.patterns.foobarmv.interpreter;

/**
 * A city with a latitude and longitude.
 *
 * @author Shirrine
 */
public class City {

    private String name;
    private double latitude, longitude;

    /**
     * Creates a city with the given name and a numerical representation
     * of the latitude and longitude. A positive latitude is North and a
     * negative latitude is South. A positive longitude is East and a
     * negative longitude is West.
     *
     * @param name the name of the city
     * @param latitude the latitude of the city
     * @param longitude the longitude of the city
     */
    public City(final String name,
                final double latitude,
                final double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Gets the city name.
     *
     * @return the city name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the city latitude.
     *
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Gets the city longitude.
     *
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Determines if this object is equal to the parameter by
     * comparing the city name.
     *
     * @param otherObj the object to compare
     * @return true, if the object has the same city name
     */
    @Override
    public boolean equals(final Object otherObj) {

        // Must not be null
        if (otherObj == null) {
            return false;
        }

        // Exact match
        if (this == otherObj) {
            return true;
        }

        // Must be a City object
        if (!(otherObj instanceof City)) {
            return false;
        }

        // Compare the city name
        // Note: Should also compare state and country ;-)
        return getName().equals(((City) otherObj).getName());
    }

    /**
     * Produces a hashcode based on the city name.
     * @return the hashcode
     */
    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    /**
     * Produces a string representation of the city from the city name.
     *
     * @return the city name
     */
    public String toString() {
        return getName();
    }

}
