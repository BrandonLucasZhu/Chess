package game_pieces;
import chess_game.Pieces;
import chess_game.*;
import chess_game.Point;

public class Queen extends Pieces{

	private int x_movement; // Linear and diagonal direction
	private int y_movement;
	private String colour; //White or black
	
	
	public Queen (String colour,Point startCoordinate){
		super(colour,startCoordinate);
	}
	
	public Point moveType(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		
		if (x_movement == 0 && y_movement != 0) {
			startCoordinate = endCoordinate; //Linear direction
		}
		else if (x_movement != 0 && y_movement == 0) {
			startCoordinate = endCoordinate;
		}
		else if (x_movement == y_movement) {
			startCoordinate = endCoordinate; //diagonal direction
		}
		
		return startCoordinate;
		
	}
		


	
}
