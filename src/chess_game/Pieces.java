package chess_game;

public class Pieces {
	
	private Boolean isWhite; 
	private Point startCoordinate;
	private Point endCoordinate;
	
	Pieces(Boolean isWhite, Point startCoordinate, Point endCoordinate) {
		this.isWhite = isWhite;
		this.startCoordinate = startCoordinate;
		this.endCoordinate = endCoordinate; 
	}
	
	public Point getStartCoord() {
		return startCoordinate;
	}
	
	public Point getEndCoord() {
		return endCoordinate;
	}
	
	public Boolean getColour() {
		return isWhite;
	}
	
	
	public Boolean canMove() {
		return true;
	}
	
	
}
