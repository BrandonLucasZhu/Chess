package chess_game;

public class Board {
	
	private Point[][] grid = new Point[8][8];
	
	public Board() {
		for (int i = 0; i < grid.length;i++) {
			for (int j=0; j < grid[i].length;j++) {
				this.grid[i][j] = new Point(i,j,"00");//Create board
			}
		}
	}
	
	public void replacePoint(Point location) {
		grid[location.getX()][location.getY()]=location;
	}
	
	public Point getPoint(int x, int y) {
	     return grid[x][y];
	}
	
	public void Move(Point initial,Point end) {
		grid[end.getX()][end.getY()].setPrint(initial.getPrint()); //Set piece to new location
		grid[initial.getX()][initial.getY()].setPrint(end.getPrint()); // Change old location to blank tile
	}
	
	
	
	
	public void displayBoard(){
		
		for (int i = grid[0].length-1; i >= 0; i--){
		      for (int j = grid.length-1; j >= 0; j--){
		    	  System.out.print(grid[j][i].getPrint() + " ");
		      }
		      System.out.println();
		}
		
	}
	

}
