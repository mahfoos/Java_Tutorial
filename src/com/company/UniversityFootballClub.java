package com.company;

public class UniversityFootballClub extends FootballClub{
	private String nameOfUniversity;

	public UniversityFootballClub(String nameOfClub, String locationOfCLub, int numOfWin,
								  int numOfDraw, int numOfDefeat,int numOfScore,int receivedGoal,int goalDifference, int numOfPoints,
								  int numOfPlayedMatches,String date, String nameOfUniversity) {
		super(nameOfClub, locationOfCLub, numOfWin, numOfDraw, numOfDefeat, numOfScore, numOfPoints,receivedGoal,goalDifference, numOfPlayedMatches,date);
		this.nameOfUniversity = nameOfUniversity;
	}



}
