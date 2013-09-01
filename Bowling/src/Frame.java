import java.util.ArrayList;
import java.util.List;

public class Frame {

	int frameNumber;
	int waitNumber = 0;
	List<Pin> pinList = new ArrayList<Pin>();

	Frame(int frameNumber) {
		this.frameNumber = frameNumber;
		// this.throwNumber = throwNumber;

	}

	public void addPin2Frame(Pin pin) {
		pinList.add(pin);
	}
	
	public void setPin2Frame(int index, Pin pin) {
		pinList.set(index, pin);
	}

	public int getFrameNumber() {
		return frameNumber;
	}

	/**
	 * 핀리스트의 핀 합계 
	 * @return
	 */
	public int getPins() {
		int sum = 0;
		for (Pin pin : pinList) {
			sum += pin.getCollapsedPin();
		}
		return sum;
	}	

	public int getThrowNumber() {
		return pinList.size();
	}

	/**
	 * List<Pin> frame으로부터
	 * 
	 * @param index
	 * @return 인덱스에 위치한 핀 객체
	 */
	public Pin getPin(int index) {
		return pinList.get(index);
	}
	

}
