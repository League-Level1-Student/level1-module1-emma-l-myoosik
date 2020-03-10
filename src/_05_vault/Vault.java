package _05_vault;

public class Vault {
	int secretCode;
	
	Vault(int secretCode){
		this.secretCode = secretCode;
	}
	
	boolean tryCode(int codeToTry) {
		if (codeToTry == secretCode) {
			return true;
		}
		else {
			return false;
		}
	}
}
