package com.company;

public class SchoolFootballClub extends FootballClub{
	private String nameOfSchool;

	public SchoolFootballClub(String nameOfClub, String locationOfCLub,int numOfWin, int numOfDraw,
							  int numOfDefeat, int numOfScoredGoals,int numOfReceivedGoals,int goalDifference, int numOfPoints, int numOfPlayedMatches,String date,
							  String nameOfSchool) {
		super(nameOfClub, locationOfCLub, numOfWin, numOfDraw, numOfDefeat, numOfScoredGoals,numOfReceivedGoals,goalDifference, numOfPoints, numOfPlayedMatches,date);
		this.nameOfSchool = nameOfSchool;
	}


}

