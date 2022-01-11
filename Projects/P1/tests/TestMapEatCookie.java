import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase{
	
	public void testMapEatCookie() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(0, 0));
		Map map = frame.getMap();
		assertTrue(map.eatCookie("pacman") == null);
		assertEquals(map.getCookies(), 0);
	}
}
