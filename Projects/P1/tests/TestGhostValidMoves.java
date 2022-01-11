import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		/* Hard to find edge case tests with the given NoFrame restriction */ 
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(1, 1), "blue", Color.BLUE);
		ArrayList<Location> correct = new ArrayList<Location>();
		correct.add(new Location(1,2));
		correct.add(new Location(2,1));
		System.out.println("\nArray: " + ghost.get_valid_moves().toString());
		assertTrue(correct.equals(ghost.get_valid_moves()));
	}
}
