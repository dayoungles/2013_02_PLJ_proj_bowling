package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {

	public void testCreate() throws Exception {
		Piece p = Piece.create(Piece.WHITE, Piece.SYMBOL_WHITE);
		assertEquals(Piece.WHITE, p.getColor());
		Piece p2 = Piece.create(Piece.BLACK, Piece.SYMBOL_BLACK);
		assertEquals(Piece.BLACK, p2.getColor());
		Piece pieceNoColor = Piece.create(Piece.EMPTY, Piece.SYMBOL_NONE);
		assertEquals("empty", pieceNoColor.getColor());
		
	}
}
