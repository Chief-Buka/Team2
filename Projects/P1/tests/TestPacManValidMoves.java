import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		ArrayList<Location> correct = new ArrayList<Location>();
		correct.add(new Location(1,2));
		correct.add(new Location(2,1));
		
		System.out.println("\nArray: " + pacman.get_valid_moves().toString());
		assertTrue(correct.equals(pacman.get_valid_moves().toString()));
	}
}
