package game_pieces;
import chess_game.*;

public class Queen extends Pieces{

	private int x_movement; // Linear and diagonal direction
	private int y_movement;
	private String colour; //White or black
	
	
	public Queen (String colour,Point startCoordinate,String type){
		super(colour,startCoordinate,type);
	}
	
	public boolean moveTypeValid(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		Boolean isValid;
		
		if (x_movement == 0 && y_movement != 0) {
			isValid = true; //Linear direction
		}
		else if (x_movement != 0 && y_movement == 0) {
			isValid = true;
		}
		else if (x_movement == y_movement) {
			isValid = true; //diagonal direction
		}
		else {
			isValid = false;
		}
		return isValid;
		
	}
		


	
}
