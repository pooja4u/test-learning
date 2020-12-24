package springh2db.learning1.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springh2db.learning1.pojo.EmpTable;
import springh2db.learning1.pojo.RepoInterface;

@Service
public class DaoImpl implements Dao{
	
@Autowired
RepoInterface repo;
	public EmpTable statusShow(long updSal,int id) {
		String status;
		if(updSal > 500) {
			status="good";
		}
		else {
			status= "need some improvement";
		}
		EmpTable empTbl=new EmpTable();
		empTbl.setId(id);
		empTbl.setUpdtSal(updSal);
		empTbl.setStatus(status);
		EmpTable empTb2 = repo.save(empTbl);
		return empTb2;
	}
	@Override
	public Optional<EmpTable> resultShow(int id) {
		 Optional<EmpTable> tableReslt=repo.findById(id);
		//Iterable<EmpTable> tableReslt=repo.findAll(); // 
		return tableReslt;
	}
} 
