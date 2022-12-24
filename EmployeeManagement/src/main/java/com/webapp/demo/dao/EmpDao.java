package com.webapp.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.emp.Emp;

import jakarta.transaction.Transactional;

public interface EmpDao extends JpaRepository<Emp, Integer> {
	
	@Query(value="select * from emp where emp_id=?1",nativeQuery = true)
	List<Emp> empById(int id);
}
