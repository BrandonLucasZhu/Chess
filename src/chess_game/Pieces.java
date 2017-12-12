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
	private Board board;
	
	protected Pieces(String colour, Point location, Board board) {
		this.colour = colour;
		this.location = location;
		this.board = board;
		board.replacePoint(location);
	}
	
	public Point getLocation() {
		return board.getPoint(location.getX(),location.getY());
	}
	
	public void setLocation(Point prevLocation, Point newLocation) {
		board.Move(prevLocation, newLocation);
	}
	
	
	public String getColour() {
		return colour;
	}
	
	
	public Boolean canMove() {
		return true;
	}
	
	
}
