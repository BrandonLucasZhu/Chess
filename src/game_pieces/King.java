package game_pieces;
import chess_game.Board;
import chess_game.Pieces;
import chess_game.Point;

public class King extends Pieces{

	private int x_movement; // Linear and diagonal direction
	private int y_movement;
	private String colour; //White or black
	
	
	public King (String colour,Point startCoordinate,String type){
		super(colour,startCoordinate,type);
	}
	
	public boolean moveTypeValid(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		Boolean isValid;
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		
		
		if (x_movement == 0 && y_movement == 1) {
			isValid = true; //Linear direction
		}
		else if (x_movement != 0 && y_movement == 1) {
			isValid = true;
		}
		else if (Math.abs(x_movement) == 1 && Math.abs(y_movement) == 1) {
			isValid = true; //diagonal direction
		}
		else {
			isValid = false;
		}
		return isValid;
		
	}
		


	
}
