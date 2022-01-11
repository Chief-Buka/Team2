import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;
import org.junit.Test;

public class TestGhostMove extends TestCase {

	@Test
	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(5, 5), "name", Color.red);
		assertEquals(true, ghost.move());
	}
}
