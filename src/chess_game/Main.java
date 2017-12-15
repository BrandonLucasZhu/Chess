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
	
		chessBoard.addReplacePiece(new King("black", new Point(3,7,"BK"),"KING"));
		chessBoard.addReplacePiece(new King("white", new Point(3,0,"WK"),"KING"));
		
		chessBoard.addReplacePiece(new Queen("black", new Point(4,7,"BQ"),"QUEEN"));
		chessBoard.addReplacePiece(new Queen("white", new Point(4,0,"WQ"),"QUEEN"));
	
		for (int i = 0; i<8; i++) {
			chessBoard.addReplacePiece(new Pawn("black", new Point(i,6,"BP"), "PAWN"));
			chessBoard.addReplacePiece(new Pawn("white", new Point(i,1,"WP"), "PAWN"));
		}
	
		chessBoard.addReplacePiece(new Rook("black", new Point(0,7,"BR"),"ROOK"));
		chessBoard.addReplacePiece(new Rook("black", new Point(7,7,"BR"),"ROOK"));
		chessBoard.addReplacePiece(new Rook("white", new Point(0,0,"WR"),"ROOK"));
		chessBoard.addReplacePiece(new Rook("white", new Point(7,0,"WR"),"ROOK"));
		
		chessBoard.addReplacePiece(new Bishop("black", new Point(2,7,"BB"),"BISHOP"));
		chessBoard.addReplacePiece(new Bishop("black", new Point(5,7,"BB"),"BISHOP"));
	
		chessBoard.addReplacePiece(new Bishop("white", new Point(2,0,"WB"),"BISHOP"));
		chessBoard.addReplacePiece(new Bishop("white", new Point(5,0,"WB"),"BISHOP"));
	
		chessBoard.addReplacePiece(new Horse("black", new Point(1,7,"BH"),"HORSE"));
		chessBoard.addReplacePiece(new Horse("black", new Point(6,7,"BH"),"HORSE"));
		
		chessBoard.addReplacePiece(new Horse("white", new Point(1,0,"WH"),"HORSE"));
		chessBoard.addReplacePiece(new Horse("white", new Point(6,0,"WH"),"HORSE"));
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
			
			System.out.println("Enter coordinate initial x");
			Scanner turnCommandX = new Scanner(System.in);
			int inputX = turnCommandX.nextInt();
			
			System.out.println("Enter coordinate initial y");
			Scanner turnCommandY = new Scanner(System.in);
			int inputY = turnCommandY.nextInt();
			
			Point initialPoint = new Point(inputX,inputY,inputPiece);
			
			System.out.println("Enter coordinate final x");
			Scanner turnCommandX2 = new Scanner(System.in);
			int inputX2 = turnCommandX2.nextInt();
			
			System.out.println("Enter coordinate final y");
			Scanner turnCommandY2 = new Scanner(System.in);
			int inputY2 = turnCommandY2.nextInt();
			
			Point finalPoint = new Point(inputX2,inputY2,inputPiece);
			
			chessBoard.movePieceTo(initialPoint,finalPoint);
			
			
			
			//chessBoard.get(inputX,inputY);
			
			
			
			counter++;
		}
	}
	
	
	
}
