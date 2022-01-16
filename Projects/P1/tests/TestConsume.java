import junit.framework.*;
import java.awt.Color;
import java.io.*;



public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(0, 0));
		Map map = frame.getMap();

		//test to see if consume returns null properly
		assertTrue(pacman.consume() == null);
		//assertEquals(map.getCookies(), 0);
	}
}
