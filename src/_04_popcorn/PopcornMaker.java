package _04_popcorn;

import java.util.Scanner;

public class PopcornMaker {
	static String flavor;
	public static void main(String[] args) {
		Microwave microwave = new Microwave();
		
		Scanner forFlavor = new Scanner(System.in);
		System.out.print("Flavor for popcorn: ");
		String s = forFlavor.next();
		forFlavor.close();
		Popcorn popcorn = new Popcorn(s);
		
		microwave.putInMicrowave(popcorn);
		
		// Scanner setTimer = new Scanner(System.in);
		// System.out.print("Set time: ");	
		//String i = setTimer.next();
		// int time = Integer.parseInt(i);
		// setTimer.close();
		// microwave.setTime(time);
		microwave.startMicrowave();
		
		popcorn.applyHeat();
		popcorn.eat();
		
	}
}
