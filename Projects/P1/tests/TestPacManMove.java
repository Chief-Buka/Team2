import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class TestPacManMove extends TestCase {
	@Test
	public void testPacManMove() throws FileNotFoundException {
		Mainframe frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(9, 11));
		assertEquals(true, pacman.move());
	}
}
