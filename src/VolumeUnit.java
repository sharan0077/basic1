
public enum VolumeUnit {

    MILLILITER(1), LITER(0.001), KILOLITER(0.000001), GALLON(0.0003);

    private final double unitValue;

    VolumeUnit(double value) {
        unitValue = value;
    }

    public double getUnitValue() {
        return unitValue;
    }

}
