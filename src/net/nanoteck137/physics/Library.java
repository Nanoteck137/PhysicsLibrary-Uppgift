package net.nanoteck137.physics;

import net.nanoteck137.physics.tables.FluidTable;
import net.nanoteck137.physics.tables.GasTable;
import net.nanoteck137.physics.tables.SolidTable;

public class Library {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fluidPressure(FluidTable fluid, double deep) {
        
        return 0;
    }

    public static double pressureUnderWater(double deep) {
        return 0;
    }

    public static double kineticEnergy(double mass, double velocity) {
        return 0;
    }

    public static double potentialEnergy(double mass, double height) {
        return 0;
    }

    public static double fallSpeed(double height) {
        return 0;
    }

    public static double delta(double first, double last) {
        return 0;
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
