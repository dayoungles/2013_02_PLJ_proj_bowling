import java.util.Scanner;


public class Bowling {
	int []pinArray = new int[20];
	int []pointArray = new int[10];
	int frame;
	/**
	 * 핀의 갯수를 사용자로부터 입력받음.
	 * @return 핀 갯수.
	 */
	public int getPinCount(){
		Scanner scan = new Scanner(System.in);
		int pinCount = scan.nextInt();
		return pinCount;
	}
	
	public void roll(int pinCount, int frame ){
		if(frame % 2 == 0){
			pinArray[frame/2] = pinCount;
		} else {
			pinArray[frame / 2 + 1] = pinCount;
		}
	}
	
	public void printPin(){
		System.out.println("-----------------------------------------------------");
		for(int pin : pinArray){
			System.out.println("|" + pin + "|");
		}
		System.out.println("------------------------------------------------------");
	}
}
