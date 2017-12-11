package game_pieces;
import java.lang.Math;
import chess_game.Pieces;
import chess_game.Point;

public class Pond extends Pieces{

	private int x_movement; //+1 or -1 Y-direction
	private int y_movement;; // +1 or -1 X-direction
	private String colour; //White or black
	private String displayPond;
	
	Pond (String colour,Point startCoordinate,Point endCoordinate,String displayPond){
		super(colour,startCoordinate,endCoordinate);
		this.displayPond = displayPond;
	}
	
	public Point moveType(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		
		
		if ((Ay == 6 || Ay == 1) && Math.abs(y_movement) <= 2 && pieceExists == false)  {
			Ay = Ay + y_movement;
			startCoordinate.setY(Ay); //Allowed to move two spaces for first move
		}
		else if (Math.abs(y_movement) == 1) {
			Ay = Ay + y_movement;
			startCoordinate.setY(Ay); //Allowed to only move one space regular move
		}
		else if (Math.abs(x_movement) == 1 && Math.abs(y_movement) == 1 && pieceExists == true) {
			Ax = Ax + x_movement;
			Ay = Ay + y_movement;
			startCoordinate.setX(Ax);
			startCoordinate.setY(Ay);
		}
		else {
			startCoordinate = endCoordinate; //Return piece back to original spot cause of illegal move
		}
	return startCoordinate; 	
	}
	
	
	
	
}
