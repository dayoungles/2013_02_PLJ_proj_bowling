package pieces;

public class Piece {
	public static final String WHITE = "white";
	public static final String BLACK = "black";
	public static final String EMPTY = "empty";
	public static final char SYMBOL_WHITE = 'p';
	public static final char SYMBOL_BLACK = 'P'; 
	public static final char SYMBOL_NONE = '.';
	
	private String color;
	private char symbol;


	 private Piece(String color, char symbol) {
		 this.color = color;
		 this.symbol = symbol;
	 }

	String getColor() {
		return color;
	}
	public char getSymbol(){
		return symbol;
	}
	
	public static Piece create(String name, char symbol){
		return new Piece(name, symbol);
	}
}
