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
	}
	
	public String run(String path){
		ArrayList<String> moves = new ArrayList<String>();
		for(int i=0; i<path.length(); i++){
			moves.add(String.valueOf(path.charAt(i)));
		}
		if(isPathCorrect(path)){
			return path;
		}
		return "Error";
	}
	
	public boolean isPathCorrect(String path){
		int sumOfCharIndexes = 0;
		boolean result = false;
		for(int i=0; i<path.length(); i++){
			String ch = String.valueOf(path.charAt(i));
			switch(ch){
			case "d":
				sumOfCharIndexes += 5;
				break;
			case "u":
				sumOfCharIndexes -= 5;
				break;
			case "r":
				sumOfCharIndexes += 1;
				break;
			case "l":
				sumOfCharIndexes -= 1;
				break;
			}
			//System.out.println("index: " + ch + " sumOfCharIndexes: " + sumOfCharIndexes);
		}
		if(sumOfCharIndexes == board.size()-1){
			result = true;
		}
		return result;
	}
}