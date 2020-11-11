package com.company;

public class SchoolFootballClub extends FootballClub{
	private String nameOfSchool;

	public SchoolFootballClub(String nameOfClub, String locationOfCLub,int numOfWin, int numOfDraw,
							  int numOfDefeat, int score, int numOfPoints, int numOfPlayedMatches,
							  String nameOfSchool) {
		super(nameOfClub, locationOfCLub, numOfWin, numOfDraw, numOfDefeat, score, numOfPoints, numOfPlayedMatches);
		this.nameOfSchool = nameOfSchool;
	}
}
