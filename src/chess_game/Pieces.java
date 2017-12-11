package chess_game;
import game_pieces.Pond;
import game_pieces.Bishop;
import game_pieces.Horse;
import game_pieces.King;
import game_pieces.Queen;
import game_pieces.Rook;


public class Pieces {
	
	private String colour; 
	private Point startCoordinate;
	private Point endCoordinate;
	
	protected Pieces(String colour, Point startCoordinate, Point endCoordinate) {
		this.colour = colour;
		this.startCoordinate = startCoordinate;
		this.endCoordinate = endCoordinate; 
	}
	
	public Point getStartCoord() {
		return startCoordinate;
	}
	
	public Point getEndCoord() {
		return endCoordinate;
	}
	
	public String getColour() {
		return colour;
	}
	
	
	public Boolean canMove() {
		return true;
	}
	
	
}
