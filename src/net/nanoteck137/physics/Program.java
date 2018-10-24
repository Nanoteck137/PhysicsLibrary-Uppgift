package net.nanoteck137.physics;

import net.nanoteck137.physics.tables.FluidTable;
import net.nanoteck137.physics.util.Constants;

import static net.nanoteck137.physics.Library.*;

public class Program {

    public static void main(String[] args) {
        System.out.println("fahrenheitToCelsius(50) -> " + fahrenheitToCelsius(50));
        System.out.println("kelvinToCelsius(0) -> " + kelvinToCelsius(0));
        System.out.println("fluidPressure(WATER, 10) -> " + fluidPressure(FluidTable.WATER, 10));
        System.out.println("pressureUnderWater(10) -> " + pressureUnderWater(10));
    }
}
