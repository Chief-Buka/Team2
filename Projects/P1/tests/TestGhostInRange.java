import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		//Creating A Map
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
		//NoFrame frame1 = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(0, 1), "name", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

		//alternatively if you don't need the PacMan or Ghost objects in your tests
		//frame.initPlayers(); //Creates all of the players
		assertEquals(true, pacman.is_ghost_in_range());
		//Start The Game
		while(true) {
		frame.startGame();

		}
	}
}

