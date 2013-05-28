package se.mah.marbles;

public class Game {
	
	public String level;
	public static int score;
	

	public Game(String level){
		this.level=level;
		this.score=0;
	}

	//LEVEL
	public String getLevel(){
		return level;
	}

	public void setLevel(String newLevel){
		this.level=newLevel;
	}
	
	//SCORE
	public int getScore(){
		return score;
	}
	
	public void addScore(int newscore){
		this.score=this.score+newscore;
	}
	
	
}
