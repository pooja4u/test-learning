package springh2db.learning1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import springh2db.learning1.pojo.EmpTable;
import springh2db.learning1.pojo.EmployeeType;
import springh2db.learning1.service.EmpService;

@RestController
public class Controller{
	 
	@Autowired EmpService ser;
	@GetMapping(value="/a1/{id}/{rate}/{sal}")
	public EmpTable call(@PathVariable int id, @PathVariable int rate, @PathVariable long sal){
		EmpTable res=null;
		EmployeeType data =new EmployeeType();
		
		if(id>5) {
			 res=ser.logic(id,rate,sal);
		}
		else {
			System.out.println("id is less than 5");
		}
		
		return res;	
	}
	
	
	@GetMapping(value="/a2/{id}")
	public Optional<EmpTable> displayCall(@PathVariable int id){
		Optional<EmpTable> res=ser.display(id);
		System.out.println("successfull ");
		
		return res;
	
	}

}
