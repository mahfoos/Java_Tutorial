package com.company;

public class SchoolFootballClub extends FootballClub{
	private String nameOfSchool;

	public SchoolFootballClub(String nameOfClub, String locationOfCLub, int contactNo, int numOfWin, int numOfDraw,
							  int numOfDefeat, int numOfGoal, int score, int numOfPoints, int numOfPlayedMatches,
							  String nameOfSchool) {
		super(nameOfClub, locationOfCLub, contactNo, numOfWin, numOfDraw, numOfDefeat, numOfGoal, score, numOfPoints, numOfPlayedMatches);
		this.nameOfSchool = nameOfSchool;
	}
}
