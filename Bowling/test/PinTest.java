import junit.framework.TestCase;


public class PinTest extends TestCase {
	
	public void testGetCollapsedPin() throws Exception {
		Pin pin = new Pin(3, 1);
		assertEquals(3, pin.getCollapsedPin());
	}
	public void testGetFrame() throws Exception {
		Pin pin = new Pin (10,1);
		assertEquals(1, pin.getFrame());
	}
}
