import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class rectangleTest {

    @Test
    public  void getTheAreaOfRectangle(){
        Rectangle rect = Rectangle.createRectangle(3,4);
        assertEquals(12,rect.getArea());
    }

    @Test
    public void getThePerimeterOfRectangle(){
        Rectangle rect = Rectangle.createRectangle(3,4);
        assertEquals(14,rect.getPerimeter());
    }

    @Test
    public void getTheAreaOfSquare(){
        Rectangle sqr = Rectangle.createSquare(3);
        assertEquals(9, sqr.getArea());
    }

    @Test
    public void getThePerimeterOfSquare(){
        Rectangle sqr = Rectangle.createSquare(4);
        assertEquals(16, sqr.getPerimeter());
    }

}
