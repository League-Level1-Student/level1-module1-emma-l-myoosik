package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("Niffler");
		
		/* makes the cat meow*/
		cat.meow();
		
		/* prints the cat's name*/
		cat.printName();
		
		/* kills the cat */
		int lives = 9;
		while (lives > 0) {
			cat.kill();
			lives--;
		}
	}
}
