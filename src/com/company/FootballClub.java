package com.company;


import java.util.Comparator;

public class FootballClub extends SportsClub  {
	private int numOfWin;
	private int numOfDraw;
	private int numOfDefeat;
	private int numOfScore;
	private int receivedGoal;
	private int goalDifference;
	private int numOfPoints;
	private int numOfPlayedMatches;
	private String date;

	public FootballClub(String nameOfClub, String locationOfCLub, int numOfWin, int numOfDraw, int numOfDefeat, int numOfScore, int receivedGoal, int goalDifference, int numOfPoints, int numOfPlayedMatches, String date) {
		super(nameOfClub, locationOfCLub);
		this.numOfWin = numOfWin;
		this.numOfDraw = numOfDraw;
		this.numOfDefeat = numOfDefeat;
		this.numOfScore = numOfScore;
		this.receivedGoal = receivedGoal;
		this.goalDifference = goalDifference;
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

	public int getNumOfScore() {
		return numOfScore;
	}

	public void setNumOfScore(int numOfScore) {
		this.numOfScore = numOfScore;
	}

	public int getReceivedGoal() {
		return receivedGoal;
	}

	public void setReceivedGoal(int receivedGoal) {
		this.receivedGoal = receivedGoal;
	}

	public int getGoalDifference() {
		return goalDifference;
	}

	public void setGoalDifference(int goalDifference) {
		this.goalDifference = goalDifference;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}



}
