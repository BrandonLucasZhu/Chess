package game_pieces;
import chess_game.Pieces;
import chess_game.Point;

public class Rook extends Pieces{
	
	private int x_movement; // Linear direction
	private int y_movement;
	private String colour; //White or black
	
	Rook (String colour,Point startCoordinate,Point endCoordinate){
		super(colour,startCoordinate,endCoordinate);
		
	}
	
	public Point moveType(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		
		if (x_movement == 0 && y_movement != 0) {
			startCoordinate = endCoordinate; 
		}
		else {
			startCoordinate = endCoordinate;
		}
		
		return startCoordinate;
		
	}
		

}
