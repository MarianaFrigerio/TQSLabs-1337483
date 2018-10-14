package mastermind;

public class InternalGame {

	/*Variables of the game*/
	
	//Constants of checkCode
	static final int TOTAL_HIT_BLACK = 2;
	static final int HIT_WHITE = 1;
	static final int FAIL = 0;
	
	//Constants of the colors of the game
	static final int BLUE = 1;
	static final int YELLOW = 2;
	static final int RED = 3;
	static final int GREEN = 4;
	static final int PURPLE = 5;
	static final int ORANGE = 6;
	
	//Private variables
	private String[] initialUserCode = new String [4];
	private String[] finalSecretCode = new String [4];
	private String[] formalizedCheckCode = new String[4];
	private int[] userCode = new int [4];
	private int[] secretCode = new int[4];
	private int[] checkCode = new int [4];
	private int tries;
	
	public int[] getUserCode() {
		return userCode;
	}
	
	public int[] setUserCode(String[] initialStringUserCode) { 
		return this.userCode;
	}
	
	public int[] getSecretCode() { //solo numeros
		return secretCode;
	}
	
	public void setSecretCode(int[] secretCode) { //llenar el vector/array con numeros random
		this.secretCode = secretCode;
	}
	
	public String[] convertSecretCode(int[] secretInt) { //de numeros random a palabras random
		return this.finalSecretCode;
	}
	
	public int[] getCheckCode() {
		return checkCode;
	}
	
	public void setCheckCode(int[] userCode, int[] secretCode) {
		int[] codeCheck = new int[4];
		this.checkCode = codeCheck;
	}
	
	public int getTries() {
		return tries;
	}
	
	public void setTries(int tries) {
		this.tries = tries;
	}
	
	public String[] getInitialUserCode() {
		return initialUserCode;
	}
	
	public String[] setInitialUserCode(String voidUserCode) {
		return initialUserCode;
	}

	public String[] getFormalizedCheckCode() {
		return formalizedCheckCode;
	}

	public void setFormalizedCheckCode(int[] initialCheckCode) {
		String[] formCheck = new String[4];
		this.formalizedCheckCode = formCheck;
	}
}