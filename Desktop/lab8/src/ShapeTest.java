import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class ShapeTest {

	@Test
	public  void testShapeToString(){
		Shape a = null;
		
		Assert.assertEquals("boot", a.BOOT.toString());
		
		Assert.assertEquals("racecar", a.RACECAR.toString());
		
		Assert.assertEquals("thimble", a.THIMBLE.toString());
	}

}
