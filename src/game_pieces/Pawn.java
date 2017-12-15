package game_pieces;
import java.lang.Math;

import chess_game.Board;
import chess_game.Pieces;
import chess_game.Point;

public class Pawn extends Pieces{

	private int x_movement; //+1 or -1 Y-direction
	private int y_movement;; // +1 or -1 X-direction
	
	
	
	public Pawn (String colour,Point startCoordinate,String type){
		super(colour,startCoordinate,type);
	}
	
	public boolean moveTypeValid(Point startCoordinate, Point endCoordinate, Boolean pieceExists, String colour) {
		int Ax = startCoordinate.getX();
		int Ay = startCoordinate.getY();
		int Bx = endCoordinate.getX();
		int By = endCoordinate.getY();
		
		x_movement = Bx - Ax; 
		y_movement = By - Ay;
		boolean isValid;
		
		
		if ((Ay == 6 || Ay == 1) && Math.abs(y_movement) <= 2 && pieceExists == false)  {
			//Allowed to move two spaces for first move
			isValid = true;
		}
		else if (Math.abs(y_movement) == 1) {
			//Allowed to only move one space regular move
			isValid = true;
		}
		else if (Math.abs(x_movement) == 1 && Math.abs(y_movement) == 1 && pieceExists == true) {
			isValid = true;
		}
		else {
			isValid = false; //Return piece back to original spot cause of illegal move
		}
	return isValid;	
	}
	
	
	
	
}
