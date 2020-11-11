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
					manager.displayPremierLeagueTable();
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
		SportsClub sportsClub;

		System.out.println("Enter the Club Name: ");
		String clubName = USER_INPUT.next();

		System.out.println("Enter the Location of Club: ");
		String location = USER_INPUT.next();

		sportsClub = new FootballClub(clubName,location,0,0,0,0,0,0,"---");

		manager.addFootballClub(sportsClub);


	}

	public static void addPlayMatch(){


		System.out.println("Enter the First Club name : ");
		String firstTeam = USER_INPUT.next();

		System.out.println("Enter the Seccond Club Name : ");
		String seccondTeam = USER_INPUT.next();

		System.out.println("Enter the First Club Score : ");
		int score1 = USER_INPUT.nextInt();

		System.out.println("Enter the Seccond Club Score : ");
		int score2 = USER_INPUT.nextInt();

		System.out.println("Enter the Date: ");
		String date = USER_INPUT.next();



	}

	public static void DisplayClubDetails(){

		System.out.println("Enter the Club Name: ");
		String name = USER_INPUT.next();
	}


}
