import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	@Test
	public void testMapGetLoc() {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(5, 5));
		Map m = new Map(10);
		Location l = new Location(5,5);
		m.add("pac", l, new PacManComponent(5, 5, 2), Type.PACMAN);
		assertEquals(m.getLoc(l), Type.Pacman);
	}
}
