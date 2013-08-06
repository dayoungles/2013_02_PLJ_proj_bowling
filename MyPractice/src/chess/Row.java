package chess;

import java.util.ArrayList;

import pieces.Piece;

public class Row {
	//ArrayList<ArrayList<Pawn>> rowStandard = new ArrayList<ArrayList<Pawn>>();
	ArrayList<Piece> eachRow = new ArrayList<Piece>();
	/**
	 * Row생성자에서 폰을 받는 어레이 리스트인 8칸의 eachRow를 규정 
	 */
	Row(){
		//rowStandard.ensureCapacity(8);
		for(int i = 0; i <8; i++){
			ArrayList<Piece> eachRow = new ArrayList<Piece>();
			eachRow.ensureCapacity(8);
			//rowStandard.add(eachRow);
		}
	}
	/**
	 * eachRow 한 줄에 흰 폰 여덟개. 
	 */
	void initRowWhite(){
		for (int fillColumn = 0; fillColumn < 8; fillColumn++) {
			eachRow.add(Piece.create(Piece.WHITE, Piece.SYMBOL_WHITE));
			//System.out.println(eachRow.get(fillColumn).getSymbol());
		}
	}
	void initBlack(){
		for (int fillColumn = 0; fillColumn < 8; fillColumn++) {
			eachRow.add(Piece.create(Piece.BLACK, Piece.SYMBOL_BLACK));
			//System.out.println(rows.get(index).get(fillColumn).getSymbol());

		}
	}
	void initEmpty(){
		for (int fillColumn = 0; fillColumn < 8; fillColumn++) {
			eachRow.add(Piece.create(Piece.EMPTY, Piece.SYMBOL_NONE));
			//System.out.println(rows.get(index).get(fillColumn).getSymbol());

		}
	}
	/**
	 * 각 행을 스트링으로 작성 
	 * @return 각 행의 심볼 여덟
	 */
	String printEachRowSymbol(){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <8; i++){
			sb.append(eachRow.get(i).getSymbol());
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	void print2debug(){ 
		//for (int row = 0; row < 8; row++) {
			for (int column = 0; column < 8; column++) {
				System.out.print(eachRow.get(column).getSymbol());
			}
			System.out.println();
		//}
	}
}
