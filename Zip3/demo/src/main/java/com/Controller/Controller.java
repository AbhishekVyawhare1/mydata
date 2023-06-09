package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Repository.Repository;
import com.entities.Employee;

@RestController
public class Controller {

	@Autowired
	public Repository repos;

	@PostMapping("/emp")
	public String InsertEmployee(@RequestBody Employee emp) {
		repos.save(emp);
		return "Employee record SuccessFuly";
	}

//	@GetMapping("/Hello")
//	public List<Employee> getEmployee() {
//
//		return repos.findAll();
//
//	}
//
//	@GetMapping("/Hello/{id}")
//	public Object getEmployee(@PathVariable int id) {
//		return repos.findById(id);
//	}
//
//	@PutMapping("/Hello/id")
//	public String update_Employee(@RequestBody Employee emp, @PathVariable int id) {
//
//		repos.save(emp);
//		return "Employee Record updated succesfully";
//
//	}
//
//	@DeleteMapping("/Hello/id")
//	public String DeleteEmployee(@PathVariable int id) {
//		repos.deleteById(id);
//		return "Deleted record SuccessFully";
//	}
}
