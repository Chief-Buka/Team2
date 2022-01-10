import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;
import org.junit.Test;

public class TestGhostMove extends TestCase {

	@Test
	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		// Map m = new Map(20);
		Ghost ghost = frame.addGhost(new Location(9, 11), "NewGhost", Color.red);
		assertEquals(true, ghost.move());
	}
}
