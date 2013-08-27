
public class Pin {
//	public enum PinSymbol{
//		GUTTER('0'),
//		ONE('1'),
//		TWO('2'),
//		THREE('3'),
//		FOUR('4'),
//		FIVE('5'),
//		SIX('6'),
//		SEVEN('7'),
//		EIGHT('8'),
//		NINE('9'),
//		STRIKE('X'),
//		SPARE('/');
//		
//		private int collapsedPin;
//		
//		private PinSymbol(int collapsedPin){
//			this.collapsedPin = collapsedPin;
//		}
//	}

	
//	public static PinSymbol pinSymbol;
	public int collapsedPin;
	public int frame;
	//public int throwCount;
	

	Pin(int collapsedPin, int frame){
		this.collapsedPin = collapsedPin;
		this.frame = frame;
		//this.throwCount = throwCount;
	}

	public int getCollapsedPin(){
		return collapsedPin;
	}
	public int getFrame(){
		return frame;
	}
//	public int getThrowNumber(){
//		return throwCount;
//	}
	
}
