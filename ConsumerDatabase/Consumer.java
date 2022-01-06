// -------------------------------------------------------
// Assignment 1
// Written by: Adir Ben-David 40190551 & Jonathan Abitbol 40190550
// For COMP 249 Section D-DB Fall 2021
// Due Date = Sunday October 03, 2021
// -------------------------------------------------------

//Welcome to my Consumer Method Class.
//This program is written on 09/17/21 by Adir Ben-David and Jonathan Abitbol.
//The purpose of this class is to store information about the consumer into methods.

/**
 * Adir Ben-David 40190551 & Jonathan Abitbol 40190550
 * COMP 249
 * Assignment #1
 * 10/03/2021
 */
import java.util.Scanner;
/**
 * The Consumer class is to get information about a specific consumer.
 * @author Adir Ben-David & Jonathan Abitbol
 * @version 1.0
 * @since 2021-09-17
 */

public class Consumer {
	
	/**
	 * Import a scanner for prompting the user.
	 */
	static Scanner keyIn = new Scanner(System.in);
	
	/**
	 * Attributes of string name that holds consumer's name
	 */
	 private String name;
	 /**
		 * Attributes of int street number that holds consumer's street number
		 */
	private int streetNumber;
	/**
	 * Attributes of string street name that holds consumer's street name
	 */
	private String streetName;
	/**
	 * Attributes of string city that holds consumer's city
	 */
	private String city;
	/**
	 * Attributes of string postal code that holds consumer's postal code
	 */
	private String postalCode;
	/**
	 * Attributes of int age that holds consumer's age
	 */
	private int age;
	/**
	 * Attributes of string gender that holds consumer's gender
	 */
	private String gender;
	/**
	 * Attributes of maritalStatus m that holds consumer's marital status
	 */
	private maritalStatus m;
	/**
	 * Attributes of education e that holds consumer's education
	 */
	private education e;
	/**
	 * Static attribute to keep track of the number of consumer
	 */
	private static int numberOfConsumer;

	/**
	 *This documents holds all types of martial status
	 */
	public enum maritalStatus {
		/**
		 * Married is a marital status type
		 */
		MARRIED,
		/**
		 * Widowed is a marital status type
		 */
		WIDOWED,
		/**
		 * Separated is a marital status type
		 */
		SEPARATED, 
		/**
		 * Divorced is a marital status type
		 */
		DIVORCED,
		/**
		 * Single is a marital status type
		 */
		SINGLE;
	}

	/**
	 *This documents hold all types of educations
	 */
	public enum education {
		/**
		 * Highschool is a type of a education
		 */
		HIGHSCHOOL,
		/**
		 * Cegep is a type of a education
		 */
		CEGEP,
		/**
		 * University is a type of a education
		 */
		UNIVERSITY;
	}

	/**
	 *  Default Constructor
	 * For invocation by subclass constructors, typically implicit.)
	 */
	public Consumer() {
		numberOfConsumer++;
	}
	
	/**
	 * Constructor that initializes all the attributes.
	 * @param name holds the consumer's name
	 * @param streetNumber holds the consumer's street number
	 * @param streetName holds the consumer's street name
	 * @param city holds the consumer's city
	 * @param postalCode holds the consumer's postal Code
	 * @param age holds the consumer's age
	 * @param gender holds the consumer's gender
	 * @param m holds the consumer's marital status
	 * @param e holds the consumer's education level
	 */

	public Consumer(String name, int streetNumber, String streetName, String city, String postalCode, int age,
			String gender, maritalStatus m, education e) {
		this.name = name;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.postalCode = postalCode;
		this.age = age;
		this.gender = gender;
		this.m = m;
		this.e = e;
		numberOfConsumer++;

	}
	
	/**
	 * Copy Constructor
	 * @param c c is an object of type consumer. It will copy the same attributes of a consumer to another consumer.
	 */
	public Consumer(Consumer c) {
		this.name = c.name;
		this.streetNumber = c.streetNumber;
		this.streetName = c.streetName;
		this.city = c.city;
		this.postalCode = c.postalCode;
		this.age = c.age;
		this.gender = c.gender;
		this.m =c.m;
		this.e = c.e;
		numberOfConsumer++;
	}

	/**
	 * Getter method that access the consumer's name
	 * @return current name of the consumer
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * Setter methods that set the consumer's name
	 * @param name consumer's name to set in type string
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method that access the consumer's street number
	 * @return current street number of the consumer
	 */
	public int getStreetNumber() {
		return streetNumber;
	}

	/**
	 * Setter methods that set the consumer's street number
	 * @param streetNumber consumer's street number to set in type integer
	 */
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	/**
	 *  Getter method that access the consumer's street name
	 * @return current street name of the consumer
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Setter methods that set the consumer's street name
	 * @param streetName consumer's street name to set in type string
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Getter method that access the consumer's city
	 * @return current city of the consumer
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter methods that set the consumer's city
	 * @param city consumer's city to set in type string
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter method that access the consumer's postal code
	 * @return current postalCode of the consumer
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Setter methods that set the consumer's postal code
	 * @param postalCode consumer's postalCode to set in type string
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Getter method that access the consumer's age
	 * @return current age of the consumer
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Setter methods that set the consumer's age
	 * @param age consumer's age to set in type integer
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Getter method that access the consumer's gender
	 * @return current gender of the consumer
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Setter methods that set the consumer's gender
	 * @param gender consumer' gender to set in type integer
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Getter method that access the consumer's marital status
	 * @return current marital status of the consumer
	 */
	public maritalStatus getM() {
		return m;
	}

	/**
	 * Setter methods that set the consumer's marital status
	 * @param m consumer's marital status to set in type string
	 * Using the valueOf to convert string to the enum and also using the toUpperCase to make sure that it will work whether the user inputs it in caps or not
	 */
	public void setM(String m) {
		this.m = maritalStatus.valueOf(m.toUpperCase());
	}

	/**
	 * Getter method that access the consumer's education
	 * @return current education of the consumer
	 */
	public education getE() {
		return e;
	}

	/**
	 * Setter methods that set the consumer's education
	 * @param e consumer's education to set in type string
	 * Using the valueOf to convert string to the enum and also using the toUpperCase to make sure that it will work whether the user inputs it in caps or not
	 */
	 
	public void setE(String e) {
		this.e = education.valueOf(e.toUpperCase());
	}


	/**
	 * This method takes all the attributes needed for the information of a consumer and puts it into a string.
	 * @return a string with all the attributes necessary to create a consumer with his information.
	 */
	public String toString() {
		return "\nName: " + name + "\nLocation: " + streetNumber + " " + streetName + ", " + city + ", " + postalCode
				+ "\nAge: " + age + "\nGender : " + gender + "\nMarital Status: " + m + "\nEducation: " + e + "\n";
	}

	/**
	 * Static function to get the number of consumer created
	 * @return number of consumer created
	 
	 */
	public static int getNumberOfConsumer() {
		return numberOfConsumer;

	}

	/**
	 * function to compare two consumers for equality
	 * @param otherConsumer other consumer to compare too
	 * @return boolean identifying if they are equal
	 */
	public boolean equals(Consumer otherConsumer) {
		return this.age == otherConsumer.age && this.gender.equalsIgnoreCase(otherConsumer.gender)
				&& this.e == otherConsumer.e;
	}

	/**
	 * This method will make sure that the user enters a valid marital status
	 * 
	 */
	public void inputMaritalStatus() {
		String mStatus;
		do {
			System.out.print("\nWhat is consumer's marital status: ");
			mStatus = keyIn.next();
			if (!mStatus.equalsIgnoreCase("single") && !mStatus.equalsIgnoreCase("married")
					&& !mStatus.equalsIgnoreCase("widowed") && !mStatus.equalsIgnoreCase("separated")
					&& !mStatus.equalsIgnoreCase("divorced")) {
				System.out.println("Not a valid marital status. Please enter a valid one");
			}

		} while (!mStatus.equalsIgnoreCase("single") && !mStatus.equalsIgnoreCase("married")
				&& !mStatus.equalsIgnoreCase("widowed") && !mStatus.equalsIgnoreCase("separated")
				&& !mStatus.equalsIgnoreCase("divorced"));
		this.m = maritalStatus.valueOf(mStatus.toUpperCase());
	}

	/**
	 * This method will make sure that the user enters a valid education level
	 * 
	 */
	public void inputEducation() {
		String educationLevel;
		do {
			System.out.print("\nWhat is the highest level of education: ");
			educationLevel = keyIn.next();
			if (!educationLevel.equalsIgnoreCase("highschool") && !educationLevel.equalsIgnoreCase("cegep")
					&& !educationLevel.equalsIgnoreCase("university")) {
				System.out.println("Not a valid education. Please enter a valid one");
			}

		} while (!educationLevel.equalsIgnoreCase("highschool") && !educationLevel.equalsIgnoreCase("cegep")
				&& !educationLevel.equalsIgnoreCase("university"));
		this.e = education.valueOf(educationLevel.toUpperCase());
	}

	/**
	 * this static function will help us find all consumers that have the same age,gender and education
	 * @param c c is an object of type consumer
	 * @param age it will find the consumers age for the requested age
	 * @param gender it will find the consumer gender for the requested gender
	 * @param e it will find the consumers education level for the requested education level
	 */
	public static void findConsumersBy(Consumer c[], int age, String gender, String e) {
		for (int i = 0; i < numberOfConsumer; i++) {
			if (age == c[i].getAge() && gender.equalsIgnoreCase(c[i].getGender()) && education.valueOf(e) == c[i].getE()) {
				System.out.println("\nConsumer #" + (i + 1) + " has the given parameters:");
				System.out.println(c[i]);
			}
		}
	}
	
	/**
	 * this static function will help us find all consumers that have the same age and postal code
	 * @param c c is an object of type consumer
	 * @param age it will find the consumers age for the requested age
	 * @param postalCode it will find the consumers postal code for the requested postal code
	 */

	public static void findConsumersByAgeNPostalCode(Consumer c[], int age, String postalCode) {
		for (int i = 0; i < numberOfConsumer; i++) {
			if (age == c[i].getAge() && postalCode.equalsIgnoreCase(c[i].getPostalCode())) {
				System.out.println("\nConsumer #" + (i + 1) + " has the given parameters:");
				System.out.println(c[i]);
			}
		}
	}

}
