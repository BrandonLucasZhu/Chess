package chess_game;

public class Board {
	
	private Point[][] grid = new Point[8][8];
	private Pieces[][] piece = new Pieces[8][8]; 
	
	public Board() {
		for (int i = 0; i < grid.length;i++) {
			for (int j=0; j < grid[i].length;j++) {
				this.grid[i][j] = new Point(i,j,"00");//Create board
			}
		}
		
	}

	public void addReplacePiece (Pieces chessPiece) {
		grid[chessPiece.getLocation().getX()][chessPiece.getLocation().getY()] = chessPiece.getLocation();
		piece[chessPiece.getLocation().getX()][chessPiece.getLocation().getY()] = chessPiece;
	}
	
	
	public void replacePoint(Point location) { //Method to set-up initial start of the game
		grid[location.getX()][location.getY()]=location;
	}
	
	public void movePieceTo(Point initialCoord, Point finalCoord) {
		grid[finalCoord.getX()][finalCoord.getX()].setPrint(piece[initialCoord.getX()][initialCoord.getY()].getLocation().getPrint()); 
		grid[initialCoord.getX()][initialCoord.getY()].setPrint("00"); //Set previous board space blank
		piece[finalCoord.getX()][finalCoord.getX()]=piece[initialCoord.getX()][initialCoord.getY()];
		piece[initialCoord.getX()][initialCoord.getY()] = null;
	}
	
	
	public Boolean isPiece(Point pieceLocation) { //Check if that coordinate has a piece
		if (grid[pieceLocation.getX()][pieceLocation.getY()].getPrint() != "00") {
			return true; //Check if not an empty spot
		}
		return false; 
	}
	
	
	public Point getPoint(int x, int y) {
	     return grid[x][y];
	}
	
	/*
	public void Move(Point initial,Point end) {
		grid[end.getX()][end.getY()].setPrint(initial.getPrint()); //Set piece to new location
		grid[initial.getX()][initial.getY()].setPrint(end.getPrint()); // Change old location to blank tile
	}
	*/
	
	public void displayBoard(){
		for (int i = grid[0].length-1; i >= 0; i--){
		      for (int j = grid.length-1; j >= 0; j--){
		    	  System.out.print(grid[j][i].getPrint() + " ");
		      }
		      System.out.println();
		}
		//System.out.print(piece[0][0].getLocation().getPrint());
		
	}
	

}
