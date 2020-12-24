package springh2db.learning1.pojo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RepoInterface extends CrudRepository<EmpTable, Integer> {
	
}
