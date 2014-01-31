public enum Unit{

    MILLIMETER(1),CENTIMETER(0.1),METER(0.01),KILOMETER(0.001),INCH(0.04),FOOT(0.004),YARD(0.002),MILE(6.22);

    private final double unitValue;

    Unit(double value){
        this.unitValue = value;
    }
    double getUnitValue(){
        return unitValue;
    }
}
