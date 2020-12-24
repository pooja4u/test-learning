package springh2db.learning1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springh2db.learning1.pojo.EmployeeType;

@RestController
public class ControllerOfList {
	@PostMapping(value="/a1")
	public void sendData(@RequestBody List<EmployeeType> empList){
		 
		
		  
	}

}
