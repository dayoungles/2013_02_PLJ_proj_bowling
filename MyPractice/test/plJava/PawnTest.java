package plJava;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	String WHITE = "white";
	String BLACK = "black";
	public void testCreate() throws Exception {
		Pawn p = new Pawn("white");
		assertEquals(WHITE, p.getColor());
		Pawn p2 = new Pawn("black");
		assertEquals(BLACK, p2.getColor());
		
	}
}
