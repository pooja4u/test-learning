package springh2db.learning1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springh2db.learning1.dao.Dao;
import springh2db.learning1.pojo.EmpTable;

@Service
public class Ser_Implement implements EmpService{
@Autowired Dao d;
	public EmpTable logic(int id, int rate, long sal) {
		long updtSal = 0;
		if(rate < 4) {
			updtSal=sal+200;
		}
		else if(rate >= 4) {
			updtSal=sal+100;
		}
		 EmpTable sts=d.statusShow(updtSal,id);
		 return sts;
	}
	@Override
	public Optional<EmpTable> display(int id) {
		Optional<EmpTable> res=d.resultShow(id);
		
		return res;
	}
}
