public class Pin {	
	public enum PinSymbol {
		GUTTER('0'), STRIKE('X'), SPARE('/');

		private char collapsedPin;

		private PinSymbol(char collapsedPin) {
			this.collapsedPin = collapsedPin;
		}

		private char getSymbol() {
			return collapsedPin;
		}

		public static char getSymobol(int i) {
			if (i == 0)
				return GUTTER.getSymbol();
			else if (i == 10)
				return STRIKE.getSymbol();
			else if (i == -2)
				return SPARE.getSymbol();
			else
				return (char) (i + 48);
		}
	}

	public char pinSymbol;
	public int collapsedPin;
	public int frame;

	Pin(int collapsedPin, int frame){
		this.collapsedPin = collapsedPin;
		this.frame = frame;
		this.pinSymbol = PinSymbol.getSymobol(collapsedPin);
	}

	Pin(int collapsedPin, int frame, boolean Spare) {
		this.collapsedPin = collapsedPin;
		this.frame = frame;
		if(Spare)
			this.pinSymbol = PinSymbol.getSymobol(-2);
		else
			this.pinSymbol = PinSymbol.getSymobol(collapsedPin);
	}

	public int getCollapsedPin() {
		return collapsedPin;
	}

	public int getFrame() {
		return frame;
	}

	public char getSymbol() {
		return this.pinSymbol;
	}
}
