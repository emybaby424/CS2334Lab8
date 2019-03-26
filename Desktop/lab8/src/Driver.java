
public class Driver {
	
    public static void main(String[] args) {
    	

        GamePieceAppearance a = new GamePieceAppearance(Color.BLUE, Shape.RACECAR);
        System.out.println(a.getColor());		// test getters gamePieceAppearance class
        System.out.println(a.getShape());
        
        GamePiece b = GamePiece.GREEN_BOOT;		// toString in gamePiece class
        System.out.println(b.toString());
        
    	
    	BoardGame g = new BoardGame();
    	
    	g.addPlayer("lucy", GamePiece.YELLOW_BOOT, Location.KITCHEN);
    	g.addPlayer("paul", GamePiece.BLUE_BOOT, Location.KITCHEN);
    	g.addPlayer("emy", GamePiece.RED_THIMBLE, Location.BALLROOM);
    	g.addPlayer("cesar", GamePiece.BLUE_BOOT, Location.BALLROOM);
    	g.addPlayer("alex", GamePiece.GREEN_BOOT, Location.DINING_ROOM);
    	g.addPlayer("alex", GamePiece.BLUE_BOOT, Location.DINING_ROOM);

    	
    	// getters in the boardGame class
    	
        System.out.println(g.getPlayerGamePiece("emy"));
        System.out.println(g.getPlayerGamePiece("emy").getColor());			// getters in GamePiece class
        System.out.println(g.getPlayerGamePiece("emy").getShape());
        
        System.out.println(g.getPlayerGamePiece("emy").getColor().getB());
        System.out.println(g.getPlayerGamePiece("emy").getColor().getG());	// getters in color class
        System.out.println(g.getPlayerGamePiece("emy").getColor().getR());

        System.out.println(g.getPlayerWithGamePiece(null));
    	System.out.println(g.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));	
    	
        g.movePlayer("alex", Location.BALLROOM);
        System.out.println(g.getPlayersLocation("alex"));
        
        // move two player method
        String[] name = new String[2];
        name[0] = "cesar";
        name[1] = "alex";
        
        Location[] loc = new Location[2];
        loc[0] = Location.CONSERVATORY;
        loc[1] = Location.BILLIARD_ROOM;
        
        System.out.println((g.moveTwoPlayers(name, loc)).toString());
        
        String[] name2 = new String[2];
        name2[0] = "emy";
        name2[1] = "lucy";
        
        Location[] loc2 = new Location[2];
        loc2[0] = Location.HALL;
        loc2[1] = Location.LIBRARY;
        
        System.out.println((g.moveTwoPlayers(name2, loc2)).toString());
        
        // more getters in boardGame class
        System.out.println(g.getPlayersLocation("alex"));
        System.out.println(g.getPlayersAtLocation(Location.BALLROOM));
        System.out.println(g.getPlayersAtLocation(Location.KITCHEN));

        System.out.println(g.getGamePiecesAtLocation(Location.BILLIARD_ROOM));
        System.out.println(g.getPlayers());
        System.out.println(g.getPlayerLocations());
        System.out.println(g.getPlayerPieces());
    }      

}
