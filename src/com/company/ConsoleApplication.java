package com.company;

import java.util.Scanner;

public class ConsoleApplication {
	private static boolean decide;
	private static String clubName;
	private static String location;
	private static boolean clubNameCheck;
	private static boolean locationCheck;
	static LeagueManager manager = new PremierLeagueManager();
	final static Scanner USER_INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		menu:
		do {
			displayMenu();
			System.out.print("\nEnter the option here : ");
			int option = USER_INPUT.nextInt();

			switch (option) {
				case 1:
					addFootballClub();
					endOfDecide();
					break;
				case 2:
					//delFootballClub();
					break;
				case 3:
					DisplayClubDetails();
					endOfDecide();
					break;

				case 4:
					manager.displayPremierLeagueTable();
					endOfDecide();
					break;
				case 5:
					addPlayMatch();
					endOfDecide();
					break;
				case 6:
					System.out.println("\n:::::::::::Thank You For Use the Premier League Console Application::::::::");
					decide = false;
					break menu;
				default:
					System.out.println("\nYou Selected an Invalid Option. Please Try Again! ");
					endOfDecide();
			}
		} while (decide);
	}

	private static void displayMenu() {
		System.out.println("\n:::::::::::::::::::::::::::Welcome to Premier League Football::::::::::::::::::::::::::");
		System.out.println("\n1: Create a new football club and add it in the premier league.");
		System.out.println("\n2: Delete relegated an existing club from the premier league");
		System.out.println("\n3: Display the Information about selected Club ");
		System.out.println("\n4: Display the Premier League Table");
		System.out.println("\n5: Add a played match with its score and its date ");
		System.out.println("\n6: Quit the Application\n");
		System.out.println("\n::::::::::::::::::::::::::::Choose the option You want:::::::::::::::::::::::::::::::::");
	}

	private static void addFootballClub() {
		SportsClub sportsClub;
		do {
			System.out.print("\nEnter the Club Name: ");
			clubName = USER_INPUT.next();
			clubNameCheck = clubName.matches("^[a-zA-Z]*$");

			if (!clubNameCheck) {
				System.out.println("\nPlease enter valid input");
			}
		} while (!clubNameCheck);

		do {

			System.out.print("\nEnter the Location of Club: ");
			location = USER_INPUT.next();
			locationCheck = location.matches("^[a-zA-Z]*$");

			if (!locationCheck)
				System.out.println("\nPlease enter valid input");

		} while (!locationCheck);

		sportsClub = new FootballClub(clubName, location, 0, 0, 0, 0,0, 0,0, 0, "");
		manager.addFootballClub(sportsClub);


	}

	private static void addPlayMatch() {
		boolean check;

			System.out.print("\nEnter the First Club name : ");
			String firstTeam = USER_INPUT.next();

			System.out.print("\nEnter the Second Club Name : ");
			String secondTeam = USER_INPUT.next();

			System.out.print("\nEnter the First Club Score : ");
			int score1 = USER_INPUT.nextInt();

			System.out.print("\nEnter the Second Club Score : ");
			int score2 = USER_INPUT.nextInt();

			System.out.print("\nEnter the Date: ");
			String date = USER_INPUT.next();

			manager.addPlayMatch(firstTeam, secondTeam, score1, score2, date);



	}
	private static void DisplayClubDetails() {
		do {
			System.out.print("\nEnter the Club Name: ");
			clubName = USER_INPUT.next();
			clubNameCheck = Validation.stringCheck(clubName);
		} while (!clubNameCheck);
		manager.DisplayClubDetails(clubName);

	}

	private static void endOfDecide() {
		while (true) {
			System.out.println("\nExit the Program Enter :: E  \nContinue the Program Enter :: C");
			System.out.println("\n:::::::::::::::::::::::::::::::Choose the Option You Want :::::::::::::::::::::::::::");
			System.out.print("\nEnter the Option here : ");
			String decision = USER_INPUT.next();

			if (decision.equalsIgnoreCase("e")) {
				System.out.println("::::::::::::::::::::::::::::::: Exit the Program ::::::::::::::::::::::::::::::::");
				decide = false;
				break;
			} else if (decision.equalsIgnoreCase("c")) {
				decide = true;
				break;
			} else {
				System.out.println("Please type valid command");
			}

		}
	}


}
