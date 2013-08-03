package pieces;

public class Pawn {
	public static final String WHITE = "white";
	public static final String BLACK = "black";
	String color;

	public Pawn(){
		color = WHITE;
	}

	 public Pawn(String color) {
		 this.color = color;
	 }

	String getColor() {
		
		return color;
	}
}
