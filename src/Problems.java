import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

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
	
	/*
	 * Remove duplicates from String
	 */
	public static String removeDuplicateCharacters(String string) {
		
		if (string == null) return null;
		if (string.length() < 2) return string;
		
		char[] array = string.toCharArray();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			char current = array[i];
			for (int j = i + 1; j < length; j++) {
				char innerCurrent = array[j];
				if (current == innerCurrent) {
					length--;
					for (int k = j; k < length; k++) {
						array[k] = array[k + 1];
					}
					array[length] = 0;
					j--;
				}
			}
		}
		char[] result = Arrays.copyOfRange(array, 0, length);
		return new String(result);
	}
	
	/*
	 * Determine if they are anagrams of each other
	 */
	public static boolean areAnagrams(String a, String b) {
		char[] charsA = a.toCharArray();
		char[] charsB = b.toCharArray();
		Arrays.sort(charsA);
		Arrays.sort(charsB);
		return Arrays.toString(charsA).equals(Arrays.toString(charsB));
	}
	
	/*
	 * Sets 2d array row and column to 0 if 0 is found
	 */
	public static void setMatrixTo0(int[][] matrix) {
		
		//Keep temp 2d array so that you can keep track
		//of where the original 0s are and not the new 0s
		int[][] bufferMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					bufferMatrix[i][j] = 1;
				}
			}
		}
		
		//i is row #, j is column #
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (bufferMatrix[i][j] == 1) {
					//Do row
					for (int k = 0; k < matrix[0].length; k++) {
						matrix[i][k] = 0;
					}
					//do column
					for (int k = 0; k < matrix.length; k++) {
						matrix[k][j] = 0;
					}
				}
			}
		}
	}
}
