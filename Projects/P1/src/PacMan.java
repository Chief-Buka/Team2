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

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 

		if(myMap.getLoc(new Location(myLoc.x, myLoc.y+1)).contains(Map.Type.GHOST)){
			return true;

		}else if(myMap.getLoc(new Location(myLoc.x, myLoc.y-1)).contains(Map.Type.GHOST)){

			return true;
		}else if(myMap.getLoc(new Location(myLoc.x-1, myLoc.y)).contains(Map.Type.GHOST)){

			return true;
		}else if(myMap.getLoc(new Location(myLoc.x-1, myLoc.y)).contains(Map.Type.GHOST)){

			return true;
		}

		return false;
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
		} else {
			return null;
		}
	}
}