package springLearnOne.springDemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		//this is a hardcode
		Coach theCoach = new TrackCoach();
		
		//Need to use spring to make configurable code 
		
		//use the object
		System.out.println(theCoach.getDailyWorkout()); 
	}

}
