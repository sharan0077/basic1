import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LengthTest {

    @Test
    public void test_length_in_centimeter(){
        Length length = new Length(4d,Unit.CENTIMETER);
        assertEquals(4d, length.getValue());
        assertEquals(Unit.CENTIMETER,length.getUnit());
    }

    @Test
    public void convert_length_from_centimeter_to_meter(){
        Length newLength = new Length(1d,Unit.CENTIMETER);
        Length length = new Length(0.01d,Unit.METER);
        assertEquals(length,newLength);
    }

    @Test
    public void convert_length_from_meter_to_centimeter(){
        Length newLength = new Length(1d,Unit.METER);
        Length length = new Length(100d,Unit.CENTIMETER);
        assertEquals(length,newLength);
    }

    @Test
    public void convert_length_from_centimeter_to_kilometer(){
        Length newLength = new Length(1d,Unit.CENTIMETER);
        Length length = new Length(0.001d,Unit.KILOMETER);
        assertEquals(length,newLength);
    }

    @Test
    public void convert_length_from_millimeter_to_centimeter(){
        Length newLength = new Length(1d,Unit.MILLIMETER);
        Length length = new Length(0.1d,Unit.CENTIMETER);
        assertEquals(length,newLength);
    }

    @Test
    public void convert_length_from_millimeter_to_inch(){
        Length newLength = new Length(1d,Unit.MILLIMETER);
        Length length = new Length(0.04d,Unit.INCH);
        assertEquals(length,newLength);
    }

    @Test
    public void convert_length_from_millimeter_to_Foot(){
        Length newLength = new Length(1d,Unit.MILLIMETER);
        Length length = new Length(0.004d,Unit.FOOT);
        assertEquals(length,newLength);
    }

    @Test
    public void convert_length_from_millimeter_to_Yard(){
        Length newLength = new Length(1d,Unit.MILLIMETER);
        Length length = new Length(0.002d,Unit.YARD);
        assertEquals(length,newLength);
    }

    @Test
    public void convert_length_from_millimeter_to_Mile(){
        Length newLength = new Length(1d,Unit.MILLIMETER);
        Length length = new Length(6.22d,Unit.MILE);
        assertEquals(length,newLength);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throw_Exception_for_illegal_arguments(){
        Length newLength = new Length(-1d,Unit.MILLIMETER);
        Length length = new Length(0.004d,Unit.FOOT);
        assertEquals(length,newLength);
    }

    @Test
    public void convertTo_will_convert_millimeter_to_centimeter(){
        Length length = new Length(1d,Unit.MILLIMETER);
        assertEquals(length,length.convertTo(Unit.CENTIMETER));
    }
    @Test
    public void convertTo_will_convert_meter_to_inch(){
        Length length = new Length(2d,Unit.METER);
        assertEquals(length,length.convertTo(Unit.INCH));
    }
    @Test
    public void convertTo_will_convert_meter_to_foot(){
        Length length = new Length(2d,Unit.METER);
        assertEquals(length,length.convertTo(Unit.FOOT));
    }

    @Test
    public void convertTo_will_convert_meter_to_yard(){
        Length length = new Length(2d,Unit.METER);
        assertEquals(length,length.convertTo(Unit.YARD));
    }

    @Test
    public void convertTo_will_convert_meter_to_miles(){
        Length length = new Length(2d,Unit.METER);
        assertEquals(length,length.convertTo(Unit.MILE));
    }

}
