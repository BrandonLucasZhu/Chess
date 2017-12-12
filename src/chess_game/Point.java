package chess_game;

public class Point {

	private int x, y;
	private String boardPrint; //Print the points out to see visually 
	 
	public Point(int i, int j, String boardPrint) {
		x = i; 
		y = j;
		this.boardPrint = boardPrint;
	}
	 
	public int getX() {
		return x; 
	}
	
	public int getY(){
		return y;
	}
	
	public String getPrint() {
		return boardPrint;
	}
	 
	public void setX(int i) {
		x=i; 
	}
	 
	public void setY(int j) {
		y=j; 
	}
	
	public void setPrint(String symbol) {
		boardPrint = symbol; 
	}
	 
	
	 
}
