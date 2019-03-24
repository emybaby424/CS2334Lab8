
public class BoardGame {
  /**
	 * Each player is associated with a unique game piece (i.e.
	 */
	protected  LinkedHashMap<String, GamePiece> playerPieces;
  
	/**
	 * Each player places their game piece at a location on the board, 
	 * as defined by the Location enum.
	 */
	protected LinkedHashMap<String, Location> playerLocations;
  
  /**
  * BoardGame Constructor
  */
  public BoardGame(){
  }
  
  
  /**
	 * Adds a player to the board game object. Players are uniquely associated with a game piece. 
	 * These game pieces represent the player in the board game. 
	 * Each player has only one game piece, and each game piece can be associated with only one player. 
	 * As such, when adding a player, a check must be done to ensure that a player is not already associated with the game piece. 
	 * Players are represented by their names. Players/GamePieces are given a location in the board game (a location inside a mansion). 
	 * Multiple Players/GamePieces may be in the same location. 
	 * Remember that a player is uniquely associated with a single game piece, so a "player at a location" is essentially the same as a "game piece at a location".
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
		
	}
	
	
	/**
	 * Given a player's name, find the game piece associated with that player. 
	 * Remember that game pieces are unique, and are assigned to a unique player (i.e. it is a one-to-one relationship).
	 */
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces().get(playerName);
		
	}
	
	
	/**
	 * Given a game piece, find the player associated with that game piece. 
	 * Remember that game pieces are unique, and are assigned to a unique player (i.e. it is a one-to-one relationship).
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		
		return playerPieces().get(gamePiece);
			}

	
	
	/**
	 * Moves a player to a new location in the board game. 
	 * Remember that a player is uniquely associated with a single game piece, so "moving the player" 
	 * is essentially equivalent to "moving the player's game piece".
	 */
	public void movePlayer(String playerName, Location newLocation) {
		
		playerLocations().put(playerName, newLocation);
			}
	
	
	
	/*
	 * Method to use when two players each want to move at the same time. 
	 * Movements must be taken individually, so the system must determine which player moves first. 
	 * Each player is associated with a game piece, and game pieces determine who moves first by the movesFirst() method. 
	 * That is, the player that move first is the player with the game piece that has the first priority. 
	 * You may assume that the arrays are always the appropriate length. Index i in the player array is associated with index i in the locations array. 
	 * That is, the player at players[i] wishes to move to the location at newLocations[i]. 
	 * You should leverage the code in the movePlayer() method.
	 */
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
		for(int index = 0; index < playerNames.length; index++) {
			for(int jndex = 0; jndex < playerNames.length; jndex++) {
				if(index != jndex) {
					GamePiece one = getPlayerGamePiece(playerNames[index]);
					GamePiece two = getPlayerGamePiece(playerNames[jndex]);
					
					GamePiece three = one.movesFirst(one,two);
				}
				
				
			}
		
		}
		
	}
	
	
	/*
	 *Gets the location of a player. Be careful that you don't confuse this with getPlayerLocations!
	 */
	public Location getPlayersLocation(String player) {
		return playerLocations().get(player);
	}
	
	
	/*
	 * Given a location, find all players at that location.
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc) {
		int counter = 0;
		Set<String> players = playerLocations().keySet();
		for (Location place: playerLocations().values()) {
			if(loc==playerLocations().values()) {
				counter++;
			}
			else {
				players.remove(counter);
				
			}
		}
		ArrayList<String> playersHere = new ArrayList<String>();
		 for(String index: players) {
			 playersHere.add(index);
		 }
		 return playersHere;

	}
	
	//Given a location
	//find the game pieces associated with all the players at that location.
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
		Set<GamePiece>pieces = new HashSet<GamePiece>();
		int counter = 0;
		Set<String> players = playerLocations().keySet();
		for (Location place: playerLocations().values()) {
			if(loc==playerLocations().values()) {
				counter++;
			}
			else {
				players.remove(counter);
				
			}
		}
		int counter2 = 0;
 ArrayList<String> newPlay = new ArrayList<String>();
 for(String index: players) {
	 newPlay.add(index);
 }
    
	
		for (String matchName: playerPieces().keySet()) {
        	   if(newPlay.get(counter2)==matchName) {
        		   pieces.add(playerPieces().get(matchName));
        	   }
    } 
		ArrayList<GamePiece> returning = new ArrayList<GamePiece>();
		for(GamePiece newOnes: pieces) {
			returning.add(newOnes);
		}
		return returning;
	}
	
	
	/*
	 * Gets all players recorded in the game.
	 */
	public Set<String> getPlayers() {
		Set<String>keys = playerPieces().keySet();
		return keys;	
	}
	
	
	/*
	 * Gets all locations that the players are at (not all possible locations).
	 */
	public Set<Location> getPlayerLocations() {
		Set<Location>places= new HashSet<Location>();
		for (Location place: playerLocations().values()) {
        	   places.add(place);
    } 
		
		return places;

		
	}
	
	
	/*
	 * Gets all game pieces associated with the players (not all possible game pieces).
	 */
	public Set<GamePiece> getPlayerPieces() {
		Set<GamePiece>pieces = new HashSet<GamePiece>();
		for (GamePiece piece: playerPieces().values()) {
        	   pieces.add(piece);
    } 
		
		return pieces;
	}
}
  
}
