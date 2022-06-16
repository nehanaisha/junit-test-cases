package testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
class UsernameTest {
	

	Username test = new Username();
	@Test
	public void testname() {
		assertEquals(true, test.validUsername("Nehacc"));
	}

}
