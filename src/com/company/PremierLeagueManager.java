package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PremierLeagueManager implements LeagueManager {
	static private int win;
	static private int point;
	static private int drawn;
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
		int size = sportsClubList.size();
		sportsClubList.remove(size - 1);
	}

	@Override
	public void DisplayClubDetails(String name) {
		if (sportsClubList.isEmpty()) {
			System.out.println("No Clubs are Created Still");
		} else {
			for (SportsClub sportsClub : sportsClubList) {
				if (sportsClub.getNameOfClub().equals(name)) {
					System.out.println("\n:::::::::::::::::::::: Created Football Clubs ::::::::::::::::::::::::::::::");
					System.out.println("\n1: Name Of the Club : " + sportsClub.getNameOfClub());
					System.out.println("\n2: Location of the Club : " + sportsClub.getLocationOfClub());
					System.out.println("\n3: Number of Played Matches : " + ((FootballClub) sportsClub).getNumOfPlayedMatches());
					System.out.println("\n4: Number of Won Matches : " + ((FootballClub) sportsClub).getNumOfWin());
					System.out.println("\n5: Number of Defeat Matches : " + ((FootballClub) sportsClub).getNumOfDefeat());
					System.out.println("\n6: Number of Drawn Matches : " + ((FootballClub) sportsClub).getNumOfDraw());
					System.out.println("\n7: Total Score of the Club :  " + ((FootballClub) sportsClub).getNumOfScoredGoals());
					System.out.println("\n8: Total Received Goal : " + ((FootballClub) sportsClub).getNumOfReceivedGoals());
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

		sportsClubList.sort(Collections.reverseOrder()); // Sort
		String leftAlignFormat = "| %-15s | %-20s | %-8s | %-8s | %-8s | %-8s | %-9s | %-12s | %-14S | %-7s | %n";
		System.out.format("+-----------------+----------------------+----------+----------+----------+----------+-----------+--------------+-----------------+---------+%n");
		System.out.format("| Position        | Club Name            | Played   | Won      | Drawn    | Lost     | Goals For | Goal Against | Goal Difference | Points  |%n");
		System.out.format("+-----------------+----------------------+----------+----------+----------+----------+-----------+--------------+-----------------+---------+%n");
		for (SportsClub sportsClub : sportsClubList) {
			System.out.format(leftAlignFormat, ((FootballClub) sportsClub).getPosition(), sportsClub.getNameOfClub(), ((FootballClub) sportsClub).getNumOfPlayedMatches(), ((FootballClub) sportsClub).getNumOfWin()
					, ((FootballClub) sportsClub).getNumOfDraw(), ((FootballClub) sportsClub).getNumOfDefeat(), ((FootballClub) sportsClub).getNumOfScoredGoals(), ((FootballClub) sportsClub).getNumOfReceivedGoals(),
					((FootballClub) sportsClub).getGoalDifference(), ((FootballClub) sportsClub).getNumOfPoints());

		}
		System.out.format("+-----------------+----------------------+----------+----------+----------+----------+-----------+--------------+-----------------+---------+%n");


	}

	@Override
	public void addPlayMatch(String firstTeam, String seccondTeam, int score1, int score2, String date) {
		int count = 0;
		for (SportsClub sportsClub : sportsClubList) {
			int difference1 = score1 + ((FootballClub) sportsClub).getNumOfScoredGoals() - score2 + ((FootballClub) sportsClub).getNumOfReceivedGoals();
			int difference2 = score2 + ((FootballClub) sportsClub).getNumOfScoredGoals() - score1 + ((FootballClub) sportsClub).getNumOfReceivedGoals();
			if (sportsClub.getNameOfClub().equals(firstTeam)) {
				checkPoints(firstTeam, score1, score2, date, count, sportsClub, difference1);
			} else if (sportsClub.getNameOfClub().equals(seccondTeam)) {
				checkPoints(seccondTeam, score2, score1, date, count, sportsClub, difference2);
			}
			count++;
		}

		int position = 0;
		sportsClubList.sort(Collections.reverseOrder());
		for(SportsClub sportsClub2 : sportsClubList) {
			SportsClub sportsClub3 = new FootballClub(sportsClub2.getNameOfClub(), sportsClub2.getLocationOfClub(), ((FootballClub) sportsClub2).getNumOfWin(), ((FootballClub) sportsClub2).getNumOfDraw(), ((FootballClub) sportsClub2).getNumOfDefeat(), ((FootballClub) sportsClub2).getNumOfScoredGoals(), ((FootballClub) sportsClub2).getNumOfReceivedGoals(),
					((FootballClub) sportsClub2).getGoalDifference(), ((FootballClub) sportsClub2).getNumOfPoints(), ((FootballClub) sportsClub2).getNumOfPlayedMatches(), ((FootballClub) sportsClub2).getDate(), position + 1);
			sportsClubList.set(position, sportsClub3);
			position++;
		}

	}

	private void checkPoints(String firstTeam, int score1, int score2, String date, int count, SportsClub sportsClub, int difference1) {
		score(score1, score2, ((FootballClub) sportsClub));
		SportsClub sportsClub1 = new FootballClub(firstTeam, sportsClub.getLocationOfClub(), win, drawn, lost, score1 + ((FootballClub) sportsClub).getNumOfScoredGoals(), score2 + ((FootballClub) sportsClub).getNumOfReceivedGoals(),
				difference1, point, ((FootballClub) sportsClub).getNumOfPlayedMatches() + 1, date, ((FootballClub) sportsClub).getPosition());


		sportsClubList.set(count, sportsClub1);
	}




	public void score(int score1, int score2, FootballClub footballClub) {
		win = 0;
		point = 0;
		drawn = 0;
		lost = 0;
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

	@Override
	public void saveData() {

		try {
			FileOutputStream fileOut = new FileOutputStream("sample");
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(sportsClubList);
			objOut.close();
			fileOut.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}


	}

	@Override
	public void loadData() {
		try {

			FileInputStream fileInput = new FileInputStream("sample");
			ObjectInputStream objOutput = new ObjectInputStream(fileInput);

			sportsClubList = (ArrayList) objOutput.readObject();

			objOutput.close();
			fileInput.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
			return;
		} catch (ClassNotFoundException classNotFound) {
			System.out.println("Class not found");
			classNotFound.printStackTrace();
			return;
		}
	}


}

