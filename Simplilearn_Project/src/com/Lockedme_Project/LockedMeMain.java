package com.Lockedme_Project;

public class LockedMeMain {

	public static void main(String[] args) {
		FileOperations fileOperations = new FileOperations();
		fileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe_Application", "Mohammed Arshat");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
