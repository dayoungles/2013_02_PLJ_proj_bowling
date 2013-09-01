import junit.framework.TestCase;

public class BowlingTest extends TestCase {
	public void testLetsBowling() throws gameOverException {
		Bowling b = new Bowling();
		try {	
			b.letsBowling();
		} catch (gameOverException e) {
			System.out.println(e.getMessage());
		}
	}

}
