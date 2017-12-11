package chess_game;

public class Board {
	
	private Point[][] grid = new Point[8][8];
	
	public Board() {
		for (int i = 0; i < grid.length;i++) {
			for (int j=0; j < grid[i].length;j++) {
					this.grid[i][j] = new Point(i,j);//Create board
			}
		}
	}
	
	public Point getPoint(int x, int y) {
	        return grid[x][y];
	}
	
	

}
