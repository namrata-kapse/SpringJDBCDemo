import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.technoficent.springjdbc.beans.Employee;
import com.technoficent.springjdbc.config.AbstractnfrastructureConfiguration;
import com.technoficent.springjdbc.dao.interfaces.EmployeeDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AbstractnfrastructureConfiguration.class)
public class EmployeeDAOTest {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Test
	public void testInsert() {
		Employee employee = new Employee();
		employee.setEmpID(1001);
		employee.setEmpName("Steve");
		employee.setEmpDept("DevOps");
		employeeDAO.deleteEmployee(employee.getEmpID());
		employeeDAO.insert(employee);
	}
	
	@Test
	public void testFindById() {
		Integer empID = 1001;
		System.out.println(employeeDAO.findById(empID));
	}
	
	@Test
	public void testFindAll() {
		List<Employee> employees = employeeDAO.findAll();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
