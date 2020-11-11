package com.company;

public class UniversityFootballClub extends FootballClub{
	private String nameOfUniversity;

	public UniversityFootballClub(String nameOfClub, String locationOfCLub, int numOfWin,
								  int numOfDraw, int numOfDefeat,int score, int numOfPoints,
								  int numOfPlayedMatches,String date, String nameOfUniversity) {
		super(nameOfClub, locationOfCLub, numOfWin, numOfDraw, numOfDefeat, score, numOfPoints, numOfPlayedMatches,date);
		this.nameOfUniversity = nameOfUniversity;
	}

	@Override
	public String toString() {
		return "UniversityFootballClub{" +
				"nameOfUniversity='" + nameOfUniversity + '\'' +
				'}';
	}
}
