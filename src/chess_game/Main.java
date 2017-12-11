package chess_game;
import java.util.*;
import game_pieces.*;

public class Main {
	
	private static Board chessBoard = new Board(); 
	
	public static void setupGame() {
	
	Queen whiteQueen = new Queen("white", new Point(0,3,"WQ"));
	}
	
	public static void main(String[] args){
		setupGame();
		chessBoard.displayBoard();
		
	}
	
	
	
}
