import java.util.*;

public class ceasarcipher {
public static void main(String[] args) 
{
	Scanner console = new Scanner(System.in);
	System.out.print("Your secret message: ");
	String message = console.nextLine();
	message = message.toLowerCase();
	System.out.print("Your secret key: ");
	int key = console.nextInt();
	encode(message, key);
}

public static void encode(String text, int shift)
	 {
		System.out.print("The encoded message: ");
		for (int i = 0; i < text.length(); i++) {
		char letter = text.charAt(i);
		// shift only letters (leave other characters alone)
		if (letter >= 'a' && letter <= 'z') {
		letter = (char) (letter + shift);
		// may need to wrap around
		if (letter > 'z') {
		letter = (char) (letter - 26);
		} else if (letter < 'a') {
		letter = (char) (letter + 26);
		}
		}
		System.out.print(letter);
		}
		System.out.println();
	}
}