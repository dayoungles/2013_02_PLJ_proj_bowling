import junit.framework.TestCase;

public class FrameTest extends TestCase {
	private Frame frame;
	@Override
	protected void setUp() throws Exception {
		frame = new Frame(0);
		super.setUp();
	}

	public void testPinFromFrame() throws Exception {
		frame.addPin2Frame(new Pin(1,0));
		assertEquals(1, frame.getPin(0).getCollapsedPin());
	}
	public void testGetPins() throws Exception {
		frame.addPin2Frame(new Pin(1,0));
		frame.addPin2Frame(new Pin(7,0));
		frame.getPins();
		assertEquals(8, frame.getPins());
	}
}
