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
	
	public String getType() {
		return type;
	}
	
	
	public String getColour() {
		return colour;
	}
	
	
	@Override
	public String toString(){
	    return null;
	}
	
	
	/*8 queens project after
	 * 
	 * Win method() loop through all the pieces check if the king is in check or checkmate
	 * 
	 * another project
	 * two families of classes that would implement the functionality in different ways
	 * 
	 * project
	 * subject observer pattern handling notifications
	 * When one object is changed then all other objects are notified and changed
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	/*
	public void moveTo(Point startCoordinate, Point endCoordinate,Boolean pieceExists, String colour) {
		if (this.moveTypeValid(startCoordinate,endCoordinate, pieceExists, colour)) {
			Move(startCoordinate, endCoordinate);
		}
		
	}
	*/
	
	public abstract boolean moveTypeValid(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour);
	
}
