package net.nanoteck137.physics;

import net.nanoteck137.physics.tables.FluidTable;
import net.nanoteck137.physics.tables.GasTable;
import net.nanoteck137.physics.tables.SolidTable;

import static net.nanoteck137.physics.Library.*;

/* TODO: List
    - Convert to eclipse project?
 */

public class Program {

    /**
     * The entry point for this program
     * @param args The argument variables passed to the program
     */
    public static void main(String[] args) {
        printTest();
        printAssignmentQuestions();
    }

    /**
     * Prints some test done with the Library methods
     */
    public static void printTest() {
        System.out.printf("fahrenheitToCelsius(50) -> %f\n", fahrenheitToCelsius(50));
        System.out.printf("kelvinToCelsius(0) -> %f\n", kelvinToCelsius(0));
        System.out.println();

        System.out.printf("fluidPressure(H2O, 10) -> %f\n", fluidPressure(FluidTable.H20, 10));
        System.out.printf("pressureUnderWater(10) -> %f\n", pressureUnderWater(10));
        System.out.println();

        System.out.printf("kineticEnergy(2, 2) -> %f\n", kineticEnergy(2, 2));
        System.out.printf("potentialEnergy(2, 5) -> %f\n", potentialEnergy(2, 5));
        System.out.println();

        System.out.printf("fallSpeed(2.5) -> %f\n", fallSpeed(2.5));
        System.out.println();

        System.out.printf("delta(1, 10) -> %f\n", delta(1, 10));
        System.out.printf("delta(5, 1) -> %f\n", delta(5, 1));
        System.out.println();

        System.out.printf("volumeToMass(FluidTable.H20, 1) -> %f\n", volumeToMass(FluidTable.H20,1));
        System.out.printf("volumeToMass(GasTable.AIR, 1) -> %f\n", volumeToMass(GasTable.AIR,1));
        System.out.printf("volumeToMass(SolidTable.IRON, 1) -> %f\n", volumeToMass(SolidTable.IRON,1));
        System.out.println();

        System.out.printf("svtVelocity(10, 5) -> %f\n", svtVelocity(10, 5));
        System.out.printf("svtDistance(10, 5) -> %f\n", svtDistance(10, 5));
        System.out.printf("svtTime(10, 2) -> %f\n",  svtTime(10, 2));
        System.out.println();

        System.out.printf("work(50, 10) -> %f\n", work(50, 10));
        System.out.printf("power(1000, 2) -> %f\n", power(1000, 2));
        System.out.println();

        System.out.printf("heat(SolidTable.IRON, 1, 2) -> %f\n", heat(SolidTable.IRON, 1, 2));
        System.out.printf("heat(FluidTable.H20,1,10) -> %f\n", heat(FluidTable.H20, 1, 10));
        System.out.printf("heat(GasTable.AIR, 1, 1) -> %f\n", heat(GasTable.AIR, 1, 1));
        System.out.println();

        System.out.printf("velocityToHeight(9.82) -> %f\n", velocityToHeight(9.82));
        System.out.println();

        System.out.println("Custom methods");
        System.out.printf("convertKMHToMS(90) -> %f\n", convertKMHToMS(90));
        System.out.printf("convertMSToKMG(25) -> %f\n", convertMSToKMH(25));
        System.out.printf("force(4, 10) -> %f\n", force(4, 10));
        System.out.printf("gravity(100, 1000, 10000) -> %f\n", gravity(100, 1000, 10000));
        System.out.printf("emc2(1) -> %f\n", emc2(1));
        System.out.printf("density(240, 4) -> %f\n", density(240, 4));
        System.out.printf("pressure(650, 0.5) -> %f\n", pressure(650, 0.5));
        System.out.printf("current(5, 230) -> %f\n", current(5, 230));
        System.out.printf("voltage(0.4, 100) -> %f\n", voltage(0.4, 100));
        System.out.printf("resistance(5, 0.2) -> %f\n", resistance(5, 0.2));

        System.out.println();
    }

    /**
     * Prints a question in a "nice" format
     * @param question The question
     * @param result The result
     * @param unit The unit for result
     * @param todo If the question is a todo
     */
    private static void printQuestion(String question, double result, String unit, boolean todo) {
        System.out.println(question);
        if(todo) {
            System.out.println("\tTODO");
        } else {
            System.out.printf("Svar: %.2f%s", result, unit);
        }
        System.out.println();
    }

    /**
     * Wrapper method for printQuestion
     * @param question The question
     * @param result The result
     * @param unit The unit for the result
     */
    private static void printQuestion(String question, double result, String unit) {
        printQuestion(question, result, unit, false);
    }

    /**
     * Prints all the questions in the assignment
     */
    private static void printAssignmentQuestions() {
        double result = 0;

        result = volumeToMass(SolidTable.IRON, 80.0 / (10.0 * 10.0));
        printQuestion("1. Hur mycket väger 80 dm^3 järn?", result, "kg");

        result = svtDistance(2.8, 60.0 * 60.0);
        printQuestion("2. Hur långt hinner Tomas om han löper med medelhastigheten 2.8 m/s i 60 minuter?", result, "m");

        result = heat(FluidTable.H20, 5, 100);
        printQuestion("3. Hur mycket energi krävs för att värma upp 5 liter vatten?", result, "J");

        result = pressureUnderWater(100);
        printQuestion("4. Hur stort är det totala trycket 100 meter under havsytan?", result, "Pa");

        result = Math.pow(Math.sin(90), 2) * velocityToHeight(50 / 3.6) + 1.8;
        printQuestion("5. Tomas som är 180cm lång kastar upp en boll med massan 200 gram i luften så den får starthastigheten 50 km/h. Hur högt kommer bollen?", result, "m");

        {
            double mass = 740;
            double time = 4.4;
            double velocity = convertKMHToMS(100.0);

            double k0 = kineticEnergy(mass, 0);
            double k1 = kineticEnergy(mass, velocity);
            double k = delta(k0, k1);

            result = power(k, time);
        }
        printQuestion("6. En bil med massan 740kg accelererar från 0-100 på 4.4 sekunder. Hur stor effekt har bilens motor uppnått?", result, "W");

        {
            double y = 10.0;
            int i = 0;

            while (y > 0.5) {
                y *= 0.99;
                i++;
            }

            result = (double)i;
        }

        printQuestion("7. En studsboll släpps från 10 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?", result, " gånger");

        {
            double powerSupplyVoltage = 5;
            double ledMaxVoltage = 2.05;
            double ledCurrent = 20.0 / 1000.0;

            double diff = delta(ledMaxVoltage, powerSupplyVoltage);
            result = resistance(diff, ledCurrent);
        }

        printQuestion("8. Om man vill att en liten LED på 20mA med 2,05V ska lysa med en 5V power supply vilken resistor borde man välja?", result, "Ω");

        {
            double force = 20000;
            double area = 4 * 4;
            result = pressure(force, area);
        }

        printQuestion("9. Om man trycker ner med 20000N med på en 4m gånger 4m area, Hur stort är trycket?", result, "Pa");

        {
            double mass = 1562;
            double volume = 12;
            result = density(mass, volume);
        }
        printQuestion("10. Hur mycket är densiteten om massan är 1562kg och volymen är 12m^3?", result, "kg/m^3");
    }
}
