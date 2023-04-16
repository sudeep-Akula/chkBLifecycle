package chkBLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.*;

public class Motor  {

	public Motor() {
		System.out.println("motor constructor");
	}
	// @xml approach      
//	public void start() {
//		System.out.println("motor started");
//	}
	public void doWork() {
		System.out.println("motor pulling the water");
	}
	// @xml approach
//	public void destroy() {
//		System.out.println("motor stopped");
//	}
	//@ programming approach   implements InitializingBean,DisposableBean 
//@Override
//public void destroy() throws Exception {
//	// TODO Auto-generated method stub
//	System.out.println("motor stopped");
//}
//@Override
//public void afterPropertiesSet() throws Exception {
//	// TODO Auto-generated method stub
//	System.out.println("motor started");
//}
	
//	@PostConstruct
//	public void start() {}
//	@PreDestroy
//	public void destroy() {}
}
