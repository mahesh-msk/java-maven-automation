package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathTest {
	
	Math mat = new Math();
	
	@Test
	public void testAdd() {
		assertEquals(mat.add(2,2), 4);
	}
	
	@Test
	public void testSub() {
		assertEquals(mat.sub(4,2), 2);
	}


}
