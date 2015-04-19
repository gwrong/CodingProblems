import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class Tests {

	@Test
	public void hasUniqueCharacters() {
		assertEquals(true, Problems.hasUniqueCharacters("Unique"));
		assertEquals(true, Problems.hasUniqueCharacters("Rainbow"));
		assertEquals(false, Problems.hasUniqueCharacters("Multiple"));
		assertEquals(false, Problems.hasUniqueCharacters("Mississippi"));
	}
	
	@Test
	public void removeDuplicateCharacters(){
		assertEquals("Misp", Problems.removeDuplicateCharacters("Mississippi"));
		assertEquals("Teribl", Problems.removeDuplicateCharacters("Terrible"));
		assertEquals("Katn", Problems.removeDuplicateCharacters("Katana"));
		assertEquals("TeRroiz", Problems.removeDuplicateCharacters("TeRrorize"));
		assertEquals("pel", Problems.removeDuplicateCharacters("peel"));
		assertEquals("", Problems.removeDuplicateCharacters(""));
		assertEquals(null, Problems.removeDuplicateCharacters(null));
	}
	
	@Test
	public void areAnagrams(){
		assertEquals(true, Problems.areAnagrams("dozen", "zoned"));
		assertEquals(true, Problems.areAnagrams("drier", "rider"));
		assertEquals(false, Problems.areAnagrams("pearl", "oyster"));
		assertEquals(true, Problems.areAnagrams("wreathes", "weathers"));

	}
	
	@Test
	public void setMatrixTo0() {
		int[][] test = { {1,2}, {1,2}, {1,2}, {0,1} };
		Problems.setMatrixTo0(test);
		int[][] expected = { {0,2}, {0,2}, {0,2}, {0,0} };
		assertEquals(matrixToString(expected), matrixToString(test));
		
		int[][] test2 = { {1,2,5,6}, {1,2,0,6}, {1,2,5,6}, {0,1,5,6} };
		Problems.setMatrixTo0(test2);
		int[][] expected2 = { {0,2,0,6}, {0,0,0,0}, {0,2,0,6}, {0,0,0,0} };
		assertEquals(matrixToString(expected2), matrixToString(test2));
	}
	
	public String matrixToString(int[][] matrix) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				builder.append(matrix[i][j]);
			}
			builder.append('\n');
		}
		return builder.toString();
	}
}
