package com.company;

public class UniversityFootballClub extends FootballClub{
	private String nameOfUniversity;

	public UniversityFootballClub(String nameOfClub, String locationOfCLub, int contactNo, int numOfWin,
								  int numOfDraw, int numOfDefeat, int numOfGoal, int score, int numOfPoints,
								  int numOfPlayedMatches, String nameOfUniversity) {
		super(nameOfClub, locationOfCLub, contactNo, numOfWin, numOfDraw, numOfDefeat, numOfGoal, score, numOfPoints, numOfPlayedMatches);
		this.nameOfUniversity = nameOfUniversity;
	}
}
