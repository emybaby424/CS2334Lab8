import org.junit.Test;
import org.junit.Assert;

public class LocationTest {

	@Test
	public void Locationtest() {
		Assert.assertEquals("Location enum value incorrect", Location.KITCHEN,Location.valueOf("KITCHEN"));
		Assert.assertEquals("Location enum value incorrect", Location.CONSERVATORY,Location.valueOf("CONSERVATORY"));
		Assert.assertEquals("Location enum value incorrect", Location.DINING_ROOM,Location.valueOf("DINING_ROOM"));
		Assert.assertEquals("Location enum value incorrect", Location.BALLROOM,Location.valueOf("BALLROOM"));
		Assert.assertEquals("Location enum value incorrect", Location.BILLIARD_ROOM,Location.valueOf("BILLIARD_ROOM"));
		Assert.assertEquals("Location enum value incorrect", Location.HALL,Location.valueOf("HALL"));
		Assert.assertEquals("Location enum value incorrect", Location.LIBRARY,Location.valueOf("LIBRARY"));
		Assert.assertEquals("Location enum value incorrect", Location.STUDY,Location.valueOf("STUDY"));
		Assert.assertEquals("Location enum value incorrect", Location.LOUNGE,Location.valueOf("LOUNGE"));
	}

}
