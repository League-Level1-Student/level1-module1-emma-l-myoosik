package _06_duck;

public class Niffler {
	int numOfShiniesStolen;
	int numTimesHaveEscaped;
	
	void runningAway() {
		System.out.println("Running away from Newt!");
	}
	
	void stealingShinies() {
		System.out.println("Must. Steal. Shinies.");
	}
	
	Niffler(int numOfShiniesStolen, int numTimesHaveEscaped) {
		this.numOfShiniesStolen = numOfShiniesStolen;
		this.numTimesHaveEscaped = numTimesHaveEscaped;
	}
}
