package game_pieces;

import chess_game.Point;

public class Pond extends Pieces{

	private int movement; //+1 or -1 Y-direction
	private String colour; //White or black
	
	Pond (Boolean isWhite,Point startCoordinate,Point endCoordinate){
		super(isWhite,startCoordinate,endCoordinate);
	}
	
	public Point moveType(Point p) {
		int Ax = p.getX();
		int Ay = p.getY();
		
		
	}
	
	
	
}
