import junit.framework.TestCase;


public class PinTest extends TestCase {
	public void testGetCollapsedPin() throws Exception {
		Pin pin = new Pin(Pin.CollapsedPin.STRIKE);
		Pin.CollapsedPin value = pin.getCollapsedPin();
		assertEquals(value, pin.getCollapsedPin());
	}
	
}
