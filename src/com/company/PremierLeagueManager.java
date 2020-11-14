package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PremierLeagueManager implements LeagueManager {
	static private int win;
	static private int point;
	static private int drawn ;
	static private int lost;

	static public List<SportsClub> sportsClubList = new ArrayList<>();

	@Override
	public void addFootballClub(SportsClub sportsClub) {
		if (sportsClubList.contains(sportsClub)) {
			System.out.println("This Club Already added");
		} else {
			sportsClubList.add(sportsClub);
		}

	}

	@Override
	public void delFootballClub() {

	}

	@Override
	public void DisplayClubDetails(String name) {
		if (sportsClubList.isEmpty()) {
			System.out.println("No Clubs are Created Still");
		} else{
			for (SportsClub sportsClub : sportsClubList) {
				if (sportsClub.getNameOfClub().equals(name)) {
					System.out.println("\n:::::::::::::::::::::: Created Football Clubs ::::::::::::::::::::::::::::::");
					System.out.println("\n1: Name Of the Club : " + sportsClub.getNameOfClub());
					System.out.println("\n2: Location of the Club : " + sportsClub.getLocationOfCLub());
					System.out.println("\n3: Number of Played Matches : "+((FootballClub) sportsClub).getNumOfPlayedMatches());
					System.out.println("\n4: Number of Won Matches : " + ((FootballClub) sportsClub).getNumOfWin());
					System.out.println("\n5: Number of Defeat Matches : " + ((FootballClub) sportsClub).getNumOfDefeat());
					System.out.println("\n6: Number of Drawn Matches : " + ((FootballClub) sportsClub).getNumOfDraw());
					System.out.println("\n7: Total Score of the Club :  " + ((FootballClub) sportsClub).getNumOfScore());
					System.out.println("\n8: Total Received Goal : " + ((FootballClub) sportsClub).getReceivedGoal());
					System.out.println("\n9: Goal Difference : " + ((FootballClub) sportsClub).getGoalDifference());
					System.out.println("\n8: Total Points of the Club : " + ((FootballClub) sportsClub).getNumOfPoints());

				} else {
					System.out.println("Not Found the Club in Added list ");
				}
				}

			}

		}


	@Override
	public void displayPremierLeagueTable() {

		String leftAlignFormat = "| %-15s | %-20s | %-8s | %-8s | %-8s | %-8s | %-9s | %-12s | %-14S | %-7s | %n";
		System.out.format("+-----------------+----------------------+----------+----------+----------+----------+-----------+--------------+-----------------+--------%n");
		System.out.format("| Position        | Club Name            | Played   | Won      | Drawn    | Lost     | Goals For | Goal Against | Goal Difference | Points |%n");
		System.out.format("+-----------------+----------------------+----------+----------+----------+----------+-----------+--------------+-----------------+---------%n");
		for (SportsClub sportsClub : sportsClubList) {
			System.out.format(leftAlignFormat, "aaa", sportsClub.getNameOfClub(), ((FootballClub) sportsClub).getNumOfPlayedMatches(), ((FootballClub) sportsClub).getNumOfWin()
					, ((FootballClub) sportsClub).getNumOfDraw(), ((FootballClub) sportsClub).getNumOfDefeat(), ((FootballClub) sportsClub).getNumOfScore(),((FootballClub) sportsClub).getReceivedGoal(),
					((FootballClub) sportsClub).getGoalDifference(),((FootballClub) sportsClub).getNumOfPoints());
		}
		System.out.format("+-----------------+----------------------+----------+----------+----------+----------+-----------+--------------+-----------------+---------%n");


	}

	@Override
	public void addPlayMatch(String firstTeam, String seccondTeam, int score1, int score2, String date) {
		int count = 0;
		for (SportsClub sportsClub : sportsClubList) {
			if (sportsClub.getNameOfClub().equals(firstTeam)) {
				score(score1, score2, ((FootballClub) sportsClub));
				SportsClub sportsClub1 = new FootballClub(firstTeam, sportsClub.getLocationOfCLub(), win, drawn, lost, score1 + ((FootballClub) sportsClub).getNumOfScore(),score2 +((FootballClub) sportsClub).getReceivedGoal() ,
						score1 + ((FootballClub) sportsClub).getNumOfScore() - score2 +((FootballClub) sportsClub).getReceivedGoal(),point,
						((FootballClub) sportsClub).getNumOfPlayedMatches() + 1, date);


				sportsClubList.set(count, sportsClub1);
			} else if (sportsClub.getNameOfClub().equals(seccondTeam)) {
				score(score2, score1, ((FootballClub) sportsClub));
				SportsClub sportsClub1 = new FootballClub(seccondTeam, sportsClub.getLocationOfCLub(), win, drawn, lost, score2 + ((FootballClub) sportsClub).getNumOfScore(),score1+((FootballClub) sportsClub).getReceivedGoal(),
						score2 + ((FootballClub) sportsClub).getNumOfScore() - score1 +((FootballClub) sportsClub).getReceivedGoal(),point,
						((FootballClub) sportsClub).getNumOfPlayedMatches() + 1, date);
				sportsClubList.set(count, sportsClub1);
			}
			count++;
		}

	}

	public void score(int score1, int score2, FootballClub footballClub) {
		win =0;
		point = 0;
		drawn = 0;
		lost =0;
		if (score1 > score2) {
			win = footballClub.getNumOfWin() + 1;
			point = footballClub.getNumOfPoints() + 3;
		} else if (score1 == score2) {
			drawn = footballClub.getNumOfDraw() + 1;
			point = footballClub.getNumOfPoints() + 1;
		} else {
			lost = footballClub.getNumOfDefeat() + 1;
			point = footballClub.getNumOfPoints();
		}


	}


}

