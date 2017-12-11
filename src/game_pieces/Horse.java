package game_pieces;
import chess_game.Pieces;
import chess_game.Point;

public class Horse extends Pieces{
	
	private int x_movement; // L shape path
	private int y_movement;
	private String colour; //White or black
	private String displayHorse;
	
	Horse (String colour,Point startCoordinate,Point endCoordinate,String displayHorse){
		super(colour,startCoordinate,endCoordinate);
		this.displayHorse = displayHorse;
	}
	
	public Point moveType(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		
		//L shape path direction
		if (Math.abs(x_movement) == 2 && Math.abs(y_movement) == 3) {
			startCoordinate = endCoordinate; 
		}
		else if (Math.abs(x_movement) == 3 && Math.abs(y_movement) == 2) {
			startCoordinate = endCoordinate;
		}
		
		return startCoordinate;
		
	}
		

}
