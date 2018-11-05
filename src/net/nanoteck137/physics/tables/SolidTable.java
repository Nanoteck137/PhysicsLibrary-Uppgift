package net.nanoteck137.physics.tables;

public enum SolidTable {

    ICE(0.92, 2.2, 0, 334),
    IRON(7.87, 0.45, 1538, 276),
    COPPER(8.96, 0.39, 1085, 205),
    TIN(7.3, 0.71, 115, 38),
    SILVER(10.5, 0.24, 962, 105)
    ;

    public double density;
    public double heatCapacity;
    public double meltPoint;
    public double meltEnthalpy;

    SolidTable(double d, double hc, double sp, double se) {
        density = d * 1E3;
        heatCapacity = hc * 1E3;
        meltPoint = sp;
        meltEnthalpy = se * 1E3;
    }
}