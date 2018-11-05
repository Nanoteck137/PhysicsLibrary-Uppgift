package net.nanoteck137.physics;

import net.nanoteck137.physics.tables.FluidTable;
import net.nanoteck137.physics.tables.GasTable;
import net.nanoteck137.physics.tables.SolidTable;
import net.nanoteck137.physics.util.Constants;

import static net.nanoteck137.physics.Library.*;

/* TODO: List
    - Convert to eclipse project
    - 10 more methods

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
        System.out.println("fahrenheitToCelsius(50) -> " + fahrenheitToCelsius(50));
        System.out.println("kelvinToCelsius(0) -> " + kelvinToCelsius(0));
        System.out.println();

        System.out.println("fluidPressure(H2O, 10) -> " + fluidPressure(FluidTable.H20, 10));
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

        System.out.println("volumeToMass(FluidTable.H20, 1) -> " + volumeToMass(FluidTable.H20,1));
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
        System.out.println("heat(FluidTable.H20,1,10) -> " + heat(FluidTable.H20, 1, 10));
        System.out.println("heat(GasTable.AIR, 1, 1) -> " + heat(GasTable.AIR, 1, 1));
        System.out.println();

        System.out.println("velocityToHeight(9.82) -> " + velocityToHeight(9.82));
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
            System.out.println(String.format("Svar: %.2f%s", result, unit));
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

            double velocity = 100 / 3.6;
            double acc = velocity / 4.4;
            double force = mass * acc;
            double distance = svtDistance(velocity, time);

            double work = work(force, distance);
            double power = power(work, time);

            result = power;
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

        //TODO: Create the custom methods
        printQuestion("8. Formulera en egen uppgift man kan lösa med hjälp av dina metoder?", 0, "", true);

        printQuestion("9. Formulera en egen uppgift man kan lösa med hjälp av dina metoder?", 0, "", true);

        printQuestion("10. Formulera en egen uppgift man kan lösa med hjälp av dina metoder?", 0, "", true);
    }
}
