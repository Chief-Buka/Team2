import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	/* Returns an ArrayList<Location> of currently valid moves for PacMan */
	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> toReturn = new ArrayList<Location>(); // reference to ArrayList to be returned
		HashSet<Map.Type> inhabitants; // will be used to reference the inhabitants of a location, to check if valid move
		Location curr; // will be used to reference the current location being checked

		/* Up */ 
		curr = myLoc.shift(0, 1); // sets curr
		inhabitants = myMap.getLoc(curr); // retrieves Types on Location
		if(!(inhabitants.contains(Map.Type.WALL))){ // Checks if there's a wall
			toReturn.add(curr); // Adds to toReturn if no wall
		}

		/* Down */ 
		curr = myLoc.shift(0, -1); // sets curr
		inhabitants = myMap.getLoc(curr); // retrieves Types on Location
		if(!(inhabitants.contains(Map.Type.WALL))){ // Checks if there's a wall
			toReturn.add(curr); // Adds to toReturn if no wall
		}

		/* Right */ 
		curr = myLoc.shift(1, 0); // sets curr
		inhabitants = myMap.getLoc(curr); // retrieves Types on Location
		if(!(inhabitants.contains(Map.Type.WALL))){ // Checks if there's a wall
			toReturn.add(curr); // Adds to toReturn if no wall
		}

		/* Left */ 
		curr = myLoc.shift(-1, 0); // sets curr
		inhabitants = myMap.getLoc(curr); // retrieves Types on Location
		if(!(inhabitants.contains(Map.Type.WALL))){ // Checks if there's a wall
			toReturn.add(curr); // Adds to toReturn if no wall
		}		

		return toReturn;
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
