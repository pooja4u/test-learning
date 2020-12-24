package springh2db.learning1.service;

import java.util.List;
import java.util.Optional;

import springh2db.learning1.pojo.EmpTable;
import springh2db.learning1.pojo.EmployeeType;

public interface EmpService {

	public EmpTable logic(int id, int rate, long sal);
	public Optional<EmpTable> display(int id);
	EmpTable logic(List<EmployeeType> empList);

	
}
