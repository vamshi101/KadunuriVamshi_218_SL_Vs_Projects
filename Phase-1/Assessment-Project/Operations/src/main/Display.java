package main;

public class Display {

	public static void printWelcomeScreen(String appName, String developerName) {
		String Introduction = String.format("\n"
				+ " %s \n" + " %s\n"
				+ "\n", appName, developerName);
	
		System.out.println(Introduction);
	}

	public static void displayMenu() {
		String menu = "\n Please select from the below option\n"
				+ "1) Display all the files \"Folder\" \n" + "2) Operations a user specified file to the application\n"
				+ "3) Quit\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n Please select from the below option \n"
				+ "1) Add a file to \"Folder\" \n" + "2) Delete a file from \"Folder\" folder\n"
				+ "3) Search for a file from \"folder\" \n" + "4) Go back to the main menue\n" + "5) Quit \n";

		System.out.println(fileMenu);
	}

}