package springh2db.learning1.pojo;

public class EmployeeType {
	int id;
	int rate;
	long sal;
	
	long updatedSal;
	long hike;
	
	String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

	public long getUpdatedSal() {
		return updatedSal;
	}

	public void setUpdatedSal(long updatedSal) {
		this.updatedSal = updatedSal;
	}

	public long getHike() {
		return hike;
	}

	public void setHike(long hike) {
		this.hike = hike;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EmployeeType [id=" + id + ", rate=" + rate + ", sal=" + sal + ", updatedSal=" + updatedSal + ", hike="
				+ hike + ", status=" + status + "]";
	}
	
	
	
	
	

}
