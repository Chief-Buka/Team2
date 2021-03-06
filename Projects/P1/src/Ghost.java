import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	/* returns ArrayList<Location> of currently valid moves for the Ghost */ 
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
		ArrayList<Location> to_check = this.get_valid_moves();
		if(to_check.size() > 0){
			myLoc = to_check.get(0);
			if (myMap.move(myName, myLoc, Map.Type.GHOST)){
				return true;
			}
			return false;
		}
		return false;
	}
	public boolean is_pacman_in_range() { 
		if(myMap.getLoc(new Location(myLoc.x+1, myLoc.y)).contains(Map.Type.PACMAN)){
			return true;

		}else if((myLoc.x-1 >= 0) && myMap.getLoc(new Location(myLoc.x-1, myLoc.y)).contains(Map.Type.PACMAN)){

			return true;
		}else if((myLoc.y-1 >= 0) && myMap.getLoc(new Location(myLoc.x, myLoc.y-1)).contains(Map.Type.PACMAN)){

			return true;
		}else if(myMap.getLoc(new Location(myLoc.x, myLoc.y+1)).contains(Map.Type.PACMAN)){

			return true;
		}

		return false;
	}

	//returns true if an attack on pacman is successful and false if not
	public boolean attack() {
		//if pacman is in range, then an attack would be successful
		if (this.is_pacman_in_range() == true) {
			return true;
		} else {
			return false;
		}
	}
}
