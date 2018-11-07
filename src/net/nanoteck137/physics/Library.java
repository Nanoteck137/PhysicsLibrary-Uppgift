package net.nanoteck137.physics;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import net.nanoteck137.physics.tables.FluidTable;
import net.nanoteck137.physics.tables.GasTable;
import net.nanoteck137.physics.tables.SolidTable;
import net.nanoteck137.physics.util.Constants;

public class Library {

    /**
     *  Convertes fahrenheit to celsius
     * @param fahrenheit The value to be converted to celsius
     * @return Returns the calculated celsius value
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    /**
     * Converts kelvin to celsius
     * @param kelvin The value to be converted to celsius
     * @return Returns the calculated celsius value
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
        return fluid.density * Constants.g_swe * depth;
    }

    /**
     * Calculate the fluid pressure for water on a specified depth
     * @param depth The depth
     * @return The calculated pressure for water
     */
    public static double pressureUnderWater(double depth) {
        return fluidPressure(FluidTable.H20, depth);
    }

    /**
     * Calculate the kinetic energy for a object
     * @param mass The mass of the object
     * @param velocity The velocity of the object
     * @return Returns the calculated kinetic energy
     */
    public static double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    /**
     * Calculate the potential energy for a object
     * @param mass The mass of the object
     * @param height The height over the ground
     * @return Returns the potential energy for the object
     */
    public static double potentialEnergy(double mass, double height) {
        return mass * Constants.g_swe * height;
    }

    /**
     * Calculate the free fall speed
     * @param height The height of the object
     * @return Returns the speed
     */
    public static double fallSpeed(double height) {
        return Math.sqrt(2 * height * Constants.g_swe);
    }

    /**
     * Calculate the difference between 2 values
     * @param first The first value
     * @param last The second value
     * @return Returns the difference
     */
    public static double delta(double first, double last) {
        return last - first;
    }

    /**
     * Calculate a fluids mass
     * @param fluid The fluid
     * @param volume The volume
     * @return Returns the mass of the fluid
     */
    public static double volumeToMass(FluidTable fluid, double volume) {
        return fluid.density * volume;
    }

    /**
     * Calculate gases mass
     * @param gas The gas
     * @param volume The volume
     * @return Returns the mass
     */
    public static double volumeToMass(GasTable gas, double volume) {
        return gas.density * volume;
    }

    /**
     * Calculate solids mass
     * @param solid The solid
     * @param volume The volume
     * @return Returns the mass
     */
    public static double volumeToMass(SolidTable solid, double volume) {
        return solid.density * volume;
    }

    /**
     * Calculate the velocity of an object
     * @param distance The distance of the object
     * @param time The time taken
     * @return Returns the velocity
     */
    public static double svtVelocity(double distance, double time) {
        return distance / time;
    }

    /**
     * Calculate the distance of the object
     * @param velocity The velocity the object traveled
     * @param time The time taken
     * @return Returns the distance
     */
    public static double svtDistance(double velocity, double time) {
        return velocity * time;
    }

    /**
     * Calculates the time taken to travel a specified distance with a specified velocity
     * @param distance The distance travled
     * @param velocity The velocity
     * @return Returns the time
     */
    public static double svtTime(double distance, double velocity) {
        return distance / velocity;
    }

    /**
     * Calculate the work
     * @param force The force needed
     * @param distance The distance
     * @return Returns the work
     */
    public static double work(double force, double distance) {
        return force * distance;
    }

    /**
     * Calulate the power
     * @param work The work
     * @param time The time
     * @return Returns the power
     */
    public static double power(double work, double time) {
        return work / time;
    }

    /**
     * Calculate the heat generated from a solid material from a given temperature
     * @param solid The solid
     * @param mass The mass of the solid
     * @param deltaT The target temperature
     * @return Returnes the energy necessary to heat up the material to the temperature
     */
    public static double heat(SolidTable solid, double mass, double deltaT) {
        return mass * solid.heatCapacity * deltaT;
    }

    /**
     * Calculate the heat generated from a liquid material from a given temperature
     * @param fluid The fluid
     * @param volume The volume of the fluid
     * @param deltaT The target temperature
     * @return Returns the energy necessary to heat up the material to the temperature
     */
    public static double heat(FluidTable fluid, double volume, double deltaT) {
        return volume * fluid.heatCapacity * deltaT;
    }

    /**
     * Calculate the heat generated from a gas material from a given temperature
     * @param gas The gas
     * @param volume The volume of the gas
     * @param deltaT The target temperature
     * @return Returns the energy necessary to heat up the material to the temperature
     */
    public static double heat(GasTable gas, double volume, double deltaT) {
        return volume * gas.heatCapacity * deltaT;
    }

    /**
     * Calculate the height with velocity
     * @param velocity The specified velocity
     * @return The height
     */
    public static double velocityToHeight(double velocity) {
        return Math.pow(velocity, 2.0) / (Constants.g_swe * 2.0);
    }

    //NOTE: Custom methods

    /**
     * Converts km/h to m/s
     * @param kmh km/h
     * @return Returns m/s
     */
    public static double convertKMHToMS(double kmh) {
        return kmh / 3.6;
    }

    /**
     * Converts m/s to km/h
     * @param ms m/s
     * @return Returns km/s
     */
    public static double convertMSToKMH(double ms) {
        return ms * 3.6;
    }

    /**
     * Newtons second law: Calculate the force for an object
     * @param mass The mass of the object
     * @param acceleration The acceleration the object is traveling at
     * @return Returns the force
     */
    public static double force(double mass, double acceleration) {
        return mass * acceleration;
    }

    /**
     * Newtons law of gravity: Calculate the gravity between two particles
     * @param mass1 The mass of the first object
     * @param mass2 The mass of the second object
     * @param distance The distance between the objects
     * @return Returns the gravitational force
     */
    public static double gravity(double mass1, double mass2, double distance) {
        return Constants.G * ((mass1 * mass2) / Math.pow(distance, 2));
    }

    /**
     * Mass–energy equivalence: Calculate the relation between an object and its mass
     * @param mass The mass of the object
     * @return Returns the energy
     */
    public static double emc2(double mass) {
        return mass * (Math.pow(3 * Math.pow(10, 8), 2));
    }

    /**
     * Calculate the density
     * @param mass The mass
     * @param volume The volume
     * @return Returns the density
     */
    public static double density(double mass, double volume) {
        return mass / volume;
    }

    /**
     * Calculate the pressure on a area
     * @param force The force pushing on the area
     * @param area The area
     * @return Returns the pressure
     */
    public static double pressure(double force, double area) {
        return force / area;
    }

    /**
     * Ohms law: Calculate the current
     * @param voltage The voltage
     * @param resistance The resistance
     * @return Returns the current
     */
    public static double current(double voltage, double resistance) {
        return voltage / resistance;
    }

    /**
     * Ohms law: Calculate voltage
     * @param current The current
     * @param resistance The resistance
     * @return Returns the voltage
     */
    public static double voltage(double current, double resistance) {
        return current * resistance;
    }

    /**
     * Ohms law: Calculate the resistance
     * @param voltage The voltage
     * @param current The current
     * @return Returns the resistance
     */
    public static double resistance(double voltage, double current) {
        return voltage / current;
    }

}
