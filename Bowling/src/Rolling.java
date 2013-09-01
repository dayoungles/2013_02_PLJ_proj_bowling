import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rolling {

	int frameNumber = 0;
	int temp = 0;
	String tempSpare;
	protected List<Frame> frameList = new ArrayList<Frame>();
	List<Integer> score = new ArrayList<Integer>();
	String CALC_WAITING = " ";

	Frame newPinList;

	/**
	 * 핀의 개수를 사용자로부터 입력받음
	 * 
	 * @param reaminPin
	 *            / 내가 쓰러트리고 남아있는 핀.
	 * 
	 * @return 핀 개수.
	 */
	public int getPinCount(int remainPin) {
		Scanner scan = new Scanner(System.in);
		int pinCount = 0;
		while (true) {
			scan = new Scanner(System.in);
			System.out.println("Input Pin Number from 0 to " + remainPin);
			pinCount = scan.nextInt();

			if (remainPin - pinCount >= 0)
				break;

		}
		return pinCount;
	}

	/**
	 * 한번 롤하면, 프레임 하나를 생성하고, 두번 던진다. 각각 생성된 핀을 프레임에 add하고 이 프레임을 프레임 리스트에 add한다.
	 * 
	 * @return strike / spare / 나중에 enum으로 통일해서 숫자도 내보내야할듯
	 * @param frameNumber
	 *            핀생성 프레임 생성
	 */
	public void roll(int frameNumber) {
		newPinList = new Frame(frameNumber);
		int bonus = 0;
		int remainPin = 10;

		for (int rollCount = 0; rollCount < 3; rollCount++) {
			if (rollCount == 2 && bonus == 0)
				break;

			int collapsedPin;
			System.out.printf("This turn is %d throw of %d frame",
					rollCount + 1, frameNumber + 1);
			System.out.println();
			collapsedPin = getPinCount(remainPin);
			newPinList.addPin2Frame(new Pin(collapsedPin, frameNumber));
			remainPin -= collapsedPin;
			
			if (remainPin == 0) {
				if (frameNumber == 9) {// 마지막 프레임 처리.
					remainPin = 10;
					
					boolean firstStrike = (newPinList.getPin(0).getCollapsedPin() == 10);
					//마지막 프레임 경우의 수 
					// 스트라이크-숫자- 스페
					// 숫자- 스페어 - 스트라이
					// 스트라이크- 0 -스트라이크 
					// 스트라이크- 스트라이크/스트라이크
					// 숫자 숫자 
					
					bonus++;
					//bonus  ->  1  1번 다 쓰러트림
					//bonus ->  2  2번 다 쓰러트림
					//bonus -> 3  3번 다 쓰트라이크.
					
					//X2/
					
					if (firstStrike && bonus == 2 && rollCount == 2) { // 마지막 프레임이 3번째 스페어. 처번째 스트라이크 1
						newPinList.setPin2Frame(rollCount, new Pin(
								collapsedPin, frameNumber, true));
					}
					else if ( bonus == 1 && rollCount == 1 ) { //  2번째 스페어.
						//2/X
						newPinList.setPin2Frame(rollCount, new Pin(
								collapsedPin, frameNumber, true));
					} // else 스트라이크.
				} else {
					if (rollCount == 1) { // 2번째 다 쓰러트림. 스페어.
						newPinList.waitNumber = 1;
						newPinList.setPin2Frame(rollCount, new Pin(
								collapsedPin, frameNumber, true));//스페어 체인지.
						
					} else if (rollCount == 0) {// 1번째 다 쓰러트림. 스트라이크.
						newPinList.waitNumber = 2;
					}
					break;
				}
			}
			// handlingSpare(frameNumber, newPinList, reaminPin);
		}
		// while (frameNumber != 9
		// && newPinList.getThrowNumber() != 1
		// && newPinList.getPin(0).getCollapsedPin()
		// + newPinList.getPin(1).getCollapsedPin() > 10) {
		// System.out.println("Input proper score");
		// int collapsedPin = getPinCount();
		// Pin newPin = new Pin(collapsedPin, frameNumber);
		// newPinList.setPin2Frame(1, newPin);
		//
		// handlingSpare(frameNumber, newPinList);
		// }
		frameList.add(newPinList);
		calc(frameNumber);
	}

	/**
	 * 스트라이크를 하면 앞에 던진 2번의 쓰러진  핀의 갯수를 더하고 스페어를 하면 앞에 던진 1번의 쓰러진  핀의 갯수를 더한다.
	 * 
	 * 
	 * @param frameNumber
	 *            0 to frameNumber 점수 계산.
	 */
	public void calc(int frameNumber) {

		score.clear();
		for (int i = 0; i <= frameNumber; i++) {
			Frame f = frameList.get(i);
			int wait = f.waitNumber;
			int sum = f.getPins();

			int j = i + 1;

				// 스페어랑, 스트라이크를 처리하는 부분.
			while (frameNumber >= j) {
				Frame f2 = frameList.get(j);
				for (int k = 0; k < f2.getThrowNumber(); k++) {
					if (wait == 0)
						break;

					sum += f2.getPin(k).getCollapsedPin();
					wait--;

				}
				j++;
			}

			score.add(sum);
		}
	}

}
