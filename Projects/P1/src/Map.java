import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE		
	}
	
	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components; 
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet; 

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
		
	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location
		return false;
	}
	
	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		return null;
	}

	public boolean attack(String Name) {
		//update gameOver
		return false;
	}

	/* The method controls Pacman eating a cookie. When the function is able to successfully update display to eat a cookie it returns 
	the Cookie component that has been eaten, otherwise it returns null.*/
	public JComponent eatCookie(String name) {
		//see if there's a cookie at pacman's location 
		Location pacman_loc = locations.get("pacman");
		HashSet<Type> loc = getLoc(pacman_loc);
		
		if (loc.contains(Type.COOKIE)) {
			//update locations, components, field, and cookies
			
			//decrement cookies
			cookies -= 1;

			//remove cookie from locations
			String location_string = "tok_x"+ pacman_loc.x + "_y"+ pacman_loc.y;
			locations.remove(location_string);

			//access the cookie's jcomponent for later
			JComponent cookie_to_return = components.get(location_string);

			//remove the cookie from components set
			components.remove(location_string);

			//remove cookie from field set
			loc.remove(Type.COOKIE);

			return cookie_to_return;

		//if there's no cookie at the specified location, return null
		} else {
			return null;
		}
		//locations: String, Location
		//components: String, JComponent
		//field: Location, Hashset<Type>
		//the id for a cookie at (10, 1) is tok_x10_y1		
	}
}
