package main;

public class Main {

	public static void main(String[] args) {
		
		FileOperations.createMainFolderIfNotPresent("Folder");
		
		Display.printWelcomeScreen("Welcome to The Program", "Hai,I'm Vamshi");
		
		Menu.handleWelcomeScreenInput();
	}

}
