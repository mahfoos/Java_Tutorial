package com.company;

public class SchoolFootballClub extends FootballClub{
	private String nameOfSchool;

	public SchoolFootballClub(String nameOfClub, String locationOfCLub,int numOfWin, int numOfDraw,
							  int numOfDefeat, int numOfScore,int receivedGoal,int goalDifference, int numOfPoints, int numOfPlayedMatches,String date,
							  String nameOfSchool) {
		super(nameOfClub, locationOfCLub, numOfWin, numOfDraw, numOfDefeat, numOfScore,receivedGoal,goalDifference, numOfPoints, numOfPlayedMatches,date);
		this.nameOfSchool = nameOfSchool;
	}


}
