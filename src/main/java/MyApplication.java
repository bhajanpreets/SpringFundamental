import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhajan.service.EmployeeService;

public class MyApplication {

	public static void main(String[] args) {
		//EmployeeService service = new EmployeeServiceImpl();
		
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppContext.class);
		EmployeeService service = applicationContext.getBean("employeeService", EmployeeService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
