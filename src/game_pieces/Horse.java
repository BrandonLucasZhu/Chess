package game_pieces;
import chess_game.Board;
import chess_game.Pieces;
import chess_game.Point;

public class Horse extends Pieces{
	
	private int x_movement; // L shape path
	private int y_movement;
	private String colour; //White or black
	
	public Horse (String colour,Point startCoordinate,Board board){
		super(colour,startCoordinate,board);
	}
	
	public boolean moveTypeValid(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		Boolean isValid;
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		
		
		//L shape path direction
		if (Math.abs(x_movement) == 1 && Math.abs(y_movement) == 2) {
			isValid = true; 
		}
		else if (Math.abs(x_movement) == 2 && Math.abs(y_movement) == 1) {
			isValid = true;
		}
		else {
			isValid = false;
		}
		return isValid;
		
	}
		

}
