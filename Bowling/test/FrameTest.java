import junit.framework.TestCase;

public class FrameTest extends TestCase {

	public void testPinFromFrame() throws Exception {
		Frame frame = new Frame(1);
		frame.addPin2Frame(new Pin(1,1));
		assertEquals(1, frame.getPin(0).getCollapsedPin());
	}
}
