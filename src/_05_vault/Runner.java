package _05_vault;

public class Runner {
	public static void main(String[] args) {
		Vault v = new Vault(3456);
		System.out.println(v.secretCode);
		
		Bond Bond = new Bond();
		int codeToTry = Bond.findCode(v.secretCode);
		boolean answer = v.tryCode(codeToTry);
		
		if (answer == true) System.out.println("Do work");
		else System.out.println("Don't work");
	}
}
