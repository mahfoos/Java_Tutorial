package com.company;

public class FootballClub extends SportsClub {
	private int numOfWin;
	private int numOfDraw;
	private int numOfDefeat;
	private int numOfGoal;
	private int receivedScored;
	private int numOfPoints;
	private int numOfPlayedMatches;

	public FootballClub(String nameOfClub, String locationOfCLub, int contactNo, int numOfWin, int numOfDraw,
						int numOfDefeat, int numOfGoal, int receivedScored, int numOfPoints, int numOfPlayedMatches) {
		super(nameOfClub, locationOfCLub, contactNo);
		this.numOfWin = numOfWin;
		this.numOfDraw = numOfDraw;
		this.numOfDefeat = numOfDefeat;
		this.numOfGoal = numOfGoal;
		this.receivedScored = receivedScored;
		this.numOfPoints = numOfPoints;
		this.numOfPlayedMatches = numOfPlayedMatches;
	}
}
