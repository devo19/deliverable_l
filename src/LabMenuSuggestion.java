import java.util.Scanner;

public class LabMenuSuggestion {

	public static void main(String str[]) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter EventType");

		String eventType = myObj.nextLine(); // Read user input
		System.out.println("Accepted EventType --> " + eventType); // Output user input
																	
																	

		System.out.println(" ==== ");

		Scanner myObj1 = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter PartySize");

		String partySize = myObj1.nextLine(); // Read user input
		System.out.println("Accepted PartySize --> " + partySize); // Output user input
																	

		System.out.println();

		int intPartSize = Integer.valueOf(partySize);

		String mealSuggestion = new String();
		String preparationSuggestion = new String();

		if (eventType.equalsIgnoreCase("casual")) {
			mealSuggestion = "sandwiches";
		} else if (eventType.equalsIgnoreCase("semi-formal")) {
			mealSuggestion = "fried chicken";
		} else if (eventType.equalsIgnoreCase("formal")) {
			mealSuggestion = "chicken parmesan";
		}

		if (intPartSize == 1) {
			preparationSuggestion = "in the microwave.";
		} else if (intPartSize >= 2 && intPartSize < 13) {
			preparationSuggestion = "in your kitchen.";
		} else {
			preparationSuggestion = "by a caterer.";
		}

		String result = "Since you’re hosting a " + eventType + " event for "
				+ partySize + " participants, you should serve "
				+ mealSuggestion + " prepared " + preparationSuggestion;

		System.out.println(result);
	}
}