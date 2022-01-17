import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.management.monitor.GaugeMonitor;
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
		curr = myLoc.shift(0, 1); // sets curr
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
		ArrayList<Location> to_check = this.get_valid_moves();
		if(to_check.size() > 0){
			myLoc = to_check.get(0);
			if (myMap.move(myName, myLoc, Map.Type.PACMAN)){
				return true;
			}
			return false;
		}
		return false;
	}

	public boolean is_ghost_in_range() { 

		if(myMap.getLoc(new Location(myLoc.x, myLoc.y+1)).contains(Map.Type.GHOST)){
			return false;

		}else if(myMap.getLoc(new Location(myLoc.x, myLoc.y-1)).contains(Map.Type.GHOST)){

			return false;
		}else if(myMap.getLoc(new Location(myLoc.x-1, myLoc.y)).contains(Map.Type.GHOST)){

			return false;
		}else if(myMap.getLoc(new Location(myLoc.x+1, myLoc.y)).contains(Map.Type.GHOST)){

			return false;
		}

		return true;
	}

	/*This method checks to see if there is a 'power-cookie' located in Pacman's current  coordinate.
	If there is, this method calls the eatCookie method from the Map Class, 
	and returns the cookie component if the cookie a consumed, and null otherwise. */
	public JComponent consume() {
		HashSet<Map.Type> map_location = myMap.getLoc(myLoc);

		//if the location set contains a cookie, then return the cookie's component after calling eatCookie
		if (map_location.contains(Map.Type.COOKIE)) {
			JComponent cookie = myMap.eatCookie("pacman");
			return cookie;
		//if not, return null
		} else {
			JComponent myLabel = new JLabel();
			return myLabel;
		}
	}
}