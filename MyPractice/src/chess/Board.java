package chess;

import java.util.ArrayList;

import pieces.Pawn;

public class Board {
	ArrayList<Pawn> pawnList = new ArrayList<Pawn>();
	int numOfPawn =0;
	
	void addPawn(Pawn pawn){
		pawnList.add(pawn);
	}

	int getNumOfPawn() {
		return pawnList.size();
	}
	
	ArrayList<Pawn> getPawns(){
		return pawnList;
	}
}
