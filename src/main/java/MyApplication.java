import com.bhajan.service.EmployeeService;
import com.bhajan.service.EmployeeServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
