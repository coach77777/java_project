import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
	// Array list for the monkey
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

	public static void main(String[] args) {

		//initializing the Lists for Dog and Monkey
		initializeDogList();
		initializeMonkeyList();


		String quit = "n";
		while (!quit.equalsIgnoreCase("q")) {
			displayMenu();
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("1")) {
				intakeNewDog(scanner);
			} else if (input.equalsIgnoreCase("2")) {
				intakeNewMonkey(scanner);
			} else if (input.equalsIgnoreCase("3")) {
				reserveAnimal(scanner);
			} else if (input.equalsIgnoreCase("4")) {
				printAnimals("dog");
			} else if (input.equalsIgnoreCase("5")) {
				printAnimals("monkey");
			} else if (input.equalsIgnoreCase("6")) {
				printAnimals("available");
			} else if (input.equalsIgnoreCase("q")) {
				quit = input;
			} else {
				System.out.println("Invalid Selection! Enter a valid selection!");
			}

		}
	}

	public static void displayMenu() {
		System.out.println("\n\n");
		System.out.println("\t\t\t\tRescue Animal System Menu");
		System.out.println("[1] Intake a new dog");
		System.out.println("[2] Intake a new monkey");
		System.out.println("[3] Reserve an animal");
		System.out.println("[4] Print a list of all dogs");
		System.out.println("[5] Print a list of all monkeys");
		System.out.println("[6] Print a list of all animals that are not reserved");
		System.out.println("[q] Quit application");
		System.out.println();
		System.out.println("Enter a menu selection");
	}

	public static void initializeDogList() {
		Dog dog1 = new Dog("Rintintin", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
		Dog dog2 = new Dog("Bigun", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", true, "United States");
		Dog dog3 = new Dog("queeny", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
		dog1.setAnimalType("Dog");
        dog2.setAnimalType("Dog");
        dog3.setAnimalType("Dog");
	}

	public static void initializeMonkeyList() {
		Monkey monkeyOne = new Monkey("CuriousGeorge", "Red Tailed", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
		Monkey monkeyTwo = new Monkey("Mike", "Capuchin", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", true, "United States");
		Monkey monkeyThree = new Monkey("Princess", "Rhesus", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

		monkeyList.add(monkeyOne);
		monkeyList.add(monkeyTwo);
		monkeyList.add(monkeyThree);
		
		monkeyOne.setAnimalType("Monkey");
		monkeyTwo.setAnimalType("Monkey");
		monkeyThree.setAnimalType("Monkey");
	}

	public static void intakeNewDog(Scanner scanner) {
		System.out.println("What is the dog's name?");
		String name = scanner.nextLine();

		for (Dog dog : dogList) {
			if (dog.getName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis dog is already in our system\n\n");
				return; //returns to menu
			}
		}
		System.out.println("What is the dog's type?");
		String breed = scanner.nextLine();
		System.out.println("What is the dog's gender?");
		String gender = scanner.nextLine();
		System.out.println("What is the dog's age?");
		String age = scanner.nextLine();
		System.out.println("What is the dog's weight?");
		String weight = scanner.nextLine();
		System.out.println("What is the dog's acquisition date?");
		String acquisitionDate = scanner.nextLine();
		System.out.println("What is the dog's acquisition country?");
		String acquisitionCountry = scanner.nextLine();
		System.out.println("What is the dog's training status?");
		String trainingStatus = scanner.nextLine();
		System.out.println("Is the dog's reserved?");
		boolean reserved = scanner.nextBoolean();
		System.out.println("What is the dog's in service country?");
		String inServiceCountry = scanner.nextLine();

		Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
		dogList.add(dog);
		System.out.println("Dog Intake Complete");

	}

	public static void intakeNewMonkey(Scanner scanner) {
		System.out.println("What is the monkey's name?");
		String name = scanner.nextLine();

		for (Monkey monkey : monkeyList) {
			if (monkey.getName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis monkey is already in our system\n\n");
				return; //returns to menu
			}
		}

		System.out.println("What is the monkey's type?");
		String species = scanner.nextLine();
		System.out.println("What is the monkey's gender?");
		String gender = scanner.nextLine();
		System.out.println("What is the monkey's age?");
		String age = scanner.nextLine();
		System.out.println("What is the monkey's weight?");
		String weight = scanner.nextLine();
		System.out.println("What is the monkey's acquisition date?");
		String acquisitionDate = scanner.nextLine();
		System.out.println("What is the monkey'sacquisition country?");
		String acquisitionCountry = scanner.nextLine();
		System.out.println("What is the monkey's training status?");
		String trainingStatus = scanner.nextLine();
		System.out.println("Is the monkey's reserved?");
		boolean reserved = scanner.nextBoolean();
		System.out.println("What is the monkey's in service country?");
		String inServiceCountry = scanner.nextLine();
		
		Monkey monkey = new Monkey(name, species, gender, 
				age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
		monkeyList.add(monkey);
		System.out.println("Monkey Intake Complete");
	}

	public static void reserveAnimal(Scanner scanner) {
		System.out.println("Enter Animal Type: ");
		String animalType = scanner.nextLine();
		System.out.println("Enter Country: ");
		String country = scanner.nextLine();
		for (Dog dog : dogList) {
			if (dog.getAnimalType().equalsIgnoreCase(animalType) && dog.getInServiceLocation().equalsIgnoreCase(country)) {
				dog.setReserved(true);
				return;
			}
		}
		for (Monkey monkey : monkeyList) {
			if (monkey.getAnimalType().equalsIgnoreCase(animalType) && monkey.getInServiceLocation().equalsIgnoreCase(country)) {
				monkey.setReserved(true);
				return;
			}
		}
		System.out.println("No Animals Found of Type : " + animalType + " and Location: " + country);

	}

	public static void printAnimals(String type) {
		if (type.equalsIgnoreCase("dog")) {
			System.out.println("List of Dogs");
			for (Dog dog : dogList)
				System.out.println(dog.toString());
		}
		if (type.equalsIgnoreCase("monkey")) {
			System.out.println("List of Monkeys");
			for (Monkey monkey : monkeyList)
				System.out.println(monkey.toString());
		}
		if (type.equalsIgnoreCase("available")) {
			System.out.println("List of dogs available and in service");
			for (Dog dog : dogList) {
				if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
					System.out.println(dog.toString());
				}
			}
			System.out.println("List of monkeys available and in service");
			for (
					Monkey monkey : monkeyList) {
				if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
					System.out.println(monkey.toString());
				}
			}
		}
	}
}
