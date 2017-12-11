package game_pieces;
import chess_game.Point;
import chess_game.Pieces;

public class Bishop extends Pieces{

	private int x_movement; // Linear and diagonal direction
	private int y_movement;
	private String colour; //White or black
	
	Bishop (String colour,Point startCoordinate,Point endCoordinate){
		super(colour,startCoordinate,endCoordinate);
		
	}
	
	public Point moveType(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		

		if (x_movement == y_movement) {
			startCoordinate = endCoordinate; //diagonal direction
		}
		
		return startCoordinate;
		
	}
		
	
}
