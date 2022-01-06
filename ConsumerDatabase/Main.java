// -------------------------------------------------------
// Assignment 1
// Written by: Adir Ben-David 40190551 & Jonathan Abitbol 40190550
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 03, 2021
// -------------------------------------------------------

//Welcome to my Driver.
//This program is written on 09/18/21 by Adir Ben-David & Jonathan Abitbol.
//The purpose of this driver is to help a marketing company keep track of their consumer base.

/**
 * Adir Ben-David 40190551 & Jonathan Abitbol 40190550
 * COMP 249
 * Assignment #1
 * 10/03/2021
 */

/**
 * Imports the scanner for prompting the user
 */
import java.util.Scanner;

/**
 * The Consumer class is to get information about a specific consumer.
 * @author Adir Ben-David & Jonathan Abitbol
 * @version 1.0
 * @since 2021-09-17
 */
public class Main {

	/**
	 * This is the driver class that allows the user to create/edit a consumer.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);

		//Variable Declaration
		int attempts = 0;
		int noOfCons = 0;
		String pswrd;
		int index;
		int option;
		int choice;
		final String PASSWORD = "password";
		final int MAXATTEMPTS = 3;
		final int FINATTEMPTS = 12;

		//Welcome message
		System.out.println("[-------------------------------------------------------]");
		System.out.println("[             WELCOME TO SUNSHINE MARKETING             ]");
		System.out.println("[-------------------------------------------------------]");
		System.out.print("\nEnter the maximum number of consumers the company can handle: ");
		int maxConsumer = keyIn.nextInt();
		Consumer consumerDataBase[] = new Consumer[maxConsumer];

		do {//This do-while loop is to make sure that this will repeat until the user enters option 5
			do {//This do-while loop is to make sure the user inputs a number between 1-5. If not it will repeat.

				System.out.println("\nWhat do you want to do?");
				System.out.println("\t1. Enter a new Consumer (password required)");
				System.out.println("\t2. Change information of a Consumer (password required)");
				System.out.println("\t3. Display all Consumers similar to a given consumer");
				System.out.println("\t4. Display all Consumers with a given age and location");
				System.out.println("\t5. Quit");
				System.out.print("Please enter your choice > ");
				choice = keyIn.nextInt();

			} while (choice < 1 || choice > 5);

			//Switch statement so the user can decide what he wants to do.
			switch (choice) {

			case 1:

				for (int i = 0; i < MAXATTEMPTS; i++) {
					System.out.print("\nPlease Enter Password: ");
					pswrd = keyIn.next();
					//if user doesn't enter the correct password
					if (!(pswrd.equalsIgnoreCase(PASSWORD))) {
						System.out.println("Incorrect Password! Please try again");
						attempts++;
						if (attempts == FINATTEMPTS) {//if user enters the incorrect password 12 times
							System.out.println(
									"\nProgram has detected suspicious activity and will terminate immediately!");
							System.exit(0);
						}

					}
					//if user enters the correct password
					if (pswrd.equalsIgnoreCase(PASSWORD)) {
						do {
							System.out.print("\nHow many Consumers do you want to enter: ");
							noOfCons = keyIn.nextInt();
							i = MAXATTEMPTS;
							if (noOfCons > maxConsumer) {
								System.out.println(
										"\nYou have entered more consumers than the maximum number of consumers allowed! The number of consumers the company can handle is "
												+ maxConsumer + ".");
							}

						} while (noOfCons > maxConsumer);

						for (int j = 0; j < noOfCons; j++) {
							consumerDataBase[Consumer.getNumberOfConsumer()] = new Consumer();
							System.out.print("\nEnter consumer's #" + (Consumer.getNumberOfConsumer()) + " name: ");
							String c_name = keyIn.next();
							consumerDataBase[Consumer.getNumberOfConsumer() - 1].setName(c_name);
							System.out.print("\nEnter consumer's age: ");
							int c_age = keyIn.nextInt();
							consumerDataBase[Consumer.getNumberOfConsumer() - 1].setAge(c_age);
							System.out.print("\nEnter consumer's gender: ");
							String c_gender = keyIn.next();
							consumerDataBase[Consumer.getNumberOfConsumer() - 1].setGender(c_gender);
							System.out.print("\nEnter Street Number: ");
							int c_streetNo = keyIn.nextInt();
							consumerDataBase[Consumer.getNumberOfConsumer() - 1].setStreetNumber(c_streetNo);
							System.out.print("\nEnter Street Name: ");
							String c_streetName = keyIn.next();
							consumerDataBase[Consumer.getNumberOfConsumer() - 1].setStreetName(c_streetName);
							System.out.print("\nEnter City: ");
							String c_city = keyIn.next();
							consumerDataBase[Consumer.getNumberOfConsumer() - 1].setCity(c_city);
							System.out.print("\nEnter Postal Code: ");
							String c_postalCode = keyIn.next();
							consumerDataBase[Consumer.getNumberOfConsumer() - 1].setPostalCode(c_postalCode);
							consumerDataBase[Consumer.getNumberOfConsumer() - 1].inputMaritalStatus();
							consumerDataBase[Consumer.getNumberOfConsumer() - 1].inputEducation();

						}

						maxConsumer -= noOfCons;
					}

				}
				break;

			case 2:
				for (int i = 0; i < MAXATTEMPTS; i++) {
					System.out.print("\nPlease Enter Password: ");
					pswrd = keyIn.next();
					//if user enters the incorrect password
					if (!(pswrd.equalsIgnoreCase(PASSWORD))) {
						System.out.println("Incorrect Password! Please try again");
						attempts++;
						//if user enters the incorrect password 3 times it will exit the program
						if (attempts == MAXATTEMPTS) {
							System.out.println("\nProgram terminated due to safety reasons!");
							System.exit(0);
						}

					}
					//if user enters the correct password
					if (pswrd.equalsIgnoreCase(PASSWORD)) {
						do {
							i = MAXATTEMPTS;
							System.out.print("\nWhich consumer do you wish to update: ");
							index = keyIn.nextInt();
							if (index > Consumer.getNumberOfConsumer()) {
								String yesORno;
								do {
									System.out.print(
											"This consumer does not exist! Do you wish to re-enter another consumer? ");

									yesORno = keyIn.next();
									if (yesORno.equalsIgnoreCase("yes")) {
										continue;
									}
								} while (!(yesORno.equalsIgnoreCase("yes")) && !(yesORno.equalsIgnoreCase("no")));
								if (yesORno.equalsIgnoreCase("no")) {
									break;
								}

							}
						} while (index > Consumer.getNumberOfConsumer());

						if (index <= Consumer.getNumberOfConsumer()) {
							System.out.print("\nYou are updating consumer #" + (index) + ": \n"
									+ consumerDataBase[index - 1] + "\n");
							do {
								System.out.println("\nWhat information would you like to change?");
								System.out.println("\t1. Consumer name");
								System.out.println("\t2. Location");
								System.out.println("\t3. Age");
								System.out.println("\t4. Gender");
								System.out.println("\t5. Marital Status");
								System.out.println("\t6. Quit");
								System.out.print("Please enter your choice> ");
								option = keyIn.nextInt();
								if (option < 1 || option > 6) {
									System.out.println("Incorrect! Please enter a valid choice!");
								}

								switch (option) {
								case 1:
									System.out.print("\nEnter consumer's #" + (index) + " new name: ");
									String newName = keyIn.next();
									consumerDataBase[index - 1].setName(newName);
									System.out.println(consumerDataBase[index - 1]);
									break;
								case 2:
									System.out.print("\nEnter new Street Number: ");
									int newStreetNo = keyIn.nextInt();
									consumerDataBase[index - 1].setStreetNumber(newStreetNo);
									System.out.print("\nEnter new Street Name: ");
									String newStreetName = keyIn.next();
									consumerDataBase[index - 1].setStreetName(newStreetName);
									System.out.print("\nEnter new City: ");
									String newCity = keyIn.next();
									consumerDataBase[index - 1].setCity(newCity);
									System.out.print("\nEnter new Postal Code: ");
									String newPostalCode = keyIn.next();
									consumerDataBase[index - 1].setPostalCode(newPostalCode);
									System.out.println(consumerDataBase[index - 1]);
									break;
								case 3:
									System.out.print("\nEnter consumer's new age: ");
									int newAge = keyIn.nextInt();
									consumerDataBase[index - 1].setAge(newAge);
									System.out.println(consumerDataBase[index - 1]);
									break;
								case 4:
									System.out.print("\nEnter consumer's new gender: ");
									String newGender = keyIn.next();
									consumerDataBase[index - 1].setGender(newGender);
									System.out.println(consumerDataBase[index - 1]);
									break;
								case 5:
									consumerDataBase[index - 1].inputMaritalStatus();
									System.out.println(consumerDataBase[index - 1]);
									break;
								}
							} while (option == 1 || option == 2 || option == 3 || option == 4 || option == 5);

						}

					}

				}

				break;

			case 3:
				System.out.print("\nPlease enter the following information: \n");
				System.out.print("\nAge: ");
				int enterAge = keyIn.nextInt();
				System.out.print("Gender: ");
				String enterGender = keyIn.next();
				System.out.print("Education: ");
				String enterEducation = keyIn.next();

				Consumer.findConsumersBy(consumerDataBase, enterAge, enterGender, enterEducation.toUpperCase());
				break;

			case 4:
				System.out.print("\nPlease enter the following information: \n");
				System.out.print("\nAge: ");
				int e_age = keyIn.nextInt();
				System.out.print("Postal Code (Enter with no space): ");
				String e_postal = keyIn.next();

				Consumer.findConsumersByAgeNPostalCode(consumerDataBase, e_age, e_postal);

				break;
			case 5:

				System.out.println("\nThank you for trusting Sunshine Marketing! ");
				break;

			}

		} while (choice == 1 || choice == 2 || choice == 3 || choice == 4);

	}

}
