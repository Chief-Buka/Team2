import junit.framework.*;
import java.awt.Color;
import java.io.*;

import Map.Type;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(9, 11));
		Map map = frame.getMap();
		assertNotEquals(pacman.consume(), false);
		assertEquals(map.getCookies(), 1);
	}
}
