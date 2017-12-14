package game_pieces;
import chess_game.Board;
import chess_game.Pieces;
import chess_game.Point;

public class Rook extends Pieces{
	
	private int x_movement; // Linear direction
	private int y_movement;
	private String colour; //White or black

	
	public Rook (String colour,Point startCoordinate,Board board){
		super(colour,startCoordinate,board);
	}
	
	public boolean moveTypeValid(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		boolean isValid; 
		
		if (x_movement == 0 && y_movement != 0) {
			isValid = true; 
		}
		else if (x_movement != 0 && y_movement == 0) {
			isValid = true;
		}
		else {
		isValid = false;
		}
		
		return isValid;
	}
		

}
