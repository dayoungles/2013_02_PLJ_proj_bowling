import java.util.ArrayList;
import java.util.List;



public class Frame{
	
	int maxThrowChancePerFrame= 2;
	int fullThrowCount = 0;
	int frameNumber;
	int throwNumber;
	
	List<Pin> frame = new ArrayList<Pin>();
	
	
	Frame(int frameNumber){
		this.frameNumber = frameNumber - 1;
//		this.throwNumber = throwNumber;

	}

	public void addPin2Frame(Pin pin){
		frame.add(pin);
	}
	
	public int getFrameNumber(){
		return frameNumber;
	}
	public Pin getPinFromFrame(int index){
		return frame.get(index);
	}
}
