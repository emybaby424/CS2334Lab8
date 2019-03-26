import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;


public class BoardGameTest {

	@Test
	public void addPlayerTest() {
	    BoardGame g = new BoardGame();
	   	Assert.assertEquals(true, g.addPlayer("emy", GamePiece.BLUE_BOOT, Location.CONSERVATORY));
	   	Assert.assertEquals(false, g.addPlayer("emy", GamePiece.GREEN_BOOT, Location.BILLIARD_ROOM));
	}
	
	@Test
	public void getPlayerGamePieceTest() {
		BoardGame g = new BoardGame();
	   	Assert.assertEquals(true, g.addPlayer("emy", GamePiece.BLUE_BOOT, Location.CONSERVATORY));
	   	Assert.assertEquals(GamePiece.BLUE_BOOT, g.getPlayerGamePiece("emy"));
	}
	
	@Test
	public void getPlayerWithGamePieceTest() {
		 BoardGame g = new BoardGame();
		 Assert.assertEquals(true, g.addPlayer("emy", GamePiece.BLUE_BOOT, Location.CONSERVATORY));
		 Assert.assertEquals("emy", g.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		 Assert.assertEquals(null, g.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
	}
	
	@Test
	public void movePlayerTest() {
		BoardGame g = new BoardGame();
    	g.addPlayer("lucy", GamePiece.YELLOW_BOOT, Location.KITCHEN);
    	g.movePlayer("lucy", Location.BALLROOM);
    	Assert.assertEquals(Location.BALLROOM, g.getPlayersLocation("lucy"));
	}
	
	@Test
	public void moveTwoPlayersTest() {
		BoardGame g = new BoardGame();
		g.addPlayer("cesar", GamePiece.BLUE_BOOT, Location.BALLROOM);
    	g.addPlayer("alex", GamePiece.GREEN_BOOT, Location.DINING_ROOM);
    	
		String[] name = new String[2];
	    name[0] = "cesar";
	    name[1] = "alex";
	        
	    Location[] loc = new Location[2];
	    loc[0] = Location.CONSERVATORY;
	    loc[1] = Location.BILLIARD_ROOM;
	   
	    g.moveTwoPlayers(name, loc);
	    Assert.assertEquals(Location.CONSERVATORY, g.getPlayersLocation("cesar"));
	    Assert.assertEquals(Location.BILLIARD_ROOM, g.getPlayersLocation("alex"));
	    
		BoardGame g2 = new BoardGame();
	    g2.addPlayer("lucy", GamePiece.YELLOW_BOOT, Location.KITCHEN);
    	g2.addPlayer("emy", GamePiece.RED_THIMBLE, Location.BALLROOM);

	    String[] name2 = new String[2];
        name2[0] = "emy";
        name2[1] = "lucy";
        
        Location[] loc2 = new Location[2];
        loc2[0] = Location.CONSERVATORY;
        loc2[1] = Location.LIBRARY;

	    g2.moveTwoPlayers(name2, loc2);
	    Assert.assertEquals(Location.CONSERVATORY, g2.getPlayersLocation("lucy"));
	    Assert.assertEquals(Location.LIBRARY, g2.getPlayersLocation("emy"));
	    

	}
	
	@Test
	public void getPlayersAtLocationTest() {
		BoardGame g = new BoardGame();
		g.addPlayer("emy", GamePiece.RED_THIMBLE, Location.BALLROOM);
    	g.addPlayer("cesar", GamePiece.BLUE_BOOT, Location.BALLROOM);
    	
    	ArrayList<String> players = new ArrayList<String>();
    	players.add("emy");
    	players.add("cesar");
    	Assert.assertEquals(players, g.getPlayersAtLocation(Location.BALLROOM));
        	
    	Assert.assertEquals(players, g.getPlayersAtLocation(Location.BALLROOM));

    	players.clear();
    	Assert.assertEquals(players, g.getPlayersAtLocation(Location.BILLIARD_ROOM));
	}
	
	@Test
	public void getGamePiecesAtLocationTest() {
		BoardGame g = new BoardGame();
		g.addPlayer("emy", GamePiece.RED_THIMBLE, Location.BALLROOM);
    	g.addPlayer("cesar", GamePiece.BLUE_BOOT, Location.BALLROOM);
    	
    	ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
    	pieces.add(GamePiece.RED_THIMBLE);
    	pieces.add(GamePiece.BLUE_BOOT);
    	Assert.assertEquals(pieces, g.getGamePiecesAtLocation(Location.BALLROOM));
	}
	
	@Test
	public void getPlayersTest() {
		BoardGame g = new BoardGame();
		g.addPlayer("emy", GamePiece.RED_THIMBLE, Location.BALLROOM);
    	g.addPlayer("cesar", GamePiece.BLUE_BOOT, Location.BALLROOM);
    	g.addPlayer("lucy", GamePiece.YELLOW_BOOT, Location.KITCHEN);
    	g.addPlayer("paul", GamePiece.BLUE_BOOT, Location.KITCHEN);
    	
    	Set<String> players = new HashSet<String>();
    	players.add("emy");
    	players.add("cesar");
    	players.add("lucy");
    	players.add("paul");
    	
    	Assert.assertEquals(players, g.getPlayers());
    	
	}
	
	@Test
	public void getPlayerLocationsTest() {
		BoardGame g = new BoardGame();
		g.addPlayer("emy", GamePiece.RED_THIMBLE, Location.BALLROOM);
    	g.addPlayer("cesar", GamePiece.BLUE_BOOT, Location.BALLROOM);
    	g.addPlayer("lucy", GamePiece.YELLOW_BOOT, Location.KITCHEN);
    	g.addPlayer("paul", GamePiece.BLUE_BOOT, Location.KITCHEN);
    	
    	Set<Location> places = new HashSet<Location>();
    	places.add(Location.BALLROOM);
    	places.add(Location.BALLROOM);
    	places.add(Location.KITCHEN);
    	places.add(Location.KITCHEN);
    	
    	Assert.assertEquals(places, g.getPlayerLocations());
    	
	}
	
	@Test
	public void getPlayerPiecesTest() {
		BoardGame g = new BoardGame();
		g.addPlayer("emy", GamePiece.RED_THIMBLE, Location.BALLROOM);
    	g.addPlayer("cesar", GamePiece.BLUE_BOOT, Location.BALLROOM);
    	g.addPlayer("lucy", GamePiece.YELLOW_BOOT, Location.KITCHEN);
    	g.addPlayer("paul", GamePiece.BLUE_BOOT, Location.KITCHEN);
    	
    	Set<GamePiece> pieces = new HashSet<GamePiece>();
    	pieces.add(GamePiece.RED_THIMBLE);
    	pieces.add(GamePiece.BLUE_BOOT);
    	pieces.add(GamePiece.YELLOW_BOOT);
    	pieces.add(GamePiece.BLUE_BOOT);
    	
    	Assert.assertEquals(pieces, g.getPlayerPieces());
		
	}

}
