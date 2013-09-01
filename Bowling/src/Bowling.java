import java.util.ArrayList;
import java.util.List;

/**
 * 가지고 있어야 할 기능 1. 프린트(보드 프린트, (심볼 프린트, 스코어 프린트)) 2. 프레임 간 계산 기능
 * 
 * @author dayoungle
 * 
 */
public class Bowling {

	/*
	 * 플레이 순서 rolling -> 점수 받음 ->(계산 -> 출력할지 출력하지 않을지 고려) ->출력/대기
	 */
	Rolling rolling = new Rolling();

	/**
	 * 화면 전체 출력
	 */
	void printBoard() {
		System.out.println("------------------------------------------");
		System.out.printf("|");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%2d |", i + 1);
		}
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.print("|");
		printSymbolLine();
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.print("|");
		int sum = 0;
		for (int i : rolling.score) {
			sum += i;
			System.out.printf("%3d|", sum);
		}
		System.out.println();
	}

	/**
	 * 심볼라인 출력
	 */
	void printSymbolLine() {
		for (int frameCount = 0; frameCount < rolling.frameList.size(); frameCount++) {
			Frame f = rolling.frameList.get(frameCount);
			for (int throwCount = 0; throwCount < 3; throwCount++) {
				if ((frameCount == 9 && f.getPin(0).getCollapsedPin() != 10 || frameCount != 9)
						&& throwCount == 2)
					break;

				if (f.getThrowNumber() <= throwCount)
					System.out.printf(" |");
				else
					System.out.printf("%c|", f.getPin(throwCount).getSymbol());
			}
		}
	}

	/**
	 * 1플레이어 볼링 게임.
	 * 
	 * @throws gameOverException
	 */
	void letsBowling() throws gameOverException {
		int frameCount;
		for (frameCount = 0; frameCount < 10; frameCount++) {
			rolling.roll(frameCount);
			printBoard();
		}
		if (frameCount > 10) {
			throw new gameOverException("Game over");
		}
	}

}
