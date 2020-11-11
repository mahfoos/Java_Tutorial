package com.company;

import java.util.ArrayList;
import java.util.List;

public class PremierLeagueManager implements LeagueManager {
	static private int win;
	static private int point;
	static private int drawn;
	static private int lost;

	private List<SportsClub> sportsClubList = new ArrayList<>();

	@Override
	public void addFootballClub(SportsClub sportsClub) {
		if (sportsClubList.contains(sportsClub)) {
			System.out.println("This Club Already added");
		} else {
			sportsClubList.add(sportsClub);
		}
		sportsClubList.add(sportsClub);
	}

	@Override
	public void delFootballClub() {

	}

	@Override
	public void DisplayClubDetails() {

		if (sportsClubList.isEmpty()) {
			System.out.println("No Clubs are Created Still");
		} else {
			System.out.println("Created Clubs");
			for (SportsClub sportsClub : sportsClubList) {
				System.out.println("Name Of the Club: " + sportsClub.getNameOfClub());
				System.out.println("Location of the Club: " + sportsClub.getLocationOfCLub());
				System.out.println("Number of Won Matches: " + ((FootballClub) sportsClub).getNumOfWin());
				System.out.println("Number of Defeat Matches: " + ((FootballClub) sportsClub).getNumOfDefeat());
				System.out.println("Number of Drawn Matches: " + ((FootballClub) sportsClub).getNumOfDraw());
				System.out.println("Total Score of the Club:  "+ ((FootballClub) sportsClub).getScore());
				System.out.println("Total Points of the Club: " + ((FootballClub) sportsClub).getNumOfPoints());

			}

		}

	}

	@Override
	public void displayPremierLeagueTable() {

	}

	@Override
	public void addPlayMatch(String firstTeam, String seccondTeam, int score1, int score2, String date) {
		int count = 0;
		for (SportsClub sportsClub : sportsClubList) {
			if (sportsClub.getNameOfClub() == firstTeam){
				score(score1,score2,((FootballClub) sportsClub));
				SportsClub sportsClub1 = new FootballClub(firstTeam,sportsClub.getLocationOfCLub(),win,drawn,lost,score1 +((FootballClub) sportsClub).getScore(), point,
						((FootballClub) sportsClub).getNumOfPlayedMatches() + 1,date);

				sportsClubList.set(count,sportsClub1);
			}else if(sportsClub.getNameOfClub() == seccondTeam){
				score(score2,score1,((FootballClub) sportsClub));
				SportsClub sportsClub1 = new FootballClub(seccondTeam,sportsClub.getLocationOfCLub(),win,drawn,lost,score2 +((FootballClub) sportsClub).getScore(), point,
						((FootballClub) sportsClub).getNumOfPlayedMatches() + 1,date);
			}
		}

	}

	public void score(int score1,int score2,FootballClub footballClub){
		if (score1 > score2){
			win =  footballClub.getNumOfWin() + 1; // typecasting
			point = footballClub.getNumOfPoints() + 3;
		}else if (score1 == score2){
			drawn = footballClub.getNumOfDraw() + 1;
			point = footballClub.getNumOfPoints() + 1;
		}else {
			lost = footballClub.getNumOfDefeat() + 1;
			point = footballClub.getNumOfPoints();
		}


	}




}

