import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase{

	public void testMapMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		assertTrue(frame.getMap().move("pacman", new Location(1, 2), Map.Type.PACMAN)); // tests if move returned true ie was successful
		assertTrue(frame.getMap().getLoc(new Location(1, 2)).contains(Map.Type.PACMAN)); // tests if pacman is in new spot
		assertFalse(frame.getMap().getLoc(new Location(1, 1)).contains(Map.Type.PACMAN)); // tests if pacman is not in old spot
	}
}
