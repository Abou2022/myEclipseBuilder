package springLearnOne.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewCoachApp {

	public static void main(String[] args) {
	
		//load the Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopeNewCoach-applicationContext.xml");

		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they have the same bean
		boolean result = (theCoach == alphaCoach);
		
		//print out the result
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: Volley Ball Coach  " + theCoach);
		
		System.out.println("\nMemory location for theCoach: " + alphaCoach + "\n");
		
		//close the context
		
		context.close();
	}

}
