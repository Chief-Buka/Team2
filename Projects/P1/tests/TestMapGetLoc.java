import static java.util.Arrays.*;
import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;
import org.junit.Test;
import java.util.HashSet;

public class TestMapGetLoc {
	
	@Test
	public void testMapGetLoc() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(5, 6));
		Map m = new Map(10);
		Location l = new Location(5,6);
		m.add("pac", l, new PacManComponent(5, 6, 2), Map.Type.PACMAN);
		HashSet<Map.Type> t = new HashSet<>();
		t.add(Map.Type.PACMAN);
		Assert.assertEquals(m.getLoc(l), t);
	}
}
