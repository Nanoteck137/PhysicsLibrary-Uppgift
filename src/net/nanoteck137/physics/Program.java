package net.nanoteck137.physics;

import net.nanoteck137.physics.tables.FluidTable;
import net.nanoteck137.physics.tables.GasTable;
import net.nanoteck137.physics.tables.SolidTable;
import net.nanoteck137.physics.util.Constants;

import static net.nanoteck137.physics.Library.*;

public class Program {

    public static void main(String[] args) {
        //printTest();
        printAssignmentQuestions();
    }

    public static void printTest() {
        System.out.println("fahrenheitToCelsius(50) -> " + fahrenheitToCelsius(50));
        System.out.println("kelvinToCelsius(0) -> " + kelvinToCelsius(0));
        System.out.println();

        System.out.println("fluidPressure(WATER, 10) -> " + fluidPressure(FluidTable.WATER, 10));
        System.out.println("pressureUnderWater(10) -> " + pressureUnderWater(10));
        System.out.println();

        System.out.println("kineticEnergy(2, 2) -> " + kineticEnergy(2, 2));
        System.out.println("potentialEnergy(2, 5) -> " + potentialEnergy(2, 5));
        System.out.println();

        System.out.println("fallSpeed(2.5) -> " + fallSpeed(2.5));
        System.out.println();

        System.out.println("delta(1, 10) -> " + delta(1, 10));
        System.out.println("delta(5, 1) -> " + delta(5, 1));
        System.out.println();

        System.out.println("volumeToMass(FluidTable.WATER, 1) -> " + volumeToMass(FluidTable.WATER,1));
        System.out.println("volumeToMass(GasTable.AIR, 1) -> " + volumeToMass(GasTable.AIR,1));
        System.out.println("volumeToMass(SolidTable.IRON, 1) -> " + volumeToMass(SolidTable.IRON,1));
        System.out.println();

        System.out.println("svtVelocity(10, 5) -> " + svtVelocity(10, 5));
        System.out.println("svtDistance(10, 5) -> " + svtDistance(10, 5));
        System.out.println("svtTime(10, 2) -> " + svtTime(10, 2));
        System.out.println();

        System.out.println("work(50, 10) -> " + work(50, 10));
        System.out.println("power(1000, 2) -> " + power(1000, 2));
        System.out.println();

        System.out.println("heat(SolidTable.IRON, 1, 2) -> " + heat(SolidTable.IRON, 1, 2));
        System.out.println("heat(FluidTable.WATER,1,10) -> " + heat(FluidTable.WATER, 1, 10));
        System.out.println("heat(GasTable.AIR, 1, 1) -> " + heat(GasTable.AIR, 1, 1));
        System.out.println();

        System.out.println("velocityToHeight(9.82) -> " + velocityToHeight(9.82));
        System.out.println();
    }

    public static void printAssignmentQuestions() {
        double result = 0;

        System.out.println("Hur mycket väger 80 dm^3 järn?");
        result = volumeToMass(SolidTable.IRON, 80.0 / (10.0 * 10.0));
        System.out.println(String.format("Svar: %.2fkg", result));
        System.out.println();

        System.out.println("Hur långt hinner Tomas om han löper med medelhastigheten 2.8 m/s i 60 minuter?");
        result = svtDistance(2.8, 60.0 * 60.0);
        System.out.println(String.format("Svar: %.2fm", result));
        System.out.println();

        System.out.println("Hur mycket energi krävs för att värma upp 5 liter vatten?");
        result = heat(FluidTable.WATER, 5, 100);
        System.out.println(String.format("Svar: %.2fJ", result));
        System.out.println();

        System.out.println("Hur stort är det totala trycket 100 meter under havsytan?");
        result = pressureUnderWater(100);
        System.out.println(String.format("Svar: %.2fPa", result));
        System.out.println();

        System.out.println("Tomas som är 180cm lång kastar upp en boll med massan 200 gram i luften så den får starthastigheten 50 km/h. Hur högt kommer bollen?");
        //System.out.println(String.format("Svar: %.2fm", result));
        System.out.println("Svar: TODO");
        System.out.println();

        System.out.println("En bil med massan 740kg accelererar från 0-100 på 4.4 sekunder. Hur stor effekt har bilens motor uppnått?");
        double energy = kineticEnergy(740, 100.0 / 4.4);

        System.out.println(String.format("Svar: %.2fm", result));
        System.out.println();

        System.out.println("En studsboll släpps från 10 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?");
        System.out.println(String.format("Svar: %.2fm", result));
        System.out.println();

        System.out.println("Formulera en egen uppgift man kan lösa med hjälp av dina metoder?");
        System.out.println(String.format("Svar: %.2fm", result));
        System.out.println();

        System.out.println("Formulera en egen uppgift man kan lösa med hjälp av dina metoder?");
        System.out.println(String.format("Svar: %.2fm", result));
        System.out.println();

        System.out.println("Formulera en egen uppgift man kan lösa med hjälp av dina metoder?");
        System.out.println(String.format("Svar: %.2fm", result));
        System.out.println();
    }
}
