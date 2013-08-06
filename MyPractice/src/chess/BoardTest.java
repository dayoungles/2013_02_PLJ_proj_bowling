package chess;

import junit.framework.TestCase;

import java.util.ArrayList;

import pieces.Piece;

public class BoardTest extends TestCase {
//	public void testname() throws Exception {
//		Board board = new Board();
//		assertEquals(8, board.getNumOfPawn());
//		Pawn whitePawn = new Pawn (Pawn.WHITE, 'p');
//		Pawn blackPawn = new Pawn (Pawn.BLACK, 'P');
//		
//		board.addPawn(whitePawn);
//		board.addPawn(blackPawn);
//		assertEquals(2, board.getNumOfPawn());
//		
//		ArrayList<Pawn> pawn = new ArrayList<Pawn>();
//		pawn = board.getPawns();
//		assertTrue(board.pawnList.contains(blackPawn));
//		assertTrue(pawn.contains(blackPawn));
//	}
	
	public void testCreate() throws Exception {
		Board board = new Board();
		//assertEquals("pppppppp", board.printRow());
		//assertEquals("PPPPPPPP", board.printRow());
		board.printRow();
		
	}
}
