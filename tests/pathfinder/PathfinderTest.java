package pathfinder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PathfinderTest{
	
	private Pathfinder pathfinder;
	
	@Before
	public void before(){
		pathfinder = new Pathfinder();
	}
	
	@Test
	public void findPathPart1(){
		String path = "l?l?dd?d";
		assertEquals("lllldddd", pathfinder.run(path));
	}
	
	@Test
	public void findPathPart2(){
		String path = "dd????ll";
		assertEquals("ddddllll", pathfinder.run(path));
	}
	
	@Test
	public void findPathPart3(){
		String path = "d????rdr";
		assertEquals("drdrdrdr", pathfinder.run(path));
	}
	
	@Test
	public void findPathPart4(){
		String path = "??r?rr?r";
		assertEquals("ddrdrrdr", pathfinder.run(path));
	}
	
	@Test
	public void findPathPart5(){
		String path = "?d?uu?d??ld??r";
		assertEquals("ddruurdddldrrr", pathfinder.run(path));
	}
}