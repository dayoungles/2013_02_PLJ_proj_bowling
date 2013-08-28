
public class Pin {
	public enum PinSymbol{
		GUTTER('0'),
		ONE('1'),
		TWO('2'),
		THREE('3'),
		FOUR('4'),
		FIVE('5'),
		SIX('6'),
		SEVEN('7'),
		EIGHT('8'),
		NINE('9'),
		STRIKE('X'),
		SPARE('/');
		
		private char collapsedPin;
		
		private PinSymbol(char collapsedPin){
			this.collapsedPin = collapsedPin;
		}
		private char getSymbol(){
			return collapsedPin;
		}
	}

	
	public PinSymbol pinSymbol;
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

	public char getSymbol(){

		if(collapsedPin == 0){
			return PinSymbol.GUTTER.getSymbol();
		} else if(collapsedPin == 1){
			return PinSymbol.ONE.getSymbol();
		} else if(collapsedPin == 2){
			return PinSymbol.TWO.getSymbol();
		}else if(collapsedPin == 3){
			return PinSymbol.THREE.getSymbol();
		}else if(collapsedPin == 4){
			return PinSymbol.FOUR.getSymbol();
		}else if(collapsedPin == 5){
			return PinSymbol.FIVE.getSymbol();
		}else if(collapsedPin == 6){
			return PinSymbol.SIX.getSymbol();
		}else if(collapsedPin == 7){
			return PinSymbol.SEVEN.getSymbol();
		}else if(collapsedPin == 8){
			return PinSymbol.EIGHT.getSymbol();
		}else if(collapsedPin == 9){
			return PinSymbol.NINE.getSymbol();
		}else if(collapsedPin == 10){
			return PinSymbol.STRIKE.getSymbol();
		}else {
			return ' ';
		}
	}
}
