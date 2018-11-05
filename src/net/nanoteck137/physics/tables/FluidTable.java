package net.nanoteck137.physics.tables;

public enum FluidTable {

    H20(0.998, 4.19, 0, 100, 2260),
    H2SO4(1.84, 1.38, 10, 336, 511),
    CCI4(1.596, 0.84, -23, 77, 193),
    C6H6(0.879, 1.71, 6, 80, 393),
    C2HCI3(1.46, 0.96, -85, 87, 239)
    ;

    public double density;
    public double heatCapacity;
    public double meltPoint;
    public double boilPoint;
    public double steamEnthalpy;

    FluidTable(double d, double hc, double sp, double bp, double se) {
        density = d * 1E3;
        heatCapacity = hc * 1E3;
        meltPoint = sp;
        boilPoint = bp;
        steamEnthalpy = se * 1E3;
    }

}