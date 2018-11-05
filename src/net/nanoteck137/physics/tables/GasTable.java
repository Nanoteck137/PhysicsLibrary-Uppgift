package net.nanoteck137.physics.tables;

public enum GasTable{

    AIR(1.29, 1.01),
    O2(1.43, 0.92),

    Ar(1.78, 0.52),
    Ne(0.90, 1.03),
    CH4(0.72, 2.21),

    ;

    public double density;
    public double heatCapacity;

    GasTable(double d, double hc) {
        density = d;
        heatCapacity = hc * 1E3; // 1E3 = 1*10^3
    }

}