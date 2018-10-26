package net.nanoteck137.physics;

import net.nanoteck137.physics.tables.FluidTable;
import net.nanoteck137.physics.tables.GasTable;
import net.nanoteck137.physics.tables.SolidTable;
import net.nanoteck137.physics.util.Constants;

public class Library {

    /**
     *  Convertes fahrenheit to celsius
     * @param fahrenheit The value to be converted to celsius
     * @return Returnes the calculated celsius value
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    /**
     * Converts kelvin to celsius
     * @param kelvin The value to be converted to celsius
     * @return Returnes the calculated celsius value
     */
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    /**
     * Calculate the fluid pressure for some fluid on a specified depth
     * @param fluid The fluid
     * @param depth The depth
     * @return The calculated pressure value
     */
    public static double fluidPressure(FluidTable fluid, double depth) {
        return fluid.density * Constants.G * depth;
    }

    /**
     * Calculate the fluid pressure for water on a specified depth
     * @param depth The depth
     * @return The calculated pressure for water
     */
    public static double pressureUnderWater(double depth) {
        return fluidPressure(FluidTable.WATER, depth);
    }

    /**
     * Calculate the kinetic energy for a object
     * @param mass The mass of the object
     * @param velocity The velocity of the object
     * @return Returnes the calculated kinetic energy
     */
    public static double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    /**
     * Calculate the potential energy for a object
     * @param mass The mass of the object
     * @param height The height over the ground TODO
     * @return
     */
    public static double potentialEnergy(double mass, double height) {
        return mass * Constants.G * height;
    }

    public static double fallSpeed(double height) {
        return Math.sqrt(2 * height * Constants.G);
    }

    public static double delta(double first, double last) {
        return last - first;
    }

    public static double volumeToMass(FluidTable fluid, double volume) {
        return 0;
    }

    public static double volumeToMass(GasTable gas, double volume) {
        return 0;
    }

    public static double volumeToMass(SolidTable solid, double volume) {
        return 0;
    }

    public static double svtVelocity(double distance, double time) {
        return 0;
    }

    public static double svtDistance(double velocity, double time) {
        return 0;
    }

    public static double svtTime(double distance, double velocity) {
        return 0;
    }

    public static double work(double force, double distance) {
        return 0;
    }

    public static double power(double work, double time) {
        return 0;
    }

    public static double heat(SolidTable solid, double mass, double deltaT) {
        return 0;
    }

    public static double heat(FluidTable fluid, double volume, double deltaT) {
        return 0;
    }

    public static double heat(GasTable gas, double volume, double deltaT) {
        return 0;
    }

    public static double velocityToHeight(double velocity) {
        return 0;
    }



}
