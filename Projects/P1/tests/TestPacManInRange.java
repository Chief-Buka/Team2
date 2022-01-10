import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
			//Creating A Map
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
		//NoFrame frame1 = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(0, 1)); //Creates PacMan at location x, y

		//alternatively if you don't need the PacMan or Ghost objects in your tests
		//frame.initPlayers(); //Creates all of the players
		assertEquals(true, ghost.is_pacman_in_range());
		//Start The Game
		while(true) {
		frame.startGame();

		}
	}
}

