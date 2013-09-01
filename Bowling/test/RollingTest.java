import junit.framework.TestCase;


public class RollingTest extends TestCase {
	private Rolling rolling;
	
	@Override
	protected void setUp() throws Exception {
		rolling = new Rolling();
		super.setUp();
	}
	public void testGetPinCount() throws Exception {
		assertEquals(8, rolling.getPinCount());
	}

	public void testRoll() throws Exception {
		rolling.roll(1);
		//assertEquals(8, rolling.frameList.get(0).getPinFromFrame(1).getCollapsedPin());
		CalculateScore c = new CalculateScore();
		System.out.println(c.calculate());
	}
	
}
