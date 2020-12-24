package springh2db.learning1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import springh2db.learning1.pojo.EmpTable;
import springh2db.learning1.pojo.EmployeeType;

@Service
public class EmpListService implements EmpService {
	long updtSal;

	@Override
	public EmpTable logic(List<EmployeeType> empList) {
		List<EmployeeType> emList=new ArrayList();
		for (EmployeeType e : empList) {
			EmployeeType em=new EmployeeType();
			long sal = e.getSal();
			int rate = e.getRate();
			if (e.getRate() < 3) {
				updtSal = sal + sal * 30 / 100;
			} else {
				updtSal = sal + sal * 10 / 100;
			}
		}
		return null;
	}

	@Override
	public Optional<EmpTable> display(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpTable logic(int id, int rate, long sal) {
		return null;
	}

}
