package com.company;

import java.util.Scanner;

public class ConsoleApplication {

	static LeagueManager manager = new PremierLeagueManager();
	final static Scanner USER_INPUT = new Scanner(System.in);
	public static void main(String[] args) {
		menu:
		while (true){
			displayMenu();
			int option = USER_INPUT.nextInt();

			switch (option){
				case 1:
					addFootballClub();
					break;
				case 2:
					//delFootballClub();
					break;
				case 3:
					manager.DisplayClubDetails();
					break ;
				case 4:
					manager.displayPremierLeagueTable();
					break ;
				case 5:
					addPlayMatch();
					break ;
				case 6:
					System.out.println("Thank You For Use the Premier League Console Application");
					break menu;
				default:
					System.out.println("You Selected an Invalid Option. Please Try Again! ");
			}
		}
	}

	public static void displayMenu(){
		System.out.println("Welcome to Premier League Football");
		System.out.println("1: Create a new football club and add it in the premier league.");
		System.out.println("2: Delete relegated an existing club from the premier league");
		System.out.println("3: Display the Information about selected Club ");
		System.out.println("4: Display the Premier League Table");
		System.out.println("5: Add a played match with its score and its date ");
		System.out.println("6: Quit the Application");
	}

	public static void addFootballClub(){
//		SportsClub sportsClub = new FootballClub("Barcelona","Spain",0,0,0,0,0,0,"g");
//		SportsClub sportsClub1 = new FootballClub("Beyren","Germani",0,0,0,0,0,0,"g");
//		PremierLeagueManager.sportsClubList.add(sportsClub);
//		PremierLeagueManager.sportsClubList.add(sportsClub1);
		SportsClub sportsClub;

		System.out.println("Enter the Club Name: ");
		String clubName = USER_INPUT.next();

		System.out.println("Enter the Location of Club: ");
		String location = USER_INPUT.next();

		sportsClub = new FootballClub(clubName,location,0,0,0,0,0,0,"---");

		manager.addFootballClub(sportsClub);


	}

	public static void addPlayMatch(){

		//premierLeagueManager.addPlayMatch("Barcelona","Beyren",2,3,"g");

		System.out.println("Enter the First Club name : ");
		String firstTeam = USER_INPUT.next();

		System.out.println("Enter the Second Club Name : ");
		String seccondTeam = USER_INPUT.next();

		System.out.println("Enter the First Club Score : ");
		int score1 = USER_INPUT.nextInt();

		System.out.println("Enter the Seccond Club Score : ");
		int score2 = USER_INPUT.nextInt();

		System.out.println("Enter the Date: ");
		String date = USER_INPUT.next();

		manager.addPlayMatch(firstTeam,seccondTeam,score1,score2,date);


	}

	public static void DisplayClubDetails(){

		System.out.println("Enter the Club Name: ");
		String name = USER_INPUT.next();


	}


}
