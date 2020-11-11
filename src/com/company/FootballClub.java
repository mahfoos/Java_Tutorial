package com.company;

public class FootballClub extends SportsClub {
	private int numOfWin;
	private int numOfDraw;
	private int numOfDefeat;
	private int score;
	private int numOfPoints;
	private int numOfPlayedMatches;
	private String date;

	public FootballClub(String nameOfClub, String locationOfCLub,  int numOfWin, int numOfDraw, int numOfDefeat, int score, int numOfPoints, int numOfPlayedMatches,String date) {
		super(nameOfClub, locationOfCLub);
		this.numOfWin = numOfWin;
		this.numOfDraw = numOfDraw;
		this.numOfDefeat = numOfDefeat;
		this.score = score;
		this.numOfPoints = numOfPoints;
		this.numOfPlayedMatches = numOfPlayedMatches;
		this.date = date;
	}


	public int getNumOfWin() {
		return numOfWin;
	}

	public void setNumOfWin(int numOfWin) {
		this.numOfWin = numOfWin;
	}

	public int getNumOfDraw() {
		return numOfDraw;
	}

	public void setNumOfDraw(int numOfDraw) {
		this.numOfDraw = numOfDraw;
	}

	public int getNumOfDefeat() {
		return numOfDefeat;
	}

	public void setNumOfDefeat(int numOfDefeat) {
		this.numOfDefeat = numOfDefeat;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNumOfPoints() {
		return numOfPoints;
	}

	public void setNumOfPoints(int numOfPoints) {
		this.numOfPoints = numOfPoints;
	}

	public int getNumOfPlayedMatches() {
		return numOfPlayedMatches;
	}

	public void setNumOfPlayedMatches(int numOfPlayedMatches) {
		this.numOfPlayedMatches = numOfPlayedMatches;
	}

	@Override
	public String toString() {
		return "FootballClub{" +
				"numOfWin=" + numOfWin +
				", numOfDraw=" + numOfDraw +
				", numOfDefeat=" + numOfDefeat +
				", score=" + score +
				", numOfPoints=" + numOfPoints +
				", numOfPlayedMatches=" + numOfPlayedMatches +
				'}';
	}
}
