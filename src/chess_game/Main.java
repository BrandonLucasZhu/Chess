package chess_game;
import java.util.*;
import game_pieces.*;

public class Main {
	
	private static Board chessBoard = new Board();
	private static String player1 = "Black's turn";
	private static String player2= "White's turn";
	private static int counter=0;
	private static Boolean winner = false;
	
	public static void setupGame() {
	
		King blackKing = new King("black", new Point(3,7,"BK"),chessBoard);
		King whiteKing = new King("white", new Point(3,0,"WK"),chessBoard);
		
		Queen blackQueen = new Queen("black", new Point(4,7,"BQ"),chessBoard);
		Queen whiteQueen = new Queen("white", new Point(4,0,"WQ"),chessBoard);
	
		for (int i = 0; i<8; i++) {
			Pond blackPond = new Pond("black", new Point(i,6,"BP"),chessBoard);
			Pond whitePond = new Pond("white", new Point(i,1,"WP"),chessBoard);
		}
	
		Rook blackRook1 = new Rook("black", new Point(0,7,"BR"),chessBoard);
		Rook blackRook2 = new Rook("black", new Point(7,7,"BR"),chessBoard);
		Rook whiteRook1 = new Rook("white", new Point(0,0,"WR"),chessBoard);
		Rook whiteRook2 = new Rook("white", new Point(7,0,"WR"),chessBoard);
		
		Bishop blackbishop1 = new Bishop("black", new Point(2,7,"BB"),chessBoard);
		Bishop blackbishop2 = new Bishop("black", new Point(5,7,"BB"),chessBoard);
	
		Bishop whitebishop1 = new Bishop("white", new Point(2,0,"WB"),chessBoard);
		Bishop whitebishop2 = new Bishop("white", new Point(5,0,"WB"),chessBoard);
	
		Horse blackHorse1 = new Horse("black", new Point(1,7,"BH"),chessBoard);
		Horse blackHorse2 = new Horse("black", new Point(6,7,"BH"),chessBoard);
		
		Horse whiteHorse1 = new Horse("black", new Point(1,0,"BH"),chessBoard);
		Horse whiteHorse2 = new Horse("black", new Point(6,0,"BH"),chessBoard);
	}
	
	public static void main(String[] args){
		setupGame();
		while (winner == false) {
			chessBoard.displayBoard();
			if (counter % 2 == 0) {
				System.out.println(player1);
			}
			else {
				System.out.println(player2);
			}
			
			System.out.println("Enter Piece name");
			Scanner pickPiece = new Scanner(System.in);
			String inputPiece = pickPiece.nextLine();
			
			System.out.println("Enter coordinate x");
			Scanner turnCommandX = new Scanner(System.in);
			int inputX = turnCommandX.nextInt();
			
			System.out.println("Enter coordinate y");
			Scanner turnCommandY = new Scanner(System.in);
			int inputY = turnCommandY.nextInt();
			
			
			
			Point commandPoint = new Point(inputX,inputY,inputPiece)
			
			chessBoard.get(inputX,inputY);
			
			
			
			counter++;
		}
	}
	
	
	
}
