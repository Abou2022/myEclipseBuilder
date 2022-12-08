package springLearnOne.springDemo;

public class VolleyBallCoach implements Coach {

	
	//Define a private field for the dependency 
	private FortuneService fortuneService;
	
	
	
	public VolleyBallCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 4 times a day to become professional";
	}

	@Override
	public String getDailyFortune() {
		
		return "I trust you!!! " + fortuneService.getFortune();
	}

}
