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
	public void canEvaluateThatAPathConfigurationWorks(){
		assertEquals(true, pathfinder.isPathCorrect("rrrrdddd"));
		assertEquals(true, pathfinder.isPathCorrect("ddrdrrdr"));
		assertEquals(true, pathfinder.isPathCorrect("drdrdrdr"));
		assertEquals(true, pathfinder.isPathCorrect("ddddrrrr"));
		assertEquals(true, pathfinder.isPathCorrect("ddruurdddldrrr"));
		assertEquals(false, pathfinder.isPathCorrect("ddrddrdddldrrr"));
		assertEquals(false, pathfinder.isPathCorrect("ddrdrlrd"));
		assertEquals(false, pathfinder.isPathCorrect("ddddrrrl"));
	}
	
	@Test
	public void findPathPart1(){
		String path = "r?r?dd?d";
		assertEquals("rrrrdddd", pathfinder.isPathCorrect(path));
	}
	
	@Test
	public void findPathPart2(){
		String path = "dd????rr";
		assertEquals("ddddrrrr", pathfinder.run(path));
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