package pathfinder;

import java.util.ArrayList;

public class Pathfinder {
	
	private ArrayList<String> board;
	
	public Pathfinder(){
		this.board = new ArrayList<String>();
		String x = "x";
		for(int i=0; i<25; i++){
			board.add(x);
		}
		System.out.println(board);
	}
}
