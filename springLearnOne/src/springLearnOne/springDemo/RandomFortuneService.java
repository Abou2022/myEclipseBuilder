package springLearnOne.springDemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	//create array
	private String [] data = {
		"Today is my lucky day",
		"Try to see if you will win",
		"I am a lucky man"
	};
	
	//create a random number 
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
