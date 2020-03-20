package _05_vault;

public class Bond {
	int findCode(int secretCode) {
		for (int i = 0; i < 1000001; i++) {
			if (i == secretCode) {
				return i;
			}
		}
		return -1;
	}
}
