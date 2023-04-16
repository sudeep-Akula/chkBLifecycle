package chkBLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");

		Motor mt = context.getBean(Motor.class);
		
		mt.doWork();
		ConfigurableApplicationContext configcontext  = (ConfigurableApplicationContext)context;
		configcontext.close();
//		configcontext.registerShutdownHook();
	}

}
