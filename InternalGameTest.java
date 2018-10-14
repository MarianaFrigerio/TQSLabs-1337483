package mastermind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InternalGameTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetAndSetUserCode() {
		InternalGame intern1 = new InternalGame ();
		String[] initialStringUserCode = {"red", "blue"};
		intern1.setUserCode(initialStringUserCode);
		
		
		
		assertEquals(intern1.getUserCode().length, 4);
		assertEquals(intern1.getUserCode()[0], 3);
		assertEquals(intern1.getUserCode()[1], 1);
		assertEquals(intern1.getUserCode()[2], 0);
		assertEquals(intern1.getUserCode()[3], 0);
	}

	@Test
	void testGetAndSetSecretCode() {
		InternalGame intern2 = new InternalGame ();
		int[] secr1 = {0, 0, 0, 0};
		intern2.setSecretCode(secr1);
		assertEquals(intern2.getSecretCode().length, 4);
	}

	@Test
	void testConvertSecretCode() {
		InternalGame intern3 = new InternalGame ();
		int[] secr1 = {1, 2, 3, 4};
		assertTrue(intern3.convertSecretCode(secr1)[0] == "blue" && intern3.convertSecretCode(secr1)[1] == "yellow" &&
				   intern3.convertSecretCode(secr1)[2] == "red" && intern3.convertSecretCode(secr1)[3] == "green");
	}

	@Test
	void testGetAndSetCheckCode() {
		InternalGame intern4 = new InternalGame ();
		int[] secr1 = {1,2,3,4};
		int[] usr1 = {1,2,3,4};
		intern4.setCheckCode(usr1, secr1);
		int[] check1 = {2,2,2,2};
		assertArrayEquals(intern4.getCheckCode(), check1);
	}

	@Test
	void testGetAndSetTries() {
		InternalGame intern5 = new InternalGame ();
		
		intern5.setTries(1);
		assertTrue(intern5.getTries() == 1);	
		
		intern5.setTries(-1);
		assertTrue(intern5.getTries() == 0);		
		
	}

	@Test
	void testGetAndSetInitialUserCode() {
		InternalGame intern6 = new InternalGame ();
		String initUsCode = "blue red";
		String[] initStrUsCode = {"blue", "red"};
		intern6.setInitialUserCode(initUsCode);
		assertArrayEquals(intern6.getInitialUserCode(), initStrUsCode);
	}

	@Test
	void testGetAndSetFormalizedCheckCode() {
		InternalGame intern7 = new InternalGame ();
		int[] secr1 = {1,2,3,4};
		int[] usr1 = {1,2,3,4};
		intern7.setCheckCode(usr1, secr1);		
		
		intern7.setFormalizedCheckCode(intern7.getCheckCode());
		String[] formCheck1 = {"black", "black", "black", "black"};
		assertArrayEquals(intern7.getFormalizedCheckCode(), formCheck1);
	}
}
