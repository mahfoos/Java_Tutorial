package com.company;

import java.util.ArrayList;
import java.util.List;

public class PremierLeagueManager implements LeagueManager {

	private List<SportsClub> sportsClubList = new ArrayList<>();

	@Override
	public void addFootballClub(SportsClub sportsClub) {
		if (sportsClubList.contains(sportsClub)){
			System.out.println("This Club Already added");
		}
		else {
			sportsClubList.add(sportsClub);
		}
		sportsClubList.add(sportsClub);
	}

	@Override
	public void delFootballClub() {

	}

	@Override
	public void DisplayStatistics() {
		if(sportsClubList.isEmpty()){
			System.out.println("No Clubs are Created Still");
		}
		else {
			System.out.println("Created Clubs");
			for (SportsClub sportsClub : sportsClubList){
				System.out.println(sportsClub);
			}
		}

	}

	@Override
	public void displayPremierLeagueTable() {

	}

	@Override
	public void addPlayMatch() {

	}
}
