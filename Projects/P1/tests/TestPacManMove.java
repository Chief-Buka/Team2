import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;
import org.junit.Test;

public class TestPacManMove extends TestCase {
	@Test
	public void testPacManMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(5, 5));
		assertEquals(true, pacman.move());
	}
}



