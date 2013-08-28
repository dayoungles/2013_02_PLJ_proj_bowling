import java.util.ArrayList;

/**
 * 가지고 있어야 할 기능
 * 1. 프린트
 * 2. 프레임 간  계산 기능 
 * 
 * @author dayoungle
 *
 */
public class Bowling {
	
/*
 * 플레이 순서
 * rolling -> 점수 받음 ->(계산 -> 출력할지 출력하지 않을지 고려) ->출력/대기 
 */
	Rolling rolling = new Rolling();
	/**
	 * 화면 전체 출력
	 */
	void printBoard(){
		System.out.println("------------------------------------------");
		System.out.println("| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |");
		System.out.println("------------------------------------------");
		printSymbolLine();
		System.out.println();
		
		System.out.println("------------------------------------------");
		System.out.println("Score Line");
	}
	
	/**
	 * 심볼라인 출력 
	 */
	void printSymbolLine() {
		for (int frameCount =0; frameCount < rolling.frameList.size(); frameCount++){
			for(int throwCount = 0; throwCount < 2; throwCount++){
				System.out.printf("%c|", rolling.frameList.get(frameCount).getPinFromFrame(throwCount).getSymbol());
			}
		}
	}
	
	/**
	 * 1플레이어 볼링 게임. 
	 */
	void letsBowling(){
		for (int frameCount = 0; frameCount <10; frameCount ++){
			rolling.roll(frameCount);
			printBoard();
		}
	}
	
	
}
