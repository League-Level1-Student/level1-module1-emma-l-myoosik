package _03_harry_potter;

public class HarryRunner {
	public static void main(String[] args) {
		
		/* creates Harry Potter */
		HarryPotter harry = new HarryPotter();
		
		/* makes him invisible */
		harry.makeInvisible(true);
		
		/* spies on Professor Snape */
		harry.spyOnSnape();
		
		/* makes him visible */
		harry.makeInvisible(false);
		
		/* cast a Stupefy spell */
		harry.castSpell("Stupify");
	}
}
