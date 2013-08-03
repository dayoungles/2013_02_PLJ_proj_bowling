package pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {

	public void testCreate() throws Exception {
		Pawn p = new Pawn(Pawn.WHITE);
		assertEquals(Pawn.WHITE, p.getColor());
		Pawn p2 = new Pawn(Pawn.BLACK);
		assertEquals(Pawn.BLACK, p2.getColor());
		Pawn pawnNoColor = new Pawn();
		assertEquals("white", pawnNoColor.getColor());
		
	}
}
