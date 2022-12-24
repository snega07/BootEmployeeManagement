package com.webapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.dao.EmpDao;
import com.webapp.demo.emp.Emp;

@RestController
public class EmpController {

	@Autowired
	EmpDao dao;
@RequestMapping("/addEmp")
@ResponseBody
public void addEmp(@RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam String dept, Emp obj) {
	
	obj.setEmpId(id);
	obj.setEmpName(name);
	obj.setEmpEmail(email);
	obj.setDept(dept);
	dao.save(obj);
	System.out.println("emp added");
	
}

@RequestMapping("/delete")
@ResponseBody
public void deleteEmp(@RequestParam int id) {
	
	System.out.println("emp deleted");
	dao.deleteById(id);
	
}

@RequestMapping("/getAll")
@ResponseBody
public List<Emp> getAll() {
	
	return dao.findAll();
}

@RequestMapping("/getById")
@ResponseBody
public List<Emp> getById(@RequestParam int id) {
	System.out.println("emp by id");
	return dao.empById(id);
	
}

@RequestMapping("/deleteAll")
@ResponseBody
public void deletetAll() {
	
	 dao.deleteAll();
}


}
