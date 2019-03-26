public class Driver {
	
    public static void main(String[] args) {
    	BoardGame g = new BoardGame();
    	g.addPlayer("lucy", GamePiece.YELLOW_BOOT, Location.KITCHEN);
    	g.addPlayer("paul", GamePiece.BLUE_BOOT, Location.KITCHEN);

    	System.out.println(g.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
    }
}
