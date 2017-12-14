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
	
	public String getColour() {
		return colour;
	}
	
	public void moveTo() {
		
	}
	
	
	public abstract boolean moveTypeValid(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour);
	
}
