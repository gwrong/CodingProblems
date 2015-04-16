import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/*
 * Class for solving coding challenge problems
 */
public class Problems {

	public static void printASCIIChars() {
		PrintStream printer = null;
		try {
			printer = new PrintStream(System.out, true, "ASCII");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		for (int i = 33; i < 128; i++){
			if ((i - 32) % 50 == 0){
				printer.println((char) i);
			} else {
				printer.print((char) i + " ");
			}
			
		}
	}
	
	public static void printUnicodeCharacters() {
		PrintStream printer = null;
		try {
			printer = new PrintStream(System.out, true, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 100000; i++){
			if (i % 50 == 0){
				printer.println((char) i);
			} else {
				printer.print((char) i + " ");
			}
		}
	}
	
	/*
	 * Determine if a string has unique characters
	 */
	public static boolean hasUniqueCharacters(String string) {
		boolean[] array = new boolean[128];
		char[] chars = string.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (array[chars[i]]) {
				return false;
			} else {
				array[chars[i]] = true;
			}
		}
		return true;
	}
}
