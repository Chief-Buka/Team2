import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie {
	
	public void testMapEatCookie() {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(9, 11));
		Map map = frame.getMap();
		pacman.move();
		assertEquals(map.getCookies(), 1);	
	}
}
