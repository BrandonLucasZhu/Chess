package chess_game;
import game_pieces.Pond;
import game_pieces.Bishop;
import game_pieces.Horse;
import game_pieces.King;
import game_pieces.Queen;
import game_pieces.Rook;


public class Pieces {
	
	private String colour; 
	private Point location;

	
	protected Pieces(String colour, Point location) {
		this.colour = colour;
		this.location = location;

	}
	
	public Point getLocation() {
		return location;
	}
	
	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	
	public String getColour() {
		return colour;
	}
	
	
	public Boolean canMove() {
		return true;
	}
	
	
}
