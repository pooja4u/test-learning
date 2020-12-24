package springh2db.learning1.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpTable {
	@Id
	int id;
	long sal;
	String status;
	long updtSal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getUpdtSal(){
		return updtSal;
	}
	public void setUpdtSal(long updtSal){
		this.updtSal = updtSal;
	}
	@Override
	public String toString() {
		return "EmpTable [id=" + id + ", sal=" + sal + ", status=" + status + ", updtSal=" + updtSal + "]";
	}
	
	

}
