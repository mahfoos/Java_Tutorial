package com.company;

public class SchoolFootballClub extends FootballClub{
	private String nameOfSchool;

	public SchoolFootballClub(String nameOfClub, String locationOfCLub,int numOfWin, int numOfDraw,
							  int numOfDefeat, int score, int numOfPoints, int numOfPlayedMatches,String date,
							  String nameOfSchool) {
		super(nameOfClub, locationOfCLub, numOfWin, numOfDraw, numOfDefeat, score, numOfPoints, numOfPlayedMatches,date);
		this.nameOfSchool = nameOfSchool;
	}


}
