import junit.framework.TestCase;

public class RollingTest extends TestCase {
	private Rolling rolling;

	@Override
	protected void setUp() throws Exception {
		rolling = new Rolling();
		super.setUp();
	}

	public void testGetPinCount() throws Exception {
		assertEquals(8, rolling.getPinCount(10));
	}

	public void testRoll() throws Exception {
		rolling.roll(0);
		assertEquals(8, rolling.frameList.get(0).getPin(0).getCollapsedPin());// 입력 숫자에 따라 확인 가능..
	}
		
	public void testFrame10() throws Exception {
		//테스트 하려면 9번 프레임으로 넣되 앞 인덱스가 없어서 get(0)번으로 테스트..
		//마지막 프레임 경우의 수 
		// 숫자 숫자 
		rolling.roll(9);
		// 스트라이크-숫자- 스페
		assertEquals('X', rolling.frameList.get(0).getPin(0).getSymbol());
		assertEquals('/', rolling.frameList.get(0).getPin(2).getSymbol());
	}

	public void testFrame10_1() throws Exception{
		rolling.roll(9);
		// 숫자- 스페어 - 스트라이
		assertEquals('/', rolling.frameList.get(0).getPin(1).getSymbol());
		assertEquals('X', rolling.frameList.get(0).getPin(2).getSymbol());
	}
	
	public void testFrame10_2() throws Exception {
		rolling.roll(9);
		// 스트라이크- 0 -스페어 10처리 
		assertEquals('X', rolling.frameList.get(0).getPin(0).getSymbol());
		assertEquals('/', rolling.frameList.get(0).getPin(2).getSymbol());
		
	}
	public void testFrame10_3() throws Exception {
		rolling.roll(9);
		// 스트라이크- 스트라이크/스트라이크
		assertEquals('X', rolling.frameList.get(0).getPin(0).getSymbol());
		assertEquals('X', rolling.frameList.get(0).getPin(1).getSymbol());
		assertEquals('X', rolling.frameList.get(0).getPin(2).getSymbol());
	}
	public void testCalc() throws Exception {
		rolling.roll(0);
		assertEquals(10, rolling.frameList.get(0).getPins());
	}
	
}
