package springLearnOne.springDemo;

public class TrackCoach implements Coach {
	
	//Define a private field for the dependency 
		private FortuneService fortuneService;
		
		

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return " Just Do it "+ fortuneService.getFortune();
	}

}
