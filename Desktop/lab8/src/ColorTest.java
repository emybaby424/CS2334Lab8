import org.junit.Assert;
import org.junit.Test;

public class ColorTest {

    @Test
    public void ColorValueTest() {
    	Color col = null;	
    	
    	//RED
        col = col.RED;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
        
        //BLUE
        col = col.BLUE;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());
           
        //GREEN
        col = col.GREEN;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
           
        //YELLOW
        col = col.YELLOW;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
           
        //CYAN
        col = col.CYAN;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());
           
        //MAGENTA
        col = col.MAGENTA;
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
        Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());
           
    }

}

