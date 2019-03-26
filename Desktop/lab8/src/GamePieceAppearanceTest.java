import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest {

	@Test
	public void GamePieceAppearanceGetterstest() {
		GamePieceAppearance a = new GamePieceAppearance(Color.BLUE, Shape.THIMBLE);
		
		Assert.assertEquals(Color.BLUE, a.getColor());
		Assert.assertEquals(Shape.THIMBLE, a.getShape());
	}

}
