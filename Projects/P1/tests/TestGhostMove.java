import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	@Test
	public void testGhostMove() throws FileNotFoundException{
		Mainframe frame = new MainFrame();
		Ghost ghost = frame.addPacMan(new Location(9, 11));
		assertEquals(true, pacman.move());
	}
}
