package springLearnOne.springDemo;

public class CricketCoach implements Coach {
	
	//Define a private field for the dependency 
	private FortuneService fortuneService;
	
	//Create a no-arg constructor
	
	public CricketCoach() {
		System.out.println("Cricket: inside no-arg constructor");
	}
	
	
//automoatic add set method by right click source getter and setter
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "Practice fasr bowling for 15 minutes";
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
