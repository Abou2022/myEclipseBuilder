package springLearnOne.springDemo;

public class CricketCoach implements Coach {
	
	//Define a private field for the dependency 
	private FortuneService fortuneService;
	
	
	//add new field for emailAddress and team
	private String emailAddress;
	private String team;
	
	
	//Create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket: inside no-arg constructor");
	}
	
	
public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket: inside setter method - setTeam");
		this.team = team;
	}


	//Automatic add set method by right click source getter and setter
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
