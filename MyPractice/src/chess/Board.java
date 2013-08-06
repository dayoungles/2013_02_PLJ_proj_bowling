package chess;

import java.util.ArrayList;

import org.junit.internal.runners.model.EachTestNotifier;

import pieces.Piece;

public class Board {
	private static final String NEW_LINE = System.getProperty("line.separator");
	//ArrayList<Pawn> pawnList = new ArrayList<Pawn>();
	ArrayList<Piece> boardRow = new ArrayList<Piece>();
	ArrayList<Row> standardRow = new ArrayList<Row>();
	Row rowObject = new Row();
	

	Board() {
		initialize();
	}

//	void addPawn(Pawn pawn) {
//		pawnList.add(pawn);
//	}

//	int getNumOfPawn() {
//		return pawnList.size();
//	}

//	ArrayList<Pawn> getPawns() {
//		return pawnList;
//	}

	void initialize() {
		for (int rowNum = 0; rowNum <8; rowNum ++){
			Row eachRow = new Row();
			if (rowNum == 1){ 
				eachRow.initRowWhite();
			}else if (rowNum == 6){
				eachRow.initBlack();
			}else{ 
				eachRow.initEmpty();
			}
			standardRow.add(eachRow);//standard가 eachRow를 받으려면 어레이리스트 타입이 Row 여야 한다.
			
		}
	}

	String printRow() {
		StringBuilder buffer = new StringBuilder();
//		ArrayList<Pawn> rowNum = board.boardRow.get(i);
		for (int row = 0; row < 8; row++) {
			Row newRow = new Row();
			newRow = standardRow.get(row);
			buffer.append(newRow.printEachRowSymbol());
			//buffer.append(newRow.printEachRow());
			buffer.append(NEW_LINE);
		}
		//System.out.println(buffer);
		return buffer.toString();
	}
}
