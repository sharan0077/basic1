/**
 * Created by gurushan on 1/31/14.
 */
public class Volume {

    private double value;
    private VolumeUnit unit;

    public Volume(double value,VolumeUnit unitType) {
        this.value = value;
        this.unit = unitType;
    }

    public double getValue() {
        return value;
    }

    public VolumeUnit getUnit() {
        return unit;
    }

    public Volume convertTo(VolumeUnit unit){
        return new Volume( ( (this.getUnit().getUnitValue()) / unit.getUnitValue() ) * this.value,unit );

    }

    @Override
    public boolean equals(Object o) {
        return (o != null && o.getClass() == this.getClass());
    }


}
