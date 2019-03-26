import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;


public class GamePieceTest {

	@Test
	public void gettersTest() {
		GamePiece a = GamePiece.BLUE_BOOT;
        GamePiece b = GamePiece.GREEN_BOOT;
        
        Assert.assertEquals(Color.BLUE, a.getColor());
        Assert.assertEquals(Color.GREEN, b.getColor());
		
        Assert.assertEquals(Shape.BOOT, a.getShape());
        Assert.assertEquals(Shape.BOOT, b.getShape());
	}
	
	@Test
	public void moveFirstTest() {
		GamePiece a = GamePiece.BLUE_BOOT;
        GamePiece b = GamePiece.GREEN_BOOT;
        
        Assert.assertEquals(a, GamePiece.movesFirst(a, b));
        Assert.assertEquals(a, GamePiece.movesFirst(b, a));
	}
	
	@Test
	public void toStringTest() {
        GamePiece b = GamePiece.GREEN_BOOT;
        Assert.assertEquals("GREEN_BOOT: a GREEN BOOT with priority 8", b.toString());
	}

}
