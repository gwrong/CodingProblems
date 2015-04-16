import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class Tests {

	@Test
	public void test() {
		assertEquals(true, Problems.hasUniqueCharacters("Unique"));
		assertEquals(true, Problems.hasUniqueCharacters("Rainbow"));
		assertEquals(false, Problems.hasUniqueCharacters("Multiple"));
		assertEquals(false, Problems.hasUniqueCharacters("Mississippi"));
	}

}
