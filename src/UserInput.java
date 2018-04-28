import java.util.Scanner;

public class UserInput {
	private String username = "";
	private int zip = 0;

	public String setUsername() {
		System.out.println("Your username:");
		Scanner scan = new Scanner(System.in);

		username = scan.nextLine();
		return username;
	}

	public int setZip() {
		try {
			while (true) {
				System.out.println("Please enter your zip code");
				Scanner scan = new Scanner(System.in);
				zip = scan.nextInt();
				if (zip >= 55101 && zip <= 55488) {
					return zip;
				} else {
					System.out.println("Sorry, we only deliever Minneapolis & St. Paul area.");
				}
			}
		} catch (Exception e) {
			System.out.println("Please enter a number.");
			return setZip();
		}

	}
}
