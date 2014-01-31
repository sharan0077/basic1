import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void get_back_milliliter(){
        Volume volume = new Volume(1d,VolumeUnit.MILLILITER);
        assertEquals(1d,volume.getValue());
        assertEquals(VolumeUnit.MILLILITER,volume.getUnit());
    }

    @Test
    public void convert_milliLiter_to_liter(){
        Volume volume = new Volume(1d,VolumeUnit.MILLILITER);
        assertEquals(volume,volume.convertTo(VolumeUnit.LITER));
    }
    @Test
    public void convert_milliLiter_to_kiloliter(){
        Volume volume = new Volume(1d,VolumeUnit.MILLILITER);
        assertEquals(volume,volume.convertTo(VolumeUnit.KILOLITER));
    }
    @Test
    public void convert_milliLiter_to_gallon(){
        Volume volume = new Volume(1d,VolumeUnit.MILLILITER);
        assertEquals(volume,volume.convertTo(VolumeUnit.GALLON));
    }
    @Test
    public void convertTo_convert_liter_to_miliLiter(){
        Volume volume = new Volume(1d,VolumeUnit.MILLILITER);
        assertEquals(volume,volume.convertTo(VolumeUnit.GALLON));
    }

}