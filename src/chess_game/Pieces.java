package chess_game;
import game_pieces.Pond;
import game_pieces.Bishop;
import game_pieces.Horse;
import game_pieces.King;
import game_pieces.Queen;
import game_pieces.Rook;


public abstract class Pieces {
	
	private String colour; 
	private Point location;
	private String type;
	
	
	public Pieces(String colour, Point location, String type) {
		this.colour = colour;
		this.location = location;
		this.type = type;
	}
	
	public Point getLocation() {
		return location;
	}
	
	
	
	public String getColour() {
		return colour;
	}
	
	
	@Override
	public String toString(){
	    return null;
	}
	
	/*
	public void moveTo(Point startCoordinate, Point endCoordinate,Boolean pieceExists, String colour) {
		if (this.moveTypeValid(startCoordinate,endCoordinate, pieceExists, colour)) {
			Move(startCoordinate, endCoordinate);
		}
		
	}
	*/
	
	public abstract boolean moveTypeValid(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour);
	
}
