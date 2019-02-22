import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MostUsedWord2 {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		Scanner scan = new Scanner(new File("book.txt"));
		HashMap<String, Integer> book = new HashMap<>();
		String currentWord = "", mostUsed = "";
		Integer currentCount = 0, frequency = 0;

		while (scan.hasNext()) {

			currentWord = scan.next().toLowerCase();

			if (book.containsKey(currentWord)) {
				currentCount = book.get(currentWord);
				currentCount++;
				book.put(currentWord, currentCount);
			} else {
				// First occurence of the current word
				book.put(currentWord, 1);
			}
			
			if (currentCount > frequency) {
				mostUsed = currentWord;
				frequency = currentCount;
			}
			
		}

		System.out.println("The most frequently used word is \"" + mostUsed + "\"");

	}
	
}
