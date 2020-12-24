package springh2db.learning1.dao;

import java.util.Optional;

import springh2db.learning1.pojo.EmpTable;

public interface Dao {
	public EmpTable statusShow(long sal,int id);
	public Optional<EmpTable> resultShow(int id);
	

}
