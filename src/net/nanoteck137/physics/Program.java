package net.nanoteck137.physics;

import net.nanoteck137.physics.tables.FluidTable;
import net.nanoteck137.physics.tables.GasTable;
import net.nanoteck137.physics.tables.SolidTable;
import net.nanoteck137.physics.util.Constants;

import static net.nanoteck137.physics.Library.*;

public class Program {

    public static void main(String[] args) {
        System.out.println("fahrenheitToCelsius(50) -> " + fahrenheitToCelsius(50));
        System.out.println("kelvinToCelsius(0) -> " + kelvinToCelsius(0));

        System.out.println("fluidPressure(WATER, 10) -> " + fluidPressure(FluidTable.WATER, 10));
        System.out.println("pressureUnderWater(10) -> " + pressureUnderWater(10));

        System.out.println("kineticEnergy(2, 2) -> " + kineticEnergy(2, 2));
        System.out.println("potentialEnergy(2, 5) -> " + potentialEnergy(2, 5));

        System.out.println("fallSpeed(2.5) -> " + fallSpeed(2.5));

        System.out.println("delta(1, 10) -> " + delta(1, 10));
        System.out.println("delta(5, 1) -> " + delta(5, 1));

        System.out.println("volumeToMass(FluidTable.WATER, 1) -> " + volumeToMass(FluidTable.WATER,1));
        System.out.println("volumeToMass(GasTable.AIR, 1) -> " + volumeToMass(GasTable.AIR,1));
        System.out.println("volumeToMass(SolidTable.IRON, 1) -> " + volumeToMass(SolidTable.IRON,1));

        System.out.println("svtVelocity(10, 5) -> " + svtVelocity(10, 5));
        System.out.println("svtDistance(10, 5) -> " + svtDistance(10, 5));
        System.out.println("svtTime(10, 2) -> " + svtTime(10, 2));

        System.out.println("work(50, 10) -> " + work(50, 10));
        System.out.println("power(1000, 2) -> " + power(1000, 2));

        System.out.println("heat(SolidTable.IRON, 1, 2) -> " + heat(SolidTable.IRON, 1, 2));
        System.out.println("heat(FluidTable.WATER,1,10) -> " + heat(FluidTable.WATER, 1, 10));
        System.out.println("heat(GasTable.AIR, 1, 1) -> " + heat(GasTable.AIR, 1, 1));


        System.out.println("velocityToHeight(9.82) -> " + velocityToHeight(9.82));

    }
}
