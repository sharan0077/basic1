public class Length {
    public Unit unit;
    public double value;

    Length(double length, Unit unit) {
        if(length < 0 ) throw new IllegalArgumentException();
        this.value = length;
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return o != null && this.getClass()== o.getClass();
    }

    public Length convertTo(Unit unitToConvert) {
       return new Length( ((this.getUnit()).getUnitValue() / unitToConvert.getUnitValue()) * this.value , unitToConvert);
    }
}
