package chess;

import junit.framework.TestCase;

import java.util.ArrayList;

import pieces.Pawn;

public class BoardTest extends TestCase {
	public void testname() throws Exception {
		Board board = new Board();
		Pawn whitePawn = new Pawn (Pawn.WHITE);
		Pawn blackPawn = new Pawn (Pawn.BLACK);
		board.addPawn(whitePawn);
		board.addPawn(blackPawn);
		assertEquals(2, board.getNumOfPawn());
		ArrayList<Pawn> pawn = new ArrayList<Pawn>();
		pawn = board.getPawns();
		assertTrue(board.pawnList.contains(blackPawn));
		assertTrue(pawn.contains(blackPawn));
		
	}
}
