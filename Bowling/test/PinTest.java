import junit.framework.TestCase;


public class PinTest extends TestCase {
	private Pin pin;
	@Override	
	protected void setUp() throws Exception {
		pin = new Pin(1,1);
		super.setUp();
	}
	
	public void testGetCollapsedPin() throws Exception {
		assertEquals(1, pin.getCollapsedPin());
	}
	public void testGetFrame() throws Exception {
		assertEquals(1, pin.getFrame());
	}
	public void testGetSymbol() throws Exception {
		assertEquals('1', pin.getSymbol());
		Pin pp = new Pin(10, 1);
		assertEquals('X', pp.getSymbol());
	}
}
