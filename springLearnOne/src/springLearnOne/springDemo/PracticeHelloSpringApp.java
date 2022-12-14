package springLearnOne.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		
				//load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
				//retrieve bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				
				//call our new methods to get the literal value
				System.out.println(theCoach.getDailyWorkout());
				
				System.out.println(theCoach.getDailyFortune());
				
				System.out.println(theCoach.getDailyFortune());
				//close the context
				context.close();

	}

}
