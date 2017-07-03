//Isaiah Kowalski, this work is mine.
import java.util.*;
public class PigLatinConverter {
	public static void main(String[] args) {
		//Enter text in the quotes of System.out.println(covertToLatin(" "));
		//Type in all caps
		//Avoid using punctuation
		//For comparison also enter text into the first System.out.println(" ");
		System.out.println("ENTER YOUR TEXT HERE");
		System.out.println(covertToLatin("ENTER YOUR TEXT HERE"));
	}
	
	private static String covertToLatin(String string) {
		StringBuilder end = new StringBuilder();
	    String[] words = string.split("\\s+");
	    for (int i = 0; i < words.length; i++) {
	        if (isVowel(words[i].charAt(0))) {
	            end.append(words[i]).append("AY ");
	        } else {
	            end.append(words[i].substring(1))
	                    .append(words[i].substring(0, 1)).append("AY ");
	        }
	    }
	    return end.toString();
	}

	
	private static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
	    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

}