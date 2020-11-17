package com.company;

import java.util.Comparator;

public class FootballClub extends SportsClub implements Comparable<FootballClub> {
	private int numOfWin;
	private int numOfDraw;
	private int numOfDefeat;
	private int numOfScoredGoals;
	private int numOfReceivedGoals;
	private int goalDifference;
	private int numOfPoints;
	private int numOfPlayedMatches;
	private String date;

	public FootballClub(String nameOfClub, String locationOfCLub, int numOfWin, int numOfDraw, int numOfDefeat, int numOfScoredGoals, int numOfReceivedGoals, int goalDifference, int numOfPoints, int numOfPlayedMatches, String date) {
		super(nameOfClub, locationOfCLub);
		this.numOfWin = numOfWin;
		this.numOfDraw = numOfDraw;
		this.numOfDefeat = numOfDefeat;
		this.numOfScoredGoals = numOfScoredGoals;
		this.numOfReceivedGoals = numOfReceivedGoals;
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

	public int getNumOfScoredGoals() {
		return numOfScoredGoals;
	}

	public void setNumOfScoredGoals(int numOfScoredGoals) {
		this.numOfScoredGoals = numOfScoredGoals;
	}

	public int getNumOfReceivedGoals() {
		return numOfReceivedGoals;
	}

	public void setNumOfReceivedGoals(int numOfReceivedGoals) {
		this.numOfReceivedGoals = numOfReceivedGoals;
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


	@Override
	public int compareTo(FootballClub football) {
		return Comparator.comparing(FootballClub::getNumOfPoints)
				.thenComparing(FootballClub::getGoalDifference)
				.compare(this, football);
	}
}

