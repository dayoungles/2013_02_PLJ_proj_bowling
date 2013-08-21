import junit.framework.TestCase;


public class bowlingTest extends TestCase {
	public void testGetPinCount() throws Exception {
		Bowling bowling = new Bowling();
		assertEquals(8, bowling.getPinCount());
	}

}
