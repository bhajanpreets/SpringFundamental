import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bhajan.repository.EmployeeRepositoryStub;
import com.bhajan.repository.EmployeeRepositoryStubImpl;
import com.bhajan.service.EmployeeService;
import com.bhajan.service.EmployeeServiceImpl;

@Configuration
public class AppContext {
	
	@Bean(name="employeeService")
	public EmployeeService getEmployeeService(){
		return new EmployeeServiceImpl(getEmployeeRepositoryStub());
	}
	
	@Bean(name="employeeRepositoryStub")
	EmployeeRepositoryStub getEmployeeRepositoryStub(){
		return new EmployeeRepositoryStubImpl();
	}

}
