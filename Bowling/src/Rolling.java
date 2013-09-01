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
	 * 핀의 개수를 사용자로부터 입력받음.
	 * 
	 * @return 핀 개수.
	 */
	public int getPinCount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Pin Number");
		int pinCount = scan.nextInt();
		while (pinCount > 10 || pinCount < 0) {
			scan = new Scanner(System.in);
			System.out.println("Input Pin Number from 0 to 10");
			pinCount = scan.nextInt();
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
		boolean bonus = false;

		for (int rollCount = 0; rollCount < 3; rollCount++) {
			if (rollCount == 2 && !bonus)
				break;

			int collapsedPin;
			collapsedPin = getPinCount();
			newPinList.addPin2Frame(new Pin(collapsedPin, frameNumber));
			
			if (rollCount == 0 && frameNumber == 9 && collapsedPin == 10)
				bonus = true;

			if (!bonus && collapsedPin == 10) {
				newPinList.waitNumber = 2;
				break;
			}

			if (rollCount == 1) {
				handlingSpare(frameNumber, newPinList);
			}
		}
		while (frameNumber != 9
				&& newPinList.getThrowNumber() != 1
				&& newPinList.getPin(0).getCollapsedPin()
						+ newPinList.getPin(1).getCollapsedPin() > 10) {
			System.out.println("Input proper score");
			int collapsedPin = getPinCount();
			Pin newPin = new Pin(collapsedPin, frameNumber);
			newPinList.setPin2Frame(1, newPin);

			handlingSpare(frameNumber, newPinList);
		}
		frameList.add(newPinList);
		calc(frameNumber);
	}

	private void handlingSpare(int frameNumber, Frame newFrame) {
		if (newFrame.getPin(0).getCollapsedPin()
				+ newFrame.getPin(1).getCollapsedPin() == 10) {
			Pin sparePin = new Pin(newFrame.getPin(1).getCollapsedPin(),
					frameNumber, true);
			newFrame.setPin2Frame(1, sparePin);
			newPinList.waitNumber = 1;
			// newFrame.pinList.remove(2);
		}
	}

	public void calc(int frameNumber) {

		score.clear();
		for (int i = 0; i <= frameNumber; i++) {
			Frame f = frameList.get(i);
			int wait = f.waitNumber;
			int sum = f.getPins();

			int j = i + 1;

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
