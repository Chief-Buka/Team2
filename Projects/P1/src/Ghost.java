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

	public ArrayList<Location> get_valid_moves() {
		return null;
	}

	public boolean move() {
		ArrayList<Location> moves = this.get_valid_moves();
		if (moves.isEmpty()) {
			return false;
		}
		else {
			this.myLoc = new Location(moves.get(0).x, moves.get(0).y);
			return true;
		}
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}
