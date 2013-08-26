
public class Pin {
	public enum CollapsedPin{
		GUTTER(0),
		COUNT1(1),
		COUNT2(2),
		COUNT3(3),
		COUNT4(4),
		COUNT5(5),
		COUNT6(6),
		COUNT7(7),
		COUNT8(8),
		COUNT9(9),
		STRIKE(10);
		
		private int collapsedPin;
		
		private CollapsedPin(int collapsedPin){
			this.collapsedPin = collapsedPin;
		}

	}
	
	public static CollapsedPin collapsedPin;
	
	Pin(CollapsedPin collapsedPin){
		this.collapsedPin = collapsedPin;
	}
	public static CollapsedPin getCollapsedPin(){
		return collapsedPin;
	}
	
}
