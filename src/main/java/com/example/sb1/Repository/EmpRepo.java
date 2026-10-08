package com.example.sb1.Repository;

import com.example.sb1.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer> {

}
